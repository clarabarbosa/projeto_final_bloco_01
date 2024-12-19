package floricultura.repository;

import floricultura.model.ProdutosFloricultura;

public interface ProdutosRepository {
     
	//Crud
	public void procurarporNome(String nome);
	public void listar();
	public void cadastrar(ProdutosFloricultura nome);
	public void atualizar(ProdutosFloricultura quantidade);
	public void excluir(int quantidade);
	
	//Métodos
	public void adicionarProduto(String nome, int quantia);
	public void retirarProduto (String nome, int quantia);
	
}
