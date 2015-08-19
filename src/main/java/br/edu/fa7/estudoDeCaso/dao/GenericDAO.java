package br.edu.fa7.estudoDeCaso.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public abstract class GenericDAO {

	private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplodb");
	 
    protected EntityManager createEntityManager() {
        return emf.createEntityManager();
    }
 
    protected void closeEntityManager() {
        emf.close();
    }
}
