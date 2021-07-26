package projeto.educacao.controller.municipio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import projeto.educacao.model.municipio.DTO.MunicipioDTO;

import projeto.educacao.service.municipio.MunicipioService;

import javax.validation.Valid;
import java.util.ArrayList;


@CrossOrigin
@RestController
@RequestMapping(value = "/municipio")
public class MunicipioController {

    @Autowired
    private MunicipioService service;

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<MunicipioDTO> save(@Valid @RequestBody MunicipioDTO dto){
        return ResponseEntity.ok(service.save(dto));
    }

    @PostMapping (value = "/{path}")
    public ResponseEntity<String> saveXLSXbyPath(String path){
        return ResponseEntity.ok(service.saveXLSXbyPath(path));
    }

    @PostMapping
    public ResponseEntity<MunicipioDTO> saveList(ArrayList<String> s){
        return ResponseEntity.ok(service.saveList(s));
    }
}
