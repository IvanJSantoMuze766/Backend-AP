
package com.portfolio.ism.service;

import com.portfolio.ism.model.Contacto;
import java.util.List;


public interface IContactoService {
    
    public List <Contacto> verContacto();
    
    public void crearContacto(Contacto cont);
    
    public void borrarContacto(Long id);
    
    public void editarContacto(Contacto cont);
    
}
