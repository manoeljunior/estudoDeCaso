package br.edu.fa7.estudoDeCaso.bean;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import br.edu.fa7.estudoDeCaso.modelo.Usuario;
import br.edu.fa7.estudoDeCaso.negocio.LoginRN;

@ManagedBean (name = "loginBean")
@SessionScoped
public class LoginBean {

	private Usuario usuario = new Usuario();
	
	public Usuario getUsuario() {
		return usuario;
	}
	
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
			
	public String efetuarLogin() {
		LoginRN loginRN = new LoginRN();
		boolean acesso = loginRN.efetuarLogin(usuario);
		if (acesso) {
			return "imc.xhtml";
		} else
			FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "erro","Usuário/senha inválidos"));
		
		return null;
	}
	
}
