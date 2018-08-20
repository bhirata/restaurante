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
//import br.com.restaurante.app.models.Prato;
//
//@Repository
//@Transactional
//public class PratosDAO {
//	
//	@PersistenceContext
//	private EntityManager manager;
//
//	public void gravar(Prato prato) {
//		
//		System.out.println(prato);
//		manager.persist(prato);
//	}
//	
//	public List<Prato> listar() {
//		return manager.createQuery("select p from Prato p", Prato.class).getResultList();
//	}
//
//}
