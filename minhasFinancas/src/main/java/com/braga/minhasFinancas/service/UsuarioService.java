package com.braga.minhasFinancas.service;

import com.braga.minhasFinancas.model.entity.Usuario;

public interface UsuarioService {

	Usuario autenticar(String email, String senha);
	Usuario salvarUsuario(Usuario u);
	void validarEmail(String email);
	
}
