
package com.portfolio.ism.repository;

import com.portfolio.ism.model.HabilidadTecnica;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HabilidadTecnicaRepository extends JpaRepository <HabilidadTecnica, Long> {
    
}
