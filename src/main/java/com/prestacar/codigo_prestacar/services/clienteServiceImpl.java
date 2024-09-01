
package com.prestacar.codigo_prestacar.services;

// Se implemeentan los elementos CRUD.

import com.prestacar.codigo_prestacar.model.cliente;
import com.prestacar.codigo_prestacar.repository.clienteRepository;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class clienteServiceImpl implements clienteService{
    
    @Autowired
    private clienteRepository ClienteRepository;

    @Override
    public cliente newcliente(cliente newcliente) {
        return ClienteRepository.save(newcliente);
    }

    @Override
    public Iterable<cliente> getAll() {
        return this.ClienteRepository.findAll(); 
    }
    

    @Override
    public cliente modifycliente(cliente Cliente) {
        
        Optional<cliente> ClienteEncontrado= this.ClienteRepository.findById(Cliente.getIdcliente());
        if(ClienteEncontrado.get()!=null){
            ClienteEncontrado.get().setNombre(Cliente.getNombre());
            ClienteEncontrado.get().setApellido(Cliente.getApellido());
            ClienteEncontrado.get().setEmail(Cliente.getEmail());
            ClienteEncontrado.get().setDireccion(Cliente.getDireccion());
             ClienteEncontrado.get().setTelefono(Cliente.getTelefono());
             return this.newcliente(ClienteEncontrado.get());
        }
              
         return null; 
    }

    @Override
    public Boolean deletecliente(Long idcliente) {
        this.ClienteRepository.deleteById(idcliente); 
        return true;
        
    }
    
}
