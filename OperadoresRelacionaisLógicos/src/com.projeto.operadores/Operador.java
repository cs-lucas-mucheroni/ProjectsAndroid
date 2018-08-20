package com.projeto.operadores;

public class Operador
{

	// = (Atribuição)
	// == (Igual)
	// != (Diferente)
	// > (Maior)
	// < (Menor)
	// >= (Maior ou Igual)
	// <= (Menor ou Igual)

	// && (e) - para retornar `true` as duas condições precisam ser verdadeiros.
	// || (ou) - para retornar `true` pelo menos uma das condições precisa ser verdadeira.


	public static void main(Sctring[] args)
	{
		boolean resultado;
		int numero1 = 5;
		int numero2 = 5;

		resultado = 5 == 5;
		resultado = numero1 == numero2;
		resultado = numero1 != numero2;
		resultado = numero1 > numero2;
		resultado = numero1 < numero2;
		resultado = numero1 >= numero2;
		resultado = numero1 <= numero2;

		resultado = true && true; // resultado = true
		resultado = false && true; // resultado = false
		resultado = 1==1 && 2==2; // resultado = true
		resultado = 1==1 && 2==6; // resultado = false
		resultado = 1==6 && 2==6; // resultado = false


		resultado = true || true; // resultado = true
		resultado = false || true; // resultado = true
		resultado = 1==1 || 2==2; // resultado = true
		resultado = 1==1 || 2==6; // resultado = true
		resultado = 1==6 || 2==6; // resultado = false

		System.out.println(resultado);

		/*

			Questionário 3

			Supondo o seguinte teste: " 5==6 ", qual seria o resultado?
				False
			
			Supondo o seguinte teste utilizando operadores relacionais e lógicos " resultado = 1==1 && 2!=3 ",
			qual valor teríamos na variável "resultado"?
				Verdadeiro

			Supondo o seguinte teste utilizando operador relacional e lógico: " resultado = 1 >= 1 || 2 < 2 ",
			que valor teríamos na variável "resultado"?
				Verdadeiro

			Em java o sinal "=" é o mesmo que o sinal "==" ?
				False

		*/
	} 
}