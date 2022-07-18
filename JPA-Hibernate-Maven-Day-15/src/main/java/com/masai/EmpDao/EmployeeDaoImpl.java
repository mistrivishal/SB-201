package com.masai.EmpDao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.masai.EmployeeException.EmployeeException;
import com.masai.EntityUtil.EntityUtil;
import com.masai.employeeBean.Employee;

public class EmployeeDaoImpl implements EmployeeDao {

	@Override
	public String insertEmployee(Employee e) {
		String s = "Not Inserted..";

		EntityManager em = EntityUtil.getEntityManager();

		if (e != null) {
			em.getTransaction().begin();

			em.persist(e);

			em.getTransaction().commit();

			s = "Employee data inserted Successfully..";

			em.close();
		} else {
			s = "do not pass null value";
		}

		return s;

	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Employee> getAllEmployee() {

		EntityManager em = EntityUtil.getEntityManager();

		Query q = em.createQuery("From Employee", Employee.class);

		return q.getResultList();

	}

	@Override
	public String getAddressOfEmployee(int empId) {

		EntityManager em = EntityUtil.getEntityManager();

		Employee e = em.find(Employee.class, empId);

		return e.getAddress();

	}

	@Override
	public String giveBonusToEmployee(int empId, int bonus) {

		String s = "EMployee not found..";

		EntityManager em = EntityUtil.getEntityManager();

		Employee e = em.find(Employee.class, empId);

		if (e != null) {
			em.getTransaction().begin();

			e.setSalary(e.getSalary() + bonus);

			em.persist(e);

			s = "Bonus credited successfully..";

			em.getTransaction().commit();
		}

		em.close();

		return s;

	}

	@Override
	public boolean deleteEmployee(int empId) {

		boolean flag = false;

		EntityManager em = EntityUtil.getEntityManager();

		Employee e = em.find(Employee.class, empId);

		if (e != null) {

			em.getTransaction().begin();

			em.remove(e);

			em.getTransaction().commit();

			flag = true;
		}

		em.close();
		return flag;
	}

	@Override
	public String[] getNameAndAddress(int empId) {

		String[] s = new String[2];

		EntityManager em = EntityUtil.getEntityManager();

		Employee e = em.find(Employee.class, empId);

		em.close();

		s[0] = e.getName();
		s[1] = e.getAddress();

		return s;
	}

}
