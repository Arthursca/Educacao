package projeto.educacao.controller.TXR;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import projeto.educacao.model.TXR.DTO.TXRDTO;

import projeto.educacao.service.TXR.TXRService;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

@CrossOrigin
@RestController
@RequestMapping(value = "/txr")
public class TXRController {

    @Autowired
    private TXRService service;

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<TXRDTO> save(@Valid @RequestBody TXRDTO dto){
        return ResponseEntity.ok(service.save(dto));
    }

    @PostMapping (value = "/{path}")
    public ResponseEntity<String> saveXLSXbyPath(String path, Long ano){
        return ResponseEntity.ok(service.saveXLSXbyPath(path , ano));
    }

    @PostMapping
    public ResponseEntity<TXRDTO> saveList(ArrayList<String> s, Long ano){
        return ResponseEntity.ok(service.saveList(s, ano));
    }

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<TXRDTO>> findAll(){
        return ResponseEntity.ok(service.findAll());
    }

}
