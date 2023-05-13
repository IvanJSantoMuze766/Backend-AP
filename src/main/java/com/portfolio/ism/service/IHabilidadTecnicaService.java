
package com.portfolio.ism.service;

import com.portfolio.ism.model.HabilidadTecnica;
import java.util.List;


public interface IHabilidadTecnicaService {
    
    public List <HabilidadTecnica> verHabilidadTecnica();
    
    public void crearHabilidadTecnica(HabilidadTecnica habtec);
    
    public void borrarHabilidadTecnica(Long id);
    
    public void editarHabilidadTecnica(HabilidadTecnica habtec);
    
}
