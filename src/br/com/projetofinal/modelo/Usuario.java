package br.com.projetofinal.modelo;

import java.util.GregorianCalendar;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity
public class Usuario {
	
	@Id
	@GeneratedValue
	private String id;
	
	private String nome;
	private String cpf;
	private String email;
	private String telPrincipal;
	private String telAlternativo;
	private GregorianCalendar dataNasc;
	private String cadSexo;
	private String cadEstCivil;
	private String cadProfissao;
	private String cadCEP;
	private String cadBairro;
	private String cadCidade;
	private String cadUF;
	private String cadEndereco;
	private GregorianCalendar dataAssociado;
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTelPrincipal() {
		return telPrincipal;
	}
	public void setTelPrincipal(String telPrincipal) {
		this.telPrincipal = telPrincipal;
	}
	public String getTelAlternativo() {
		return telAlternativo;
	}
	public void setTelAlternativo(String telAlternativo) {
		this.telAlternativo = telAlternativo;
	}
	public GregorianCalendar getDataNasc() {
		return dataNasc;
	}
	public void setDataNasc(GregorianCalendar dataNasc) {
		this.dataNasc = dataNasc;
	}
	public String getCadSexo() {
		return cadSexo;
	}
	public void setCadSexo(String cadSexo) {
		this.cadSexo = cadSexo;
	}
	public String getCadEstCivil() {
		return cadEstCivil;
	}
	public void setCadEstCivil(String cadEstCivil) {
		this.cadEstCivil = cadEstCivil;
	}
	public String getCadProfissao() {
		return cadProfissao;
	}
	public void setCadProfissao(String cadProfissao) {
		this.cadProfissao = cadProfissao;
	}
	public String getCadCEP() {
		return cadCEP;
	}
	public void setCadCEP(String cadCEP) {
		this.cadCEP = cadCEP;
	}
	public String getCadBairro() {
		return cadBairro;
	}
	public void setCadBairro(String cadBairro) {
		this.cadBairro = cadBairro;
	}
	public String getCadCidade() {
		return cadCidade;
	}
	public void setCadCidade(String cadCidade) {
		this.cadCidade = cadCidade;
	}
	public String getCadUF() {
		return cadUF;
	}
	public void setCadUF(String cadUF) {
		this.cadUF = cadUF;
	}
	public String getCadEndereco() {
		return cadEndereco;
	}
	public void setCadEndereco(String cadEndereco) {
		this.cadEndereco = cadEndereco;
	}
	public GregorianCalendar getDataAssociado() {
		return dataAssociado;
	}
	public void setDataAssociado(GregorianCalendar dataAssociado) {
		this.dataAssociado = dataAssociado;
	}
	
}
