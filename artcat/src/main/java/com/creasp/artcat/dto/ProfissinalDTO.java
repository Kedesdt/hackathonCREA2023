package com.creasp.artcat.dto;

import com.creasp.artcat.core.entities.tb_principal.Profissional;
import lombok.*;

import java.time.LocalDate;

@ToString
@Data
@Setter
@Builder
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class ProfissinalDTO {

private long id;
private String name;
private String lastName;
private String email;
private String cpf;
private LocalDate dataDeNasc;



    public ProfissinalDTO(Profissional cliente) {

        id = cliente.getId();
        name = cliente.getName();
        lastName = cliente.getLastName();
        email = cliente.getEmail();
        dataDeNasc = cliente.getDataDeNasc();
        cpf = cliente.getCpf();

       // Pessoas.builder().id(cliente.getId()).name(cliente.getName()).build();

        
        
    }
}