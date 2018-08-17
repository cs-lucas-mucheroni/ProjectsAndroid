package com.projeto.operadoresbasicos;

public class Operador
{
	// Somar (+)
	// Subtrair (-)
	// Multiplicação (*)
	// Divisão (/)
	// Módulo - resto da divisão (%)
	public static void main(String[] args)
	{
		int primeiro = 10;
		int segundo = 2;
		int resultado = 0;

		resultado = primeiro + segundo;
		resultado = primeiro - segundo;
		resultado = primeiro * segundo;
		resultado = primeiro / segundo;
		resultado = primeiro % segundo;

		System.out.println(resultado);
	}
}