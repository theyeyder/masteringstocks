package com.tuempresa.masteringstocks.modelo;

import java.math.*;
import java.time.*;

import javax.persistence.*;

import org.openxava.annotations.*;
import org.openxava.model.*;

import lombok.*;



@Entity @Getter @Setter
public class Factura extends Identifiable {
	
	@Column(length=50) @Required
	String descripcion;

	
	LocalDate fecha;
	
	BigDecimal ValorFac;
	BigDecimal Metros;
	
	
	//@Column(length=15) @Required
	  // int  precioCOP;
	    
	   // @Column(length=50) @Required
	  //  String  proveedor;
	    
	   // @Column(length=50) @Required
	  //  String  categoria;
	    
	   // @Column(length=15) @Required
	   // NIT;
	
	
	//@Column(length=15) @Required
	//int  precioCOP;
	
	//@Column(length=15) @Required
	//int  Nit;
}
