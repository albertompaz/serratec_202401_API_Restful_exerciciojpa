package br.org.serratec.exerciciojpa.exemploInjecao;

import org.springframework.stereotype.Component;

@Component
public class Consulta {

	public Double calcularConsulta(Double valor) {
		valor = valor*1.1;
		return valor;
	}
	
}
