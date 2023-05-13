
package com.portfolio.ism.service;

import com.portfolio.ism.model.DescripcionEducacion;
import java.util.List;


public interface IDescripcionEducacionService {
    
    public List <DescripcionEducacion> verDescripcionEducacion();
    
    public void crearDescripcionEducacion(DescripcionEducacion descedu);
    
    public void borrarDescripcionEducacion(Long id);
    
    public void editarDescripcionEducacion(DescripcionEducacion descedu);
    
}
