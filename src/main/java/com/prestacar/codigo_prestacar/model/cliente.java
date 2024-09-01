
package com.prestacar.codigo_prestacar.model;

//En la entidad cliente, se almacenarán los datos personales del cliente.

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

  @Entity
  @Data 
  
public class cliente {
      @Id
      @Column
      private Long Idcliente;
      
      @Column
      private  String nombre;
      
      @Column
      private  String apellido;
      
      @Column
      private  String email;
      
      @Column
      private  String direccion;
      
      @Column
      private Long telefono;
      
      
      
      
              
      
    
}
