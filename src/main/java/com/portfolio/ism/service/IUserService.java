
package com.portfolio.ism.service;

import com.portfolio.ism.model.User;
import java.util.List;


public interface IUserService {
    
    public List <User> verUser();
    
    public void crearUser(User use);
    
    public void borrarUser(Long id);
    
    public void editarUser(User use);
    
}
