package com.creasp.artcat.controllers;

import com.creasp.artcat.core.entities.tb_principal.Profissional;
import com.creasp.artcat.dto.ProfissinalDTO;
import com.creasp.artcat.userCase.ProfissionalUserCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/profissional")
public class ProfissionalController {

    @Autowired
    private ProfissionalUserCase profissionalUserCase;

    @GetMapping
    public List<Profissional> findAll(){
        List<Profissional> result = profissionalUserCase.findAll();
       // List<ClienteDTO> dto = result.stream().map(Cliente -> new ClienteDTO(cliente)).toList();
        return result;
    }

}
