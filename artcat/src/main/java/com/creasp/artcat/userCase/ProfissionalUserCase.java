package com.creasp.artcat.userCase;

import com.creasp.artcat.core.entities.tb_principal.Profissional;
import com.creasp.artcat.dto.ProfissinalDTO;
import com.creasp.artcat.repositories.ProfissionalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProfissionalUserCase {
    @Autowired
    private ProfissionalRepository profissionalRepository;
    public List<Profissional> findAll(){
    List<Profissional> result = profissionalRepository.findAll();
    List<ProfissinalDTO> dto = result.stream().map(x -> new ProfissinalDTO(x)).toList();
    return result;
}

}
