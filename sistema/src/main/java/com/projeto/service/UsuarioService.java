package com.projeto.service;

import java.util.List;

import com.projeto.dao.UsuarioDAO;
import com.sistema.orm.Usuario;

public class UsuarioService {
	
	UsuarioDAO dao;
	
	public UsuarioService(){
		dao = new UsuarioDAO();
	}
	
	public void manter(Usuario entity){
		try{
			dao.manter(entity);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void alterar(Usuario entity){
		try{
			dao.alterar(entity);
		} catch (Exception e){
			e.printStackTrace();
		}
	}
	public void excluir(Usuario entity){
		try{
			dao.delete(entity.getId());
		} catch (Exception e){
			e.printStackTrace();
		}
	}
	public List<Usuario> buscar (Usuario entity){
		List<Usuario> usuarios = (List<Usuario>) dao.buscarPeloId(entity.getId());
		return usuarios;
	}
}
