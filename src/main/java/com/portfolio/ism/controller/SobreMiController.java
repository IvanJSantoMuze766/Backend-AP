
package com.portfolio.ism.controller;

import com.portfolio.ism.model.SobreMi;
import com.portfolio.ism.service.ISobreMiService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@CrossOrigin({"http://localhost4200",https://frontend-ism.web.app})
public class SobreMiController {
    
    @Autowired
    public ISobreMiService sobremiServ;
    
    @GetMapping ("/sobremi/ver")
    @ResponseBody
    public List <SobreMi> verSobreMi () {
        return sobremiServ.verSobreMi();
    }
    
    @PostMapping ("/sobremi/crear")
    public void crearSobreMi(@RequestBody SobreMi sobrem) {
        sobremiServ.crearSobreMi(sobrem);
    }
    
    @DeleteMapping ("/sobremi/borrar/{id}")
    public void borrarSobreMi(@PathVariable Long id) {
        sobremiServ.borrarSobreMi(id);
    }
    
    @PutMapping ("/sobremi/editar/")
    public void editarSobreMi(@RequestBody SobreMi sobrem) {
        sobremiServ.editarSobreMi(sobrem);
    }
    
}
