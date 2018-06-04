package com.projeto.variaveisjava;

public class Variavel
{
	// Variáveis

	// Byte - Números ( 1 , 2 , 10 )
	// Int - Números ( 1000, 2000, 3000 )
	// Long - Números ( 1000000000 )

	// Float - Números Decimais ( 1.2, 3.3211 )
	// Double - Números Decimais ( 3.32137451 )

	// Boolean - Valores booleanos ( true / false )

	// String - Textos ( "Lucas", "Café", "Jogos")

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
	
		// <tipo> <nome>
		byte minhaVariavelByte = 2; // camelCase
		int minhaVariavelInt = 10000;
		long minhaVariavelLong = 100000000;
		
		float minhaVariavelFloat = 1.2f;
		double minhaVariavelDouble = 1.27343745;
		
		boolean minhaVariavelBoolean = false;
		
		String minhaVariavelString = "Lucas";

		System.out.println(minhaVariavelByte);
		System.out.println(minhaVariavelInt);
		System.out.println(minhaVariavelLong);
		System.out.println(minhaVariavelFloat);
		System.out.println(minhaVariavelDouble);
		System.out.println(minhaVariavelString);

		// Concatenar
		System.out.println(minhaVariavelString + minhaVariavelByte);

		/*
			Questionario 2

			O que é variável?
				É um nome que referencia um espaco de memória, que pode armazenar valores de um determinado tipo.
			
			O tipo "int" é utilizado para armazenar:
				Números inteiros

			O tipo "String" é utilizado para armazenar:
				Textos
			

		
		*/

	}
}