package br.com.maurilio.web;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import br.com.maurilio.dao.UsuarioDAO;
import br.com.maurilio.dao.ValidacaoCpfDAO;

@ManagedBean(name = "indexMB")
@ViewScoped
public class Index {
	public int numero;
	private boolean condicao1;
	private boolean condicao2;
	private List<Usuario> listaUsuarios = new ArrayList<Usuario>();
	private Usuario usuario = new Usuario();
	private boolean condicao3;
	private UsuarioDAO usuarioDAO = new UsuarioDAO();
	private ValidacaoCpfDAO validarCpfDAO = new ValidacaoCpfDAO();
	private boolean resultado;
	private String mensagemDeValidacao;

	public void cadastrarUsuario() {
		System.out.println("Nome da pessoa: " + usuario.getNome());
		usuarioDAO.cadastrarUsuario(usuario);	
		usuario = new Usuario();
		consultarUsuarios();

	}
	public void validarCpf() {
		resultado  = validarCpfDAO.isCPF(usuario.getIdReceitaFederal());
		System.out.println("CPF valido " + resultado);
		if (resultado == false) {
		mensagemDeValidacao = "CPF invalido";
		}
	}
	public void consultarUsuarios() {
		setListaUsuarios(usuarioDAO.listarUsuarios());
	}

	public void combinar() {
		condicao3 = condicao1 || condicao2;
	}

	public void removerEstrangeiros() {
		Iterator<Usuario> usuarioIterator = listaUsuarios.iterator();
		while (usuarioIterator.hasNext()) {
			Usuario usuario = usuarioIterator.next();
			if (!usuario.isBrasileiro()) {
				usuarioIterator.remove();
				System.out.println("Removendo usuario: " + usuario.getNome());
			}
		}

	}

	public void imprimirTabuada() {
		tabuada(getNumero());
	}

	public void tabuada(int idade) {
		for (int i = 1; i <= 10; i++) {
			System.out.println(numero + " x " + i + " = " + numero * i);
		}
	}

	public List<Usuario> getListaUsuarios() {
		return listaUsuarios;
	}

	public void setListaUsuarios(List<Usuario> listaUsuarios) {
		this.listaUsuarios = listaUsuarios;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public boolean isCondicao1() {
		return condicao1;
	}

	public void setCondicao1(boolean condicao1) {
		this.condicao1 = condicao1;
	}

	public boolean isCondicao2() {
		return condicao2;
	}

	public void setCondicao2(boolean condicao2) {
		this.condicao2 = condicao2;
	}

	public boolean isCondicao3() {
		return condicao3;
	}

	public void setCondicao3(boolean condicao3) {
		this.condicao3 = condicao3;
	}
	public boolean isResultado() {
		return resultado;
	}
	public void setResultado(boolean resultado) {
		this.resultado = resultado;
	}
	public String getMensagemDeValidacao() {
		return mensagemDeValidacao;
	}
	public void setMensagemDeValidacao(String mensagemDeValidacao) {
		this.mensagemDeValidacao = mensagemDeValidacao;
	}

}
