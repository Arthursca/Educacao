package projeto.educacao.mapper.municipio;

import org.springframework.stereotype.Component;
import projeto.educacao.model.municipio.DTO.MunicipioDTO;
import projeto.educacao.model.municipio.Municipio;
import projeto.educacao.model.txr.TXR;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class MunicipioMapper {

    public Municipio toEntity(MunicipioDTO dto){
        Municipio municipio = new Municipio();
        municipio.setId(dto.getId());
        municipio.setCodMunicipio(dto.getCodMunicipio());
        municipio.setNomeMunicipio(dto.getNomeMunicipio());
        municipio.setDependenciaAdm(dto.getDependenciaAdm());
        municipio.setLocalizacao(dto.getLocalizacao());
        municipio.setRegiao(dto.getRegiao());
        municipio.setUF(dto.getUF());
        return municipio;
    }

    public MunicipioDTO toDTO(Municipio municipio){
        MunicipioDTO dto = new MunicipioDTO();
        dto.setId(municipio.getId());
        dto.setCodMunicipio(municipio.getCodMunicipio());
        dto.setNomeMunicipio(municipio.getNomeMunicipio());
        dto.setDependenciaAdm(municipio.getDependenciaAdm());
        dto.setLocalizacao(municipio.getLocalizacao());
        dto.setRegiao(municipio.getRegiao());
        dto.setUF(municipio.getUF());
        return dto;
    }

    public List<MunicipioDTO> toDTO(List<Municipio>list){
        return list.stream().map(this::toDTO).collect(Collectors.toList());
    }

    public Municipio ListtoEntity(ArrayList<String> list) {
        Municipio municipio = new Municipio();
        municipio.setRegiao(list.get(1));
        municipio.setUF(list.get(2));
        municipio.setCodMunicipio(Long.parseLong(String.valueOf((long)(Double.parseDouble(list.get(3))))));
        municipio.setNomeMunicipio(list.get(4));
        municipio.setLocalizacao(list.get(5));
        municipio.setDependenciaAdm(list.get(6));
        return municipio;
    }
}
