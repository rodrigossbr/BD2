package br.com.bd2.main;

import java.util.ArrayList;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.bd2.entities.*;

public class MainHibernate {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("db2");
		EntityManager em = emf.createEntityManager();
	}
}
