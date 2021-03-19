package br.com.maurilio.web;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		int numero;
		Scanner s = new Scanner(System.in);
		System.out.println("Informe seu numero escolhido: ");
		numero = s.nextInt();
		System.out.println("Segue a tabuada do " + numero + ": ");
		for (int i = 1; i <= 10; i++) {
			System.out.println(numero + " x " + i + " = " + numero * i);
		}
		s.close();
	}

	public static void ImprimirTabuada(int escolha) {
		switch (escolha) {
		case 1:
			System.out.println("Voce escolheu: " + escolha);
			break;
		case 2:
			System.out.println("Voce escolheu: " + escolha);
			break;
		case 3:
			System.out.println("Voce escolheu: " + escolha);
			break;
		case 4:
			System.out.println("Voce escolheu: " + escolha);
			break;
		case 5:
			System.out.println("Voce escolheu: " + escolha);
			break;
		case 6:
			System.out.println("Voce escolheu: " + escolha);
			break;
		case 7:
			System.out.println("Voce escolheu: " + escolha);
			break;
		case 8:
			System.out.println("Voce escolheu: " + escolha);
			break;
		case 9:
			System.out.println("Voce escolheu: " + escolha);
			break;
		case 10:
			System.out.println("Voce escolheu: " + escolha);
			break;
		default:
			System.out.println("Opcao invalida");
			break;
		}
	}
	public static void calcularOQuadrado() {
		int numero;
		Scanner s = new Scanner (System.in);
		System.out.println("Informe seu numero desejado: ");
		numero = s.nextInt();
		System.out.println("O quadrado do numero " + numero + " e " + numero * numero);
		s.close();
}
}
