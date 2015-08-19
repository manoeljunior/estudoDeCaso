package br.edu.fa7.estudoDeCaso.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.NoResultException;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import br.edu.fa7.estudoDeCaso.modelo.Usuario;

public class UsuarioDAO extends GenericDAO {

	public boolean validarUsuario(Usuario usuario) {
		EntityManager em = createEntityManager();
		EntityTransaction transaction = em.getTransaction();
		transaction.begin();
		
		System.out.println("validarUsuario");
		TypedQuery<Usuario> query = em.createQuery("select u from Usuario u where u.nome = :pNome and u.senha = :pSenha", Usuario.class);
		query.setParameter("pNome", usuario.getNome());
		query.setParameter("pSenha", usuario.getSenha());
		Usuario usr;
		try {
			usr = query.getSingleResult();
		} catch (NoResultException e) {
			usr = null;
		}
		transaction.commit();
		
		return (usr != null);
	}

	public void inserir(Usuario usuario) {
		EntityManager em = createEntityManager();
		EntityTransaction transaction = em.getTransaction();
		transaction.begin();
		em.persist(usuario);
		transaction.commit();
	}

	public void apagar() {
		EntityManager em = createEntityManager();
		EntityTransaction transaction = em.getTransaction();
		transaction.begin();
		Query query = em.createQuery("delete from Usuario");
		query.executeUpdate();
		transaction.commit();
	}

}
