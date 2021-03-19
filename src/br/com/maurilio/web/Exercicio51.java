package br.com.maurilio.web;

import java.util.Scanner;

public class Exercicio51 {

		public static void main(String[] args) {
			int numero;
			Scanner s = new Scanner (System.in);
			System.out.println("Informe seu numero desejado: ");
			numero = s.nextInt();
			System.out.println("O quadrado do numero " + numero + " e " + numero * numero);
			s.close();

	}

}
