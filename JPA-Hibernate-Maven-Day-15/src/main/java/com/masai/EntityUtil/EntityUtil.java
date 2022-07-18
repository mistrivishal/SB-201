package com.masai.EntityUtil;

import javax.persistence.*;

public class EntityUtil {

	private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("employee-unit");

	public static EntityManager getEntityManager() {

		return emf.createEntityManager();

	}

}
