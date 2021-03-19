package br.com.maurilio.web;

import java.util.Scanner;

public class exercicio62 {

	public static void main(String[] args) {
		int numero;
		Scanner s = new Scanner (System.in);
		System.out.println("Digite um numero a seguir: ");
		numero = s.nextInt();
		imprimirNumerosInteiros (numero); 
		s.close();
}
	public static void imprimirNumerosInteiros (int numero) {
		int i = 1;
		
		do {
			parOuImpar(i);
			i++;
		} while (i <= numero);
	}
	public static void parOuImpar (int i) {
		boolean resto = i %2 == 0;
		if (resto) {
			System.out.println("O numero " + i + " e par");
		} else {
			System.out.println("O numero " + i + " e impar");
	}
}
}
