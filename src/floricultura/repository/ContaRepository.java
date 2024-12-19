package floricultura.repository;

import floricultura.model.Floricultura;

public interface ContaRepository {
     
	//Crud
	public void procurarporNome(String nome);
	public void listar();
	public void cadastrar(Floricultura nome);
	public void atualizar(Floricultura quantidade);
	public void excluir(int quantidade);
	
	//Métodos
	public void adicionarProduto(String nome, int quantia);
	public void retirarProduto (String nome, int quantia);
	
}
