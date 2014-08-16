package br.com.projetofinal.modelo;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import br.com.caelum.vraptor.Resource;

@Entity
public class Produto {
	
	@Id
	@GeneratedValue
	private int id;
	
	private String nome;
	private String breveDescricao;
	private BigDecimal valorInicialLeilão;
	private String estadoProduto;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getBreveDescricao() {
		return breveDescricao;
	}
	public void setBreveDescricao(String breveDescricao) {
		this.breveDescricao = breveDescricao;
	}

	public BigDecimal getValorInicialLeilão() {
		return valorInicialLeilão;
	}
	public void setValorInicialLeilão(BigDecimal valorInicialLeilão) {
		this.valorInicialLeilão = valorInicialLeilão;
	}
}
