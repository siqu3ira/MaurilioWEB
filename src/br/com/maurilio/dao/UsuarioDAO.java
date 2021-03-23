package br.com.maurilio.dao;

import java.util.ArrayList;
import java.util.Iterator;
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
	public Usuario consultarUsuario(String idReceitaFederal) {
		Iterator<Usuario> usuarioIterator = listaUsuarios.iterator();
		while (usuarioIterator.hasNext()) {
			Usuario usuario = usuarioIterator.next();
			if (usuario.getIdReceitaFederal().equals(idReceitaFederal)) {
				return usuario;
			}
		}
		return new Usuario();
		
	}

	@Override
	public void excluirUsuario(String idReceitaFederal) {
		Iterator<Usuario> usuarioIterator = listaUsuarios.iterator();
		while (usuarioIterator.hasNext()) {
			Usuario usuario = usuarioIterator.next();
			if (usuario.getIdReceitaFederal().equals(idReceitaFederal)) {
				usuarioIterator.remove();
				System.out.println("Removendo usuario: " + usuario.getNome());
			}
		}
		
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
