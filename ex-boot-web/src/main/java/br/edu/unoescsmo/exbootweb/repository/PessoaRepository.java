package br.edu.unoescsmo.exbootweb.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import br.edu.unoescsmo.exbootweb.model.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Long> {

	List<Pessoa> findByNomeLike(String nome);

	@Query("select p from Pessoa p where p.cpf = :cpf")
	List<Pessoa> porCpf(@Param("cpf") String cpf);
	
	@Query("select p from Pessoa p left join fetch p.naturalidade")
	List<Pessoa> dadosGrid();
}
