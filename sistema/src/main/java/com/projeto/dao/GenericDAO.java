package com.projeto.dao;

import java.io.Serializable;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

public abstract class GenericDAO  <T extends Serializable>{

	private Class<T> oClass;
	
	protected GenericDAO(Class<T> oClass){
		this.oClass = oClass;
	}
	protected EntityManager getEntityManager(){
		return DaoFactory.getInstancia().getEntityManager();
	}
	
	public void manter(T entity){
		try{
		EntityManager manager = getEntityManager();
		manager.getTransaction().begin();	
		manager.persist(entity);
		manager.getTransaction().commit();
		manager.close();
		} catch (Exception e){
			e.printStackTrace();
		}
	}
	public void alterar(T entity){
		EntityManager manager = getEntityManager();
		manager.getTransaction().begin();	
		manager.merge(entity);
		manager.getTransaction().commit();
		manager.close();
	}
	public void delete (Integer id){
		EntityManager manager = getEntityManager();
		manager.getTransaction().begin();
		manager.remove(manager.getReference(oClass, id));
		manager.getTransaction().commit();
		manager.close();
	}
	public T buscarPeloId(Integer id){
		EntityManager manager = getEntityManager();
		manager.getTransaction().begin();
		
		T  entidade = (T) manager.find(oClass,id);
		manager.getTransaction().commit();
		manager.close();
		return entidade;
	}
	public List<T> buscarTodas(){
		EntityManager manager = getEntityManager();
		manager.getTransaction().begin();
		
		Query query = manager.createQuery("from "+ oClass.getSimpleName());
		List <T> entidades = query.getResultList();
		manager.getTransaction().commit();
		manager.close();
		return entidades;
	}
}
