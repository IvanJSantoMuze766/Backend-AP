package com.portfolio.ism.Repository;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.portfolio.ism.Entity.Proyecto;

@Repository
public interface RProyectos extends JpaRepository<Proyecto, Integer>{
    public Optional<Proyecto> findByNombreP(String nombreP);
    public boolean existsByNombreP(String nombreP);
}