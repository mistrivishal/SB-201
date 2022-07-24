package com.masai.utility;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class UtilEntity {

	public static EntityManagerFactory emf = Persistence.createEntityManagerFactory("library-unit");

	public static EntityManager getEntityManager() {

		return emf.createEntityManager();
	}
}
