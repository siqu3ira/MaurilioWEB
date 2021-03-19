package br.com.maurilio.web;

import java.util.Scanner;

public class Exercicio6 {
	public static void menu() {

		System.out.println("----------------------Filmes Disponiveis----------------\n");
		System.out.println("                         1. Star Wars                     ");
		System.out.println("                         2. Matrix                        ");
		System.out.println("                         3. O Exterminador do Futuro      ");
		System.out.println("                         4. O Jogo da Imitacao            ");
		System.out.println("                         5. Sair                          ");
		System.out.println("                        Escolha o filme que deseja ver:    ");

	}

	public static void main(String[] args) {
		int escolha = 0;
		Scanner s = new Scanner(System.in);
		do {
			menu();
			escolha = s.nextInt();
			switch (escolha) {
			case 1:
				StarWars();
				break;
			case 2:
				Matrix();
				break;
			case 3:
				OExterminadordoFuturo();
				break;
			case 4:
				OJogodaImitacao();
				break;
			case 5:
				Sair();
				break;

			default:
				System.out.println("Opcao invalida, tente outra vez");
				break;
			}
		} while (escolha != 5);
		s.close();
		
	}

	public static void StarWars() {
		System.out.println("Voce escolheu o filme: Star Wars");

	}

	public static void Matrix() {
		System.out.println("Voce escolheu o filme: Matrix");

	}

	public static void OExterminadordoFuturo() {
		System.out.println("Voce escolheu o filme: O Exterminador do Futuro");

	}

	public static void OJogodaImitacao() {
		System.out.println("Voce escolheu o filme: O Jogo da Imitacao");

	}

	public static void Sair() {
		System.out.println("Obrigado por usar o Maurilio System!!");

	}


}
