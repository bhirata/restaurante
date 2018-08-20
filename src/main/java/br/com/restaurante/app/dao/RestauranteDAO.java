//package br.com.restaurante.app.dao;
//
//import java.util.List;
//
//import javax.persistence.EntityManager;
//import javax.persistence.PersistenceContext;
//
//import org.springframework.stereotype.Repository;
//import org.springframework.transaction.annotation.Transactional;
//
//import br.com.restaurante.app.models.Restaurante;
//
//@Repository
//@Transactional
//public class RestauranteDAO {
//
//	@PersistenceContext
//	private EntityManager manager;
//	
//	public void gravar(Restaurante restaurante) {
//		System.out.println(restaurante);
//		manager.persist(restaurante);
//	}
//	
//	public List<Restaurante> listar () {
//		return manager.createQuery("select r from Restaurante r", Restaurante.class)
//		        .getResultList();
//	}
//}
