
package com.portfolio.ism.repository;

import com.portfolio.ism.model.DescripcionEducacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DescripcionEducacionRepository extends JpaRepository <DescripcionEducacion, Long> {
    
}
