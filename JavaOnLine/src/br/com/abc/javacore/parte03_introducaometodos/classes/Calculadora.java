package br.com.abc.javacore.parte03_introducaometodos.classes;

//Aula 27 - introdução métodos
//Aula 28 - métodos com parâmetros
//Aula 29 - retorno nos métodos
//Aula 30 - retono de métodos
//Aula 31 - Métodos com parâmetros tipo reference
public class Calculadora
{
	// [visibilidade ou acesso do método] --- [tipo de retorno] -- [nome do
	// método ou identificador](){}
	// CamelCase - convenção Java
	public void somaDoisNumeros()
	{
		System.out.println(5 + 5);
	}

	public void subtraiDoisNumeros()
	{
		System.out.println(5 - 5);
	}

	public void multiplicaDoisNumeros(int num1, int num2)
	{
		System.out.println(num1 * num2);
		// Esses valores que são passados por apenas no método eles são chamados
		// de PARÂMETROS e estão contidas apenas
		// dentro deste escopo ou método (locais). Quando passar o valor os
		// valores são passados no momento da execução esses valores são
		// chamados de ARGUMENTO.
		// Caso a quantidade argumentos for diferente da explicitada pelo
		// assinatura do método, irá causar um erro de compilação. Da mesma
		// forma que se for passado um valor do tipo diferente do especificado
		// int -> true.
	}

	public void multiplicaDoisNumeros(double num1, int num2)
	{
		System.out.println(num1 * num2);
	}

	public double divideDoisNumeros(double num1, double num2)
	{
		// Para divisão por 0 devemos tratar esse erro:
		if (num2 != 0)
		{
			// double resultado = num1/num2;
			// return resultado
			// E após essa instrução, nada poderá executado, o que pode causar
			// um erro de compilação.
			// O tipo de retorno deve ser compatível com o tipo declarado na
			// assinatura do método.
			//
			// Como não é possível usar o break em estruturas condicionais, pode
			// ser usado apenas o return 0;
			//
			// System.out.println(num1 / num2);
			// return;
			return (num1 / num2); // forma mais objetiva.
		}
		else
		{
			return 0;
		}
	}
	
	public void mudaDoisNumeros(int num1, int num2)
	{
		num1 = 30;
		num2 = 40;
		System.out.println("num1: "+num1);	
		System.out.println("num2: "+num2);	
		System.out.println("Dentro do muda dois números");
	}
}