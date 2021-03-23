package br.com.maurilio.web;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		int numero;
		Scanner s = new Scanner(System.in);
		System.out.println("Informe seu numero escolhido: ");
		numero = s.nextInt();
		ImprimirTabuada(numero);
		s.close();
	}

	public static void ImprimirTabuada(int numero) {
		if (numero <= 10) {
			System.out.println("Segue a tabuada do " + numero + ": ");
			for (int i = 1; i <= 10; i++) {
				System.out.println(numero + " x " + i + " = " + numero * i);
			}
		}

		else {
			System.out.println("Numero informado invalido");
		}
	}
}