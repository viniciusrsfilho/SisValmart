/**
 * A classe LsiProjectApplication criada no pacote com.sisValmart.lsiProject

 * que tem um metodo stattic main responsavel pela execução do aplicativo  
 */
package com.sisValmart.lsiProject;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
/**
 * 
 * @author vinicius; sezinando; rodrigo; diego
 *
 */

@SpringBootApplication
public class LsiProjectApplication {
	
	/** O metodo principal static main que recebe um parametro que será executado ao
	 * inicializar o aplicativo
	 * 
	 * @param args
	 */

	public static void main(String[] args) {
		SpringApplication.run(LsiProjectApplication.class, args);
	}
}
