/**
 * 
 */
package com.sistema.orm;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author: João Lucas Lima de Gouveia
 * @email: joaolucaslima.0403@gmail.com
 * 
 */
@Entity
@Table(name="USUARIO")
public class Usuario implements Serializable{
	
	@Id
	@GeneratedValue
	@Column(name="idUsuario")
	private Integer id;
	
	@Column(name="nome")
	private String name;
	
	@Column(name="login")
	private String login;
	
	@Column(name="senha")
	private Integer senha;
	
	@Column(name="rg")
	private Integer rg;
	
	@Column(name="cpf")
	private Integer cpf;
	
	@Column(name="tipo")
	private Integer tipo;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public Integer getSenha() {
		return senha;
	}

	public void setSenha(Integer senha) {
		this.senha = senha;
	}

	public Integer getRg() {
		return rg;
	}

	public void setRg(Integer rg) {
		this.rg = rg;
	}

	public Integer getCpf() {
		return cpf;
	}

	public void setCpf(Integer cpf) {
		this.cpf = cpf;
	}

	public Integer getTipo() {
		return tipo;
	}

	public void setTipo(Integer tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return "Usuario [id=" + id + ", name=" + name + ", login=" + login + ", senha=" + senha + ", rg=" + rg
				+ ", cpf=" + cpf + ", tipo=" + tipo + "]";
	}
	
	
	
	
}
