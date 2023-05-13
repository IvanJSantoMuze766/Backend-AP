
package com.portfolio.ism.service;

import com.portfolio.ism.model.FraseContacto;
import java.util.List;


public interface IFraseContactoService {
    
    public List <FraseContacto> verFraseContacto();
    
    public void crearFraseContacto(FraseContacto fracon);
    
    public void borrarFraseContacto(Long id);
    
    public void editarFraseContacto(FraseContacto fracon);
    
}
