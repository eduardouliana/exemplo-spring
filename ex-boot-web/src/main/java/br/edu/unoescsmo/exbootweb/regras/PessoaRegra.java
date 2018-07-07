package br.edu.unoescsmo.exbootweb.regras;

import java.util.List;

import br.edu.unoescsmo.exbootweb.model.Pessoa;

public interface PessoaRegra {

	void salvar(Pessoa pessoa);

	void excluir(Pessoa pessoa);

	List<Pessoa> listar();
	
	List<Pessoa> listarPorNome(String nome);
	
	List<Pessoa> listarPorCPF(String cpf);
}
