
package com.portfolio.ism.service;

import com.portfolio.ism.model.Mensaje;
import java.util.List;


public interface IMensajeService {
    
    public List <Mensaje> verMensaje();
    
    public void crearMensaje(Mensaje men);
    
    public void borrarMensaje(Long id);
    
    public void editarMensaje(Mensaje men);
    
}
