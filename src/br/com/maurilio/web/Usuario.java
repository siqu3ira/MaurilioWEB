package br.com.maurilio.web;

import br.com.maurilio.dao.Pessoa;

public class Usuario extends Pessoa {
	private int idade;
    private boolean brasileiro;
    
	public void calcularDigitoVerificador() {

	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public boolean isBrasileiro() {
		return brasileiro;
	}

	public void setBrasileiro(boolean brasileiro) {
		this.brasileiro = brasileiro;
	}
	
}
