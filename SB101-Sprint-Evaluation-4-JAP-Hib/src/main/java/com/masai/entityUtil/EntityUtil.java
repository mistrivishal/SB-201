package com.masai.entityUtil;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EntityUtil {
	
	public static EntityManagerFactory emf = Persistence.createEntityManagerFactory("account-unit");
	
	public static EntityManager getEntitymanager () {
		
		return emf.createEntityManager();
		
	}
	
	
	
}
