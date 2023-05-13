
package com.portfolio.ism.repository;

import com.portfolio.ism.model.Mensaje;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MensajeRepository extends JpaRepository <Mensaje, Long>{
    
}
