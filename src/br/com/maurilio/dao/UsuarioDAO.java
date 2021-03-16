package br.com.maurilio.dao;

import java.util.ArrayList;
import java.util.List;

import br.com.maurilio.web.Usuario;

public class UsuarioDAO implements IUsuario{
	private List<Usuario> listaUsuarios = new ArrayList<Usuario>();
	
	@Override
	public void cadastrarUsuario(Usuario usuario) {
		System.out.println("Nome da pessoa: " + usuario.getNome());
		listaUsuarios.add(usuario);

		
	}

	@Override
	public void consultarUsuario(String idReceitaFederal) {
	
		
	}

	@Override
	public void excluirUsuario(String idReceitaFederal) {

		
	}

	@Override
	public List<Usuario> listarUsuarios() {
		
		return listaUsuarios;
	}

	public List<Usuario> getListaUsuarios() {
		return listaUsuarios;
	}

	public void setListaUsuarios(List<Usuario> listaUsuarios) {
		this.listaUsuarios = listaUsuarios;
	}

}
