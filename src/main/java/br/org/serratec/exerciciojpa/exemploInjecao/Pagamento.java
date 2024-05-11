package br.org.serratec.exerciciojpa.exemploInjecao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Pagamento {

	@Autowired
	private Consulta consulta;
	
	@Autowired
	private Exame exame;
	
	public Double calcularProcedimento(Double valorConsulta, Double valorExame) {
		Double valorProcedimento = consulta.calcularConsulta(valorConsulta) + exame.calcularExame(valorExame);
		return valorProcedimento;
	}
	
}
