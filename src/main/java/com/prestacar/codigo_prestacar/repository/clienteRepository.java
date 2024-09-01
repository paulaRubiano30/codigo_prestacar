
package com.prestacar.codigo_prestacar.repository;

//Se realizan las conexiones con la clase cliente.

import com.prestacar.codigo_prestacar.model.cliente;
import org.springframework.data.jpa.repository.JpaRepository;


public interface clienteRepository extends JpaRepository<cliente, Long>{
    
}
