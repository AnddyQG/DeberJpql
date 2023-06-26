package com.example.demo.repo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.repo.modelo.Auto;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;
@Repository
@Transactional
public class AutoRepoImpl implements IAutoRepo{
@Autowired
private EntityManager entityManager;

	@Override
	public Auto encontrarPorPlaca(String placa) {
		// TODO Auto-generated method stub
		Query query= this.entityManager.createQuery("SELECT e FROM Auto e WHERE e.placa = :datoPlaca");
		query.setParameter("datoPlaca", placa);
		return (Auto)query.getSingleResult();
	}

	@Override
	public List<Auto> encontarPorMarca(String marca) {
		// TODO Auto-generated method stub
		Query query=this.entityManager.createQuery("SELECT e FROM Auto e WHERE e.marca = :datoMarca");
		query.setParameter("datoMarca", marca);
		return query.getResultList();
	}

	@Override
	public Auto encontrarPorPlacaTyped(String placa) {
		// TODO Auto-generated method stub
		TypedQuery<Auto>typedQuery=this.entityManager.createQuery("SELECT e FROM Auto e WHERE e.placa = :datoPlaca",Auto.class);
		typedQuery.setParameter("datoPlaca", placa);
		return typedQuery.getSingleResult();
	}

	@Override
	public List<Auto> encontarPorMarcaTyped(String marca) {
		// TODO Auto-generated method stub
		TypedQuery<Auto> tQuery=this.entityManager.createQuery("SELECT e FROM Auto e WHERE e.marca = :datoMarca",Auto.class);
		tQuery.setParameter("datoMarca", marca);
		return tQuery.getResultList();
	}

	@Override
	public Auto encontrarPorPlacaYMarcaTyped(String placa, String marca) {
	
		
		TypedQuery<Auto>typedQuery=this.entityManager.createQuery("SELECT e FROM Auto e WHERE e.placa = :datoPlaca AND e.marca = :datoMarca",Auto.class);
		typedQuery.setParameter("datoPlaca", placa);
		typedQuery.setParameter("datoMarca", marca);
		return typedQuery.getSingleResult();
		
		
	}

	@Override
	public void agregar(Auto auto) {
		// TODO Auto-generated method stub
		this.entityManager.persist(auto);
		
	}
	
	

}
