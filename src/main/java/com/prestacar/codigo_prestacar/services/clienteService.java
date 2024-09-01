
package com.prestacar.codigo_prestacar.services;

//Se hace para modificar, actualizar y consultar las tablas.

import com.prestacar.codigo_prestacar.model.cliente;


public interface clienteService {
    cliente newcliente (cliente newcliente);
    Iterable<cliente> getAll();
    cliente modifycliente (cliente Cliente);
    Boolean deletecliente (Long idcliente);
    
}

