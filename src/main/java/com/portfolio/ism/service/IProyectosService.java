
package com.portfolio.ism.service;

import com.portfolio.ism.model.Proyectos;
import java.util.List;


public interface IProyectosService {
    
    public List <Proyectos> verProyectos();
    
    public void crearProyectos(Proyectos proy);
    
    public void borrarProyectos(Long id);
    
    public void editarProyectos(Proyectos proy);
    
}
