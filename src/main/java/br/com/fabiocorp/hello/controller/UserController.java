package br.com.fabiocorp.hello.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.fabiocorp.hello.model.Usuario;

@RestController
public class UserController {
	
	// quero fazer um login mock
	
	@PostMapping("/login")
	public ResponseEntity<Usuario> fazerLogin(@RequestBody Usuario dadosLogin) {
		// testando se o usuario existe
		if (dadosLogin.getRacf().equals("fapimen")) {
			//usuario existe, testando se a senha confere
			if (dadosLogin.getSenha().equals("1234")) {
				
				//usuario existe, retorno 200-ok + o objeto usuario preenchido
				Usuario resposta = new Usuario();
				resposta.setId(62253);
				resposta.setNome("Fabio Pimentel");
				resposta.setEmail("fabio@fabio.com");
				resposta.setRacf("fapimen");
				resposta.setFuncional("006225361");
				resposta.setDepartamento("Treinamento DEV");
				return ResponseEntity.ok(resposta);
			}
			//senha não confere, retorno 401 *UnAuthorized
			return ResponseEntity.status(401).build();
		}
		//usuario não existe, retorno codigo http 404
		return ResponseEntity.status(404).build();
	}

}
