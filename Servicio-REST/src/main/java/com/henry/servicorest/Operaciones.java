package com.henry.servicorest;

public class Operaciones {
	
	private final double num1, num2;
	private double resultado;
	
	public Operaciones(double num1, double num2) {
		this.num1 = num1;
		this.num2 = num2;
	}
	
	public double getNum1() {
		return num1;
	}
	public double getNum2() {
		return num2;
	}
	
	public double Suma (double num1, double num2) {
		resultado = num1 + num2;
		return resultado;
	}
	
	public double Resta (double num1, double num2) {
		resultado = num1 - num2;
		return resultado;
	}
	
	public double Multi (double num1, double num2) {
		resultado = num1 * num2;
		return resultado;
	}
	
	public double Division (double num1, double num2) {
		resultado = num1 / num2;
		return resultado;
	}
	
}
	


	