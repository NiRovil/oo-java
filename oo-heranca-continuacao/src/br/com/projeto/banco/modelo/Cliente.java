package br.com.projeto.banco.modelo;

import java.io.Serializable;

public class Cliente implements Serializable{
	private String nome;
	private String profissao;
	
	public String getNome() {
		return this.nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getProfissao() {
		return this.profissao;
	}
	
	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}
	
}
