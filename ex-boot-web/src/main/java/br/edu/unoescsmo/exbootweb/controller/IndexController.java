package br.edu.unoescsmo.exbootweb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import br.edu.unoescsmo.exbootweb.model.Pessoa;
import br.edu.unoescsmo.exbootweb.regras.PessoaRegra;

@Controller
public class IndexController {

	@GetMapping("/")
	@ResponseBody
	public String index() {
		return "Testando controller";
	}
}
