package br.edu.unoescsmo.exbootweb.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.br.CPF;

@Entity // para dizer que é uma entidade (tabela do banco)
public class Pessoa {

	@Id // chave primária
	@GeneratedValue(strategy = GenerationType.AUTO) // cria um sequence para o campo
	@Column(name = "id_pessoa")
	private Long codigo;

	@Column(name = "tx_nome", length = 150, nullable = false)
	@NotEmpty(message="nome deve ser preenchido")
	private String nome;

	@Column(name = "tx_cpf", length = 11)
	@Size(max=11,min=11, message="deve conter 11 caracteres")
	//@CPF valida se o cpf é válido
	private String cpf;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="cd_naturalidade")
	private Cidade naturalidade;
	
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

	public Cidade getNaturalidade() {
		return naturalidade;
	}

	public void setNaturalidade(Cidade naturalidade) {
		this.naturalidade = naturalidade;
	}
	
	

}
