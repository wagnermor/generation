package org.generation.endpoint.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //Informa que é um controller
@RequestMapping("/hello_world")
public class endpointController {
	@GetMapping
	public String hello_world() {
		return "Hello World!";
	}
	
	@GetMapping("/mentalidades_bsm")
	public String mentalidades_bsm() {
		String printMentalidades = "";
		String mentalidades[] = {
				"COMUNICAÇÃO",
				"MENTALIDADE DE CRESCIMENTO",
				"ORIENTAÇÃO AO DETALHE",
				"ORIENTAÇÃO AO FUTURO",
				"PERSISTÊNCIA",
				"PROATIVIDADE",
				"RESPONSABILIDADE PESSOAL",
				"TRABALHO EM EQUIPE"
		};
		for(String mentalidade : mentalidades) {
			printMentalidades += "<p "
					+ "style='color:purple;"
					+ "font-family: sans-serif;"
					+ "font-weight: bold;"
					+ "text-align: center;'>" 
					+ mentalidade + "</p>";
		}
		return printMentalidades;
	}
	
	@GetMapping("/objetivos")
	public String objetivos() {
		String printObjetivos = "";
		String objetivosList[] = {
				"SPRINGBOOT + MAVEN",
				"REST API",
				"MODELAGEM DB"
		};
		for(String objetivo : objetivosList) {
			printObjetivos += "<p "
					+ "style='color:dodgerblue; "
					+ "font-family: sans-serif; "
					+ "text-align: center;'>" 
					+ objetivo + "</p>";
		}
		return printObjetivos;
	}
	
}
