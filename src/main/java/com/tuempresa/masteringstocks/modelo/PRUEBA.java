package com.tuempresa.masteringstocks.modelo;

import javax.persistence.*;

import org.openxava.annotations.*;

import lombok.*;
 
@Entity  

@Getter @Setter 
public class PRUEBA{
 
	
	@Id @Column(length=9)
    int numero;


    @Column(length=50)
    @Required  
    String nombre;
    
    @Column(length=50) @Required
    String descripcion;
    
    @Column(length=20) @Required
    String cantidad;
    
    //SE AGREGO LA SIGUIENTE LINEAS DE CODIGO
    
    @Column(length=20) @Required
    String SEXO;
    
 
    
    //descomentar PARA tERMKNAR PROYECTO
    
    //@Column(length=50)
    //@Required
    //String Direccion;
}