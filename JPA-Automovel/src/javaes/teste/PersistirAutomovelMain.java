package javaes.teste;

import javaes.modelo.Automovel;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class PersistirAutomovelMain 
{
	public static void main(String[] args)
	{
		EntityManagerFactory entity = Persistence.createEntityManagerFactory("default");
		EntityManager em = entity.createEntityManager();
		
		Automovel auto = new Automovel();
		auto.setMarca("marca X");
		auto.setModelo("modelo Y");
		auto.setAnoFabricacao(1990);
		auto.setAnoModelo(1989);
		auto.setObservacao("O melhor carro dos anos 90");
		
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		em.persist(auto);
		tx.commit();
		
		em.close();
		entity.close();
	}
}
