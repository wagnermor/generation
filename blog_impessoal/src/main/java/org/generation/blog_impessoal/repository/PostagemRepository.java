package org.generation.blog_impessoal.repository;

import java.util.List;

import org.generation.blog_impessoal.model.Postagem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface PostagemRepository extends JpaRepository<Postagem, Long>{
	public List<Postagem>findAllByTituloContainingIgnoreCase(@Param("titulo")String titulo);
}

/*@Repository
public interface */
