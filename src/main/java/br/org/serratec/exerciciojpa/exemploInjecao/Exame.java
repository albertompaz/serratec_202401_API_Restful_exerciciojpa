package br.org.serratec.exerciciojpa.exemploInjecao;

import org.springframework.stereotype.Component;

@Component
public class Exame {

	public Double calcularExame(Double valor) {
		valor = valor*1.05;
		return valor;
	}
	
}
