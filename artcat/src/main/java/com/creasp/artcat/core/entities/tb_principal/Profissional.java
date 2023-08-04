package com.creasp.artcat.core.entities.tb_principal;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.sql.Timestamp;
import java.time.LocalDate;

@ToString
@Data
@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = {"cpf"})
@Entity
@Table(name = "Pessoas")
public class Profissional implements Serializable {

        private static final long serialVersionUID = 1l;


        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Id
        private long id;

        private String name;
        private String lastName;
        private String email;

        private String cpf;
        private String registroCrea;
        private String genero;
        private String enderecos;
        private String contatos;
        private String longitude;
        private String latitude;

        //
//       @OneToMany(mappedBy = "enderecoCpf")
//        private List<Enderecos> enderecos1 = new ArrayList<>();
//
//        @OneToMany(mappedBy = "contatoCpf")
//        private List<Contatos> contatos1 = new ArrayList<>();
        private LocalDate dataDeNasc;
        private Timestamp dataDeCadastro;



}
