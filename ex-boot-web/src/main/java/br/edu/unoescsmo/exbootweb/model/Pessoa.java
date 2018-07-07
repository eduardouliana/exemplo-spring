package br.edu.unoescsmo.exbootweb.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity // para dizer que é uma entidade (tabela do banco)
public class Pessoa {

	@Id // chave primária
	@GeneratedValue(strategy = GenerationType.AUTO) // cria um sequence para o campo
	@Column(name = "id_pessoa")
	private Long codigo;

	@Column(name = "tx_nome", length = 150, nullable = false)
	private String nome;

	@Column(name = "tx_cpf", length = 11)
	private String cpf;
	
	public Pessoa() {
		
	}
	
	public Pessoa(Long codigo) {
		this.codigo = codigo;
	}

	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	@Override
	public String toString() {
		return "Pessoa [codigo=" + codigo + ", nome=" + nome + "]";
	}
	
	

}
