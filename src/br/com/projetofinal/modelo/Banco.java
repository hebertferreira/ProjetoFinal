package br.com.projetofinal.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity
public class Banco {
	
	@Id
	@GeneratedValue
	private int id;
	
	private String cadBanco;
	private String cadAgencia;
	private String cadTipoConta;
	private String cadNumConta;
	


	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCadBanco() {
		return cadBanco;
	}
	public void setCadBanco(String cadBanco) {
		this.cadBanco = cadBanco;
	}
	public String getCadAgencia() {
		return cadAgencia;
	}
	public void setCadAgencia(String cadAgencia) {
		this.cadAgencia = cadAgencia;
	}
	
	public String getCadTipoConta() {
		return cadTipoConta;
	}
	public void setCadTipoConta(String cadTipoConta) {
		this.cadTipoConta = cadTipoConta;
	}
	
	public String getcadNumConta() {
		return cadNumConta;
	}
	public void setcadNumConta(String cadNumConta) {
		this.cadNumConta = cadNumConta;
	}
	
}
