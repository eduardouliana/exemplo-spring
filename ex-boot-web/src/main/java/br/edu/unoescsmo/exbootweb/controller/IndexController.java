package br.edu.unoescsmo.exbootweb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import br.edu.unoescsmo.exbootweb.model.Pessoa;
import br.edu.unoescsmo.exbootweb.regras.PessoaRegra;

@Controller
public class IndexController {

	

	/*
	 * @GetMapping("/")
	 * public String index(Model model) { // valor é o nome da variável // sdds é o
	 * valor atribuido na variável model.addAttribute("valor", "sdds"); return
	 * "index"; }
	 */
	@GetMapping("/teste/")
	public String index(@PathVariable("nome") String nome, Model model) {

		model.addAttribute("valor", nome.toUpperCase());
		return "index";
	}
	@GetMapping("/parametros")
	public String parametros(
			@RequestParam("nome") String nome, 
			@RequestParam("sobrenome") String sobrenome,
			Model model) {
		model.addAttribute("valor", nome + " " + sobrenome);
		model.addAttribute("nome", nome);
		model.addAttribute("sobrenome", sobrenome);

		return "index";
	}
	
	@PostMapping("/enviar")
	public String enviar(
			@RequestParam("nome") String nome, 
			@RequestParam("sobrenome") String sobrenome,
			Model model) {
		model.addAttribute("valor", nome + " " + sobrenome);

		return "index";
	}

}