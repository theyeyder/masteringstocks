package com.tuempresa.masteringstocks.run;

import org.openxava.util.*;

public class masteringstocks {

	public static void main(String[] args) throws Exception {
		DBServer.start("masteringstocks-db"); // Para usar NUESTRA propia base de datos comenta esta línea y NO OLVIDAR
												// CONFIFURAR
												// src/main/webapp/META-INF/context.xml
		AppServer.run("masteringstocks"); // Usa AppServer.run("") para QUE PUEDA funcionar en el contexto raíz
	}

}
