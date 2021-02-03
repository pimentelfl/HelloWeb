package br.com.fabiocorp.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/* ao incluir a anotação @RestController, eu habilito a minha classe a atender solicitações
 * web
 * Cada um dos métodos desta classe pode atender uma solicitação via URL
 * 
 * endereço da maquina é: localhost
 * porta padrão do tomcat é 8080
 * 
 * basta, então, definir os recursos
 */
@RestController
public class HelloController {
	
	@GetMapping("/hello")	
	public String sayHello() {
		return "Hello World! Meu primeiro projeto!";
	}
	
}
