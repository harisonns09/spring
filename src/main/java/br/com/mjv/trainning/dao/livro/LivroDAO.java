package br.com.mjv.trainning.dao.livro;

import java.util.List;

import br.com.mjv.trainning.models.Livro;

public interface LivroDAO {

	public void inserir(Livro livro);
	
	public void alterar(Livro livro);
	
	public List<Livro> listar(String nomeLivro);
	
	public void excluir(final Long id);
	
	
	
	
}
