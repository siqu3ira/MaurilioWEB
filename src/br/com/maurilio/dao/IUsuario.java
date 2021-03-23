package br.com.maurilio.dao;

import java.util.List;

import br.com.maurilio.web.Usuario;

public interface IUsuario {
	public void cadastrarUsuario(Usuario usuario);
	public Usuario consultarUsuario(String idReceitaFederal);
	public void excluirUsuario(String idReceitaFederal);
	public List<Usuario> listarUsuarios();
}
