package br.com.erickfreire.aritmeticamaiormenor;

import java.util.Scanner;

public class AritmeticaMaiorMenor {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int numero1;
		int numero2;
		int numero3;
		
		System.out.println("Programa que calcula a Aritmética e mostra o Maior e Menor Valor: ");
		System.out.print("Digite o primeiro valor: ");
		numero1 = entrada.nextInt();
		
		System.out.print("Digite o segundo valor: ");
		numero2 = entrada.nextInt();
		
		System.out.print("Digite o terceiro valor: ");
		numero3 = entrada.nextInt();
		
		System.out.printf("Soma: %d%n", numero1 + numero2 + numero3);
		System.out.printf("Média: %d%n", ((numero1 + numero2 + numero3)/3));
		System.out.printf("Produto: %d%n", numero1 * numero2 * numero3);
		
		if(numero1 > numero2)
			if(numero1 > numero3)
				System.out.printf("O numero %d é o maior%n", numero1);
		
		if(numero2 > numero1)
			if(numero2 > numero3)
				System.out.printf("O numero %d é o maior%n", numero2);
		
		if(numero3 > numero1)
			if(numero3 > numero2)
				System.out.printf("O numero %d é o maior%n", numero3);
		
		if(numero1 < numero2)
			if(numero1 < numero3)
				System.out.printf("O numero %d é o menor%n", numero1);
		
		if(numero2 < numero1)
			if(numero2 < numero3)
				System.out.printf("O numero %d é o menor%n", numero2);
		
		if(numero3 < numero1)
			if(numero3 < numero2)
				System.out.printf("O numero %d é o menor%n", numero3);

	}

}
