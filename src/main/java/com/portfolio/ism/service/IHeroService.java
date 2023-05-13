
package com.portfolio.ism.service;

import com.portfolio.ism.model.Hero;
import java.util.List;


public interface IHeroService {
    
    public List <Hero> verHero();
    
    public void crearHero(Hero her);
    
    public void borrarHero(Long id);
    
    public Hero buscarHero(Long id);
    
    public void editarHero(Hero her);
    
}
