package br.com.restaurante.app.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.restaurante.app.models.Prato;

@Repository
public interface PratoRepository extends JpaRepository<Prato, Integer> {

	@Override
	public List<Prato> findAll();
}
