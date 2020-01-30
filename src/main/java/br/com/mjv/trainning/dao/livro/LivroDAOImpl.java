package br.com.mjv.trainning.dao.livro;

import java.util.List;

import javax.persistence.EntityManager;

import br.com.mjv.trainning.models.Livro;

public class LivroDAOImpl implements LivroDAO {
	
	private EntityManager em;

	public void inserir(Livro livro) {
		em.persist(livro);
	}

	public void alterar(Livro livro) {
		em.merge(livro);

	}

	public List<Livro> listar(String nomeLivro) {
		// TODO Auto-generated method stub
		return null;
	}

	public void excluir(Long id) {
		// TODO Auto-generated method stub
		
	}
	
	

}
