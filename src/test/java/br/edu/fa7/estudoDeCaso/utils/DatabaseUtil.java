package br.edu.fa7.estudoDeCaso.utils;

import br.edu.fa7.estudoDeCaso.dao.UsuarioDAO;
import br.edu.fa7.estudoDeCaso.modelo.Usuario;


public class DatabaseUtil {

	public static void populaBanco() {
		UsuarioDAO dao = new UsuarioDAO();
		Usuario usuario = new Usuario("Sofia", "qwerty");
		dao.apagar();
		dao.inserir(usuario);
	}
}
