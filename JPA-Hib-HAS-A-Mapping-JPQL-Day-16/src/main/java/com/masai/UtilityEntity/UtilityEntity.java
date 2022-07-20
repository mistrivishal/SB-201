package com.masai.UtilityEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class UtilityEntity {

	public static EntityManagerFactory emf = Persistence.createEntityManagerFactory("HAS-A-Mapping-unit");

	public static EntityManager getEntityManager() {
		
		return emf.createEntityManager();
		
	}

}
