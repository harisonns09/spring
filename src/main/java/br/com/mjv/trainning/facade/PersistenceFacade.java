package br.com.mjv.trainning.facade;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


import br.com.mjv.trainning.dao.livro.LivroDAO;

/**
 * Facade com as opera��es de persist�ncia.
 * 
 * @author Rafael Fittipaldi
 */
@Component
@Scope(value = "singleton")
public class PersistenceFacade {
	
	@Autowired
	private LivroDAO livro;
	

	/**
	 *  {@link EmpresaDAO}
	 * @return {@link EmpresaDAO}
	 */
	public LivroDAO getlivro() {
		return livro;
	}
	

}

