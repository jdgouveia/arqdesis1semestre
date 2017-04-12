/**
 * 
 */
package com.sistema.orm;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author: João Lucas Lima de Gouveia
 * @email: joaolucaslima.0403@gmail.com
 * 
 */
@Entity
@Table(name="cardapio")
public class Cardapio implements Serializable{
	
	public Cardapio(){}
	@Id
	@GeneratedValue 
	@Column(name="idProduto")
	public Integer id;
	
	@Column(name="nomeProduto")
	public String nome;
	
	@Column(name="descricaoProduto")
	public String descricao;
	
	@Column(name="valorUnitarioProduto")
	public Double valorUnitario;
	
	@Column(name="disponibilidadeProduto")
	public Integer flag;
	
	@Column(name="tipoProduto")
	public Integer typeProduct;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}


	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Double getValorUnitario() {
		return valorUnitario;
	}

	public void setValorUnitario(Double valorUnitario) {
		this.valorUnitario = valorUnitario;
	}


	public Integer getFlag() {
		return flag;
	}

	public void setFlag(Integer flag) {
		this.flag = flag;
	}

		public Integer getTypeProduct() {
		return typeProduct;
	}

	
	public void setTypeProduct(Integer typeProduct) {
		this.typeProduct = typeProduct;
	}
	
	
}
