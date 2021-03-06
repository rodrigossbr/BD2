package br.com.bd2.hibernate.model;
import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TesteBD2 {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("BD2");
		EntityManager em = emf.createEntityManager();

		ArrayList<Dependente> d = new ArrayList<Dependente>();
		Pessoa p = new Pessoa("Gilberto M�ller");
		Dependente d1 = new Dependente("Jamile");
		Dependente d2 = new Dependente("Est�fane");
		d1.setPessoa(p);
		d2.setPessoa(p);
		d.add(d1);
		d.add(d2);
		p.setDependentes(d);

		em.getTransaction().begin();
		em.persist(d1);
		em.persist(d2);
		em.persist(p);
		em.getTransaction().commit();
        
		// Observe o id 50L
		p = em.find(Pessoa.class, 50L);
		for(Dependente dependentes: p.getDependentes())
			System.out.println("Dependente: " + dependentes.getNome());		
	}
}
