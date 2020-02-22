package aplicacao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dominio.Pessoa;

public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* 
		 * Incluir
		Pessoa p1  = new Pessoa(null, "Carlos da Silva", "carlos@gmail.com");
		Pessoa p2  = new Pessoa(null, "Joana da Silva", "joana@gmail.com");
		Pessoa p3  = new Pessoa(null, "Maria da Silva", "maria@gmail.com"); */
		
		/* em.getTransaction().begin();
		em.persist(p1);
		em.persist(p2);
		em.persist(p3);
		em.getTransaction().commit(); */
		
		
		/* Pesquisar
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
		EntityManager em = emf.createEntityManager();
		
		Pessoa p = em.find(Pessoa.class, 2);
		System.out.println(p); */

		
		// Excluir
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
		EntityManager em = emf.createEntityManager();
		
		Pessoa p = em.find(Pessoa.class, 2);
		System.out.println(p); 
		
		em.getTransaction().begin();
		em.remove(p);
		em.getTransaction().commit();
		
		System.out.println("Pronto !");
		em.close();
		emf.close();
		

	}

}
