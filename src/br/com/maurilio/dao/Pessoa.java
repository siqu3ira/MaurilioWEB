package br.com.maurilio.dao;

public class Pessoa {
	private String nome;
	private String telefone;
	private String endereco;
	private String idReceitaFederal;
	private String cidadeNatal;
	public void calcularDigitoVerificador () {
		
	}
	public void formatarNumeroTelefone (String numeroTelefone) {
		setTelefone("9" + numeroTelefone);
		
	}
	public void formatarNumeroTelefone (int codigoArea) {
		setTelefone(String.valueOf(codigoArea) + this.telefone);
		
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getIdReceitaFederal() {
		return idReceitaFederal;
	}
	public void setIdReceitaFederal(String idReceitaFederal) {
		this.idReceitaFederal = idReceitaFederal;
	}
	public String getCidadeNatal() {
		return cidadeNatal;
	}
	public void setCidadeNatal(String cidadeNatal) {
		this.cidadeNatal = cidadeNatal;
	}
	
}
