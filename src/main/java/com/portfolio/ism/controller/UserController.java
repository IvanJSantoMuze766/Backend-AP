
package com.portfolio.ism.controller;

import com.portfolio.ism.model.User;
import com.portfolio.ism.service.IUserService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    
    @Autowired
    public IUserService userServ;
    
    @GetMapping ("/user/ver")
    @ResponseBody
    public List <User> verUser () {
        return userServ.verUser();
    }
    
    @PostMapping ("/user/crear")
    public void crearUser(@RequestBody User use) {
        userServ.crearUser(use);
    }
    
    @DeleteMapping ("/user/borrar/{id}")
    public void borrarUser(@PathVariable Long id) {
        userServ.borrarUser(id);
    }
    
    @PutMapping ("/user/editar")
    public void editarUser(@RequestBody User use) {
        userServ.editarUser(use);
    }
}
