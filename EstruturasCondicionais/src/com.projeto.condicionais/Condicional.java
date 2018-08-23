package com.projeto.condicionais;

public class Condicional
{
	public static void main(String[] args)
	{	
		// if = se
		// else = senão

		// Irá retornar a mensagem abaixo, pois dentro da condição estamos passando que a informação já é verdadeira
		if( true )
		{
			System.out.println("Verdadeiro");
		}

		// Não irá retornar a informação, pois dentro da condição estamos passando que a informação é falsa
		if( false ) 
		{
			System.out.println("Verdadeiro");
		}

		boolean teste=true;
		// Irá retornar a mensagem abaixo, pois dentro da condição estamos passando que a informação já é verdadeira
		if( teste )
		{
			System.out.println("Verdadeiro");
		}
		
		boolean teste=false;
		// Não irá retornar a informação, pois dentro da condição estamos passando que a informação é falsa
		if( teste ) 
		{
			System.out.println("Verdadeiro");
		}

		// Não irá retornar a informação, pois dentro da condição estamos passando uma informação falsa
		if( 3==4 ) 
		{
			System.out.println("Verdadeiro");
		}

		// Irá retornar a mensagem abaixo, pois dentro da condição estamos passando uma informação verdadeira
		if( 3==3 )
		{
			System.out.println("Verdadeiro");
		}

		// Não irá retornar a informação, pois dentro da condição estamos passando uma informação falsa
		if( 3>4 && 2>5 ) 
		{
			System.out.println("Verdadeiro");
		}

		// Irá retornar a mensagem abaixo, pois dentro da condição estamos passando uma informação verdadeira
		if( 7>4 && 8>5 ) ou if( 7>4 || 8>5 ) ou if( 2>4 || 8>5 )
		{
			System.out.println("Verdadeiro");
		}

		if( true || false )
		{
			System.out.println("Verdadeiro");
		}else
		{
			System.out.println("Falso");
		}

		int media = 6;
		if( media < 6 )
		{
			System.out.println("Reprovado");
		}else if ( media >= 6 && media <= 8 )
		{
			System.out.println("Aprovado");
		}else if ( media > 8 )
		{
			System.out.println("Aprovado - Excelente");
		}
	}
}