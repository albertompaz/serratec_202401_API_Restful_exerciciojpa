package br.org.serratec.exerciciojpa.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/propriedade")
public class PropriedadeController {
	
	@Value("${minha-propriedade}")
	private String propriedade;
	
	@GetMapping
	public String retornaMinhaPropriedade() {
		return propriedade;
	}
	
}
