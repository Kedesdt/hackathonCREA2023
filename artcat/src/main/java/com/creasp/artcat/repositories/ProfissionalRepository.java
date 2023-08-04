package com.creasp.artcat.repositories;

import com.creasp.artcat.core.entities.tb_principal.Profissional;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProfissionalRepository extends JpaRepository<Profissional,String> {
}
