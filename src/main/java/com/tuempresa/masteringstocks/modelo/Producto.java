package com.tuempresa.masteringstocks.modelo;
 
import javax.persistence.*;

import org.openxava.annotations.*;

import lombok.*;
 
@Entity @Getter @Setter
public class Producto {
 
    @Id @Column(length=15)
    int numero;
   
    @Column(length=50) @Required
    String descripcion;
    
    @Column(length=20) @Required
    String cantidad;
    
    @Column(length=15) @Required
   int  precioCOP;
    
    @Column(length=50) @Required
    String  proveedor;
    
    @Column(length=50) @Required
    String  categoria;
    
    @Column(length=15) @Required
    int  talla;
}