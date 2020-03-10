package com.henry.servicorest;


import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControladorSaludo {

	private static final String template = "Hola, %s!";
	private final AtomicLong counter = new AtomicLong();
	
	Operaciones operaciones = new Operaciones(0, 0);
	

	@GetMapping("/saludo")
	public Saludo saludo(@RequestParam(value = "name", defaultValue = "Mundo") String name) {
			return new Saludo(counter.incrementAndGet(), String.format(template, name));
	}
	
	@GetMapping("/suma")//SUMAAAAAA
	public String suma(@RequestParam(value = "num1") String num1, 
			@RequestParam(value = "num2") String num2) {
			return "PRIMER VALOR:"+num1+ "   SEGUNDO VALOR:"+num2+"   SUMA:"
			+operaciones.Suma(Double.parseDouble(num1), Double.parseDouble(num2));
	}

	@GetMapping("/resta")
	public String resta(@RequestParam(value = "num1") String num1, 
			@RequestParam(value = "num2") String num2) {
			return "PRIMER VALOR:"+num1+ "   SEGUNDO VALOR:"+num2+"   RESTA:"
			+operaciones.Resta(Double.parseDouble(num1), Double.parseDouble(num2));
	}
	
	@GetMapping("/multiplicacion")
	public String multiplicacion(@RequestParam(value = "num1") String num1, 
			@RequestParam(value = "num2") String num2) {
			return "PRIMER VALOR:"+num1+ "   SEGUNDO VALOR:"+num2+"   MULTIPLICACION:"
			+operaciones.Resta(Double.parseDouble(num1), Double.parseDouble(num2));
	}
	
	@GetMapping("/division")
	public String division(@RequestParam(value = "num1") String num1, 
			@RequestParam(value = "num2") String num2) {
			return "PRIMER VALOR:"+num1+ "   SEGUNDO VALOR:"+num2+"   DIVISION:"
			+operaciones.Resta(Double.parseDouble(num1), Double.parseDouble(num2));
	}
}


	
	

	
	