package com.masai.AccountDao;

import javax.persistence.EntityManager;

import com.masai.Exception.InsufficientBalance;
import com.masai.Exception.InvalidAccount;
import com.masai.bankDB.Account;
import com.masai.entityUtil.EntityUtil;

public class AccountDaoImpl implements AccountDao{

	@Override
	public void save(Account account) {
		
		EntityManager em = EntityUtil.getEntitymanager();
		
		em.getTransaction().begin();
		
		em.persist(account);
		
		em.getTransaction().commit();
		
		em.close();
		
	}

	@Override
	public Account findById(int id) throws InvalidAccount {
		
		Account ac = null;
		
		EntityManager em = EntityUtil.getEntitymanager();
		
		ac = em.find(Account.class, id);
		
		if(ac != null) {
			return ac;
		}else {
			throw new InvalidAccount("Invalid Acoount..");
		}
		
	}

	@Override
	public void update(Account account) throws InvalidAccount {
		
		Account ac = null;
		
		EntityManager em = EntityUtil.getEntitymanager();
		
		ac = em.find(Account.class,account.getId());
		
		if(ac != null) {
			em.getTransaction().begin();
			
			em.merge(account);
			
			em.getTransaction().commit();
			
			em.close();
		}else {
			throw new InvalidAccount("Invalid Acoount..");
		}
		
	}

	@Override
	public void remove(Account account) throws InvalidAccount {
		
		Account ac = null;
		
		EntityManager em = EntityUtil.getEntitymanager();
		
		ac = em.find(Account.class,account.getId());
		
		if(ac != null) {
			em.getTransaction().begin();
			
			em.remove(ac);
			
			em.getTransaction().commit();
			
		}else {
			throw new InvalidAccount("Invalid Acoount..");
		}
		em.close();
		
	}

	@Override
	public int withdraw(double amount, Account account) throws InsufficientBalance {
		
		int x = 0;
		
		Account ac = null;
		
		EntityManager em = EntityUtil.getEntitymanager();
		
		ac = em.find(Account.class,account.getId());
		
		if(ac != null) {
			double balance = ac.getBalance();
			
			if(amount<=balance) {
				em.getTransaction().begin();
				
				ac.setBalance(ac.getBalance() - amount);
				
				em.persist(ac);
				
				x = 1;
				
				em.getTransaction().commit();
				
				em.close();
			}else {
				throw new InsufficientBalance("InsufficientBalance..");
			}
		}
		
		return x;
	}

	@Override
	public String deposit(double amount, Account account) throws InvalidAccount {
		String s = "Not deposited..";
		
		Account ac = null;
		
		EntityManager em = EntityUtil.getEntitymanager();
		
		ac = em.find(Account.class,account.getId());
		
		if(ac!=null) {
			em.getTransaction().begin();
			
			ac.setBalance(ac.getBalance() + amount);
			
			em.persist(ac);
			
			s = "Amount deposited successfully";
			
			em.getTransaction().commit();
			
			em.close();
		}else {
			throw new InvalidAccount("InvalidAccount..");
		}
		
		return s;
	}

}
