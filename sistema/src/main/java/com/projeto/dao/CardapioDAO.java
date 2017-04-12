/**
 * 
 */
package com.projeto.dao;

import java.io.Serializable;

import com.sistema.orm.Cardapio;

/**
 * @author: João Lucas Lima de Gouveia
 * @email: joaolucaslima.0403@gmail.com
 * 
 */
public class CardapioDAO extends GenericDAO<Cardapio>{
	public CardapioDAO() {
		super(Cardapio.class);
	}
}
