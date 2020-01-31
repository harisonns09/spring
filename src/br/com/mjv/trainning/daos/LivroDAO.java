package br.com.mjv.trainning.daos;

import java.util.List;

import br.com.mjv.trainning.models.Livro;

public interface LivroDAO {

	public Livro inserir(Livro livro);
	
	public Livro alterar(Livro livro);
	
	public List<Livro> listar(String nomeLivro);
	
	public void excluir(final Long id);
	
	
	
	
}
