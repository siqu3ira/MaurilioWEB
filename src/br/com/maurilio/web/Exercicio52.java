package br.com.maurilio.web;

import java.util.Scanner;

public class Exercicio52 {

	public static void main(String[] args) {
		int numero;
		Scanner s = new Scanner(System.in);
		System.out.println("Digite um numero a seguir: ");
		numero = s.nextInt();
		s.close();
		parOuImpar(numero);
	}

	public static void parOuImpar(int numero) {
		boolean resto = numero % 2 == 0;
		if (resto) {
			System.out.println("O numero " + numero + " e par");
		} else {
			System.out.println("O numero " + numero + " e impar");
		}
	}
}
