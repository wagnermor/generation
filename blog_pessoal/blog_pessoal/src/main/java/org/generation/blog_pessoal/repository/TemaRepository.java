package org.generation.blog_pessoal.repository;

import java.util.List;

import org.generation.blog_pessoal.model.Tema;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface TemaRepository extends JpaRepository<Tema, Long>{
	public List<Tema> findAllByDescricaoContainingIgnoreCase(@Param("descricao") String descricao);
}
