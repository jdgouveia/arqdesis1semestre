package com.projeto.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class DaoFactory {

	private EntityManagerFactory factory;
	private static DaoFactory instancia;
	
	private DaoFactory(){
		this.factory = Persistence.createEntityManagerFactory("restaurante");
	}
	
	public static synchronized DaoFactory getInstancia(){ 
		if(instancia == null) instancia = new DaoFactory();
		return instancia;
	}
	
	public EntityManager getEntityManager(){
		return factory.createEntityManager();
	}
}
