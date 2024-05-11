package br.org.serratec.exerciciojpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.org.serratec.exerciciojpa.exemploInjecao.Pagamento;

@SpringBootApplication
public class ExerciciojpaApplication implements CommandLineRunner {

	@Autowired
	private Pagamento pagamento;
	
	public static void main(String[] args) {
		SpringApplication.run(ExerciciojpaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Total a pagar: " + pagamento.calcularProcedimento(100.0, 100.0));
	}

}
