/**
 * 
 */
package com.projeto.service;

import java.util.List;

import com.projeto.dao.CardapioDAO;
import com.sistema.orm.Cardapio;

/**
 * @author: Jo�o Lucas Lima de Gouveia
 * @email: joaolucaslima.0403@gmail.com
 * 
 */
public class CardapioService {

	CardapioDAO dao;
	public CardapioService(){
		dao = new CardapioDAO();
	}
	public void manter(Cardapio cardapio){
		try{
			dao.manter(cardapio);
		} catch (Exception e){	
			e.printStackTrace();
		}
	}
	public void alterar(Cardapio cardapio){
		dao.alterar(cardapio);
	}
	public void excluir(Cardapio cardapio){
		dao.delete(cardapio.getId());
	}
	public List<Cardapio> buscar(Cardapio cardapio){
		List<Cardapio> cardapios =(List<Cardapio>) dao.buscarPeloId(cardapio.getId());
		return cardapios;
		
	}
}
