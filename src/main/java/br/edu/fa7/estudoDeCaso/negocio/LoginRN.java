package br.edu.fa7.estudoDeCaso.negocio;

import br.edu.fa7.estudoDeCaso.dao.UsuarioDAO;
import br.edu.fa7.estudoDeCaso.modelo.Usuario;

public class LoginRN {

	public boolean efetuarLogin(Usuario usuario) {
		UsuarioDAO dao = new UsuarioDAO();
				
		return dao.validarUsuario(usuario);
	}

	
}
