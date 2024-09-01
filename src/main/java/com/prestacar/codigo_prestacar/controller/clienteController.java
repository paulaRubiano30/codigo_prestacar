
package com.prestacar.codigo_prestacar.controller;

//Se llaman los métodos para llevar a cabo la counicación a través de la web.

import com.prestacar.codigo_prestacar.model.cliente;
import com.prestacar.codigo_prestacar.services.clienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/Cliente")
public class clienteController {
    
    @Autowired
    private clienteService ClienteService;
    
    @PostMapping("/nuevo")
    public cliente newcliente(@RequestBody cliente newcliente){
        return this.ClienteService.newcliente(newcliente);
    }
    
    @GetMapping ("/mostrar")
    public Iterable<cliente> getAll(){
        return ClienteService.getAll();
    }
    
    @PostMapping("/modificar")
    public cliente updatecliente (@RequestBody cliente Cliente){
        return this.ClienteService.modifycliente(Cliente);
    }
    
    @PostMapping (value="/{id}")
           
    public Boolean deletecliente(@PathVariable(value="id")Long id){
        return this.ClienteService.deletecliente(id);
    }
    
    
    
}
