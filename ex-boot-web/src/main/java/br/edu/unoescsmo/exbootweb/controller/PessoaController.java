package br.edu.unoescsmo.exbootweb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

import br.edu.unoescsmo.exbootweb.model.Pessoa;
import br.edu.unoescsmo.exbootweb.regras.PessoaRegra;

@Controller
public class PessoaController {
	
	@Autowired
	private PessoaRegra pessoaRegra;
	
	@GetMapping("/pessoa/salvar")
	@ResponseBody
	public String salvar() {
		Pessoa pessoa = new Pessoa();
		pessoa.setCpf("12345678910");
		pessoa.setNome("Eduardo");
		pessoaRegra.salvar(pessoa);
		return "Salvo com sucesso";
	}

	@GetMapping("/pessoa/listar")
	@ResponseBody
	public List<Pessoa> listar() {
		return pessoaRegra.listar();
	}
	
	@GetMapping("/pessoa/nome/{nome}")
	@ResponseBody
	public List<Pessoa> listarPorNome(@PathVariable("nome")String nome) {
		return pessoaRegra.listarPorNome(nome);
	}
	
	@GetMapping("/pessoa/cpf/{cpf}")
	@ResponseBody
	public List<Pessoa> listarPorCPF(@PathVariable("cpf")String cpf) {
		return pessoaRegra.listarPorCPF(cpf);
	}
	
	@GetMapping("/pessoa/deletar")
	@ResponseBody
	public String deletar() {
		pessoaRegra.excluir(new Pessoa(1L));
		return "Pessoa excluída com sucesso";
	}
	
}
