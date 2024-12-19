package floricultura.controller;

import java.util.ArrayList;

import floricultura.model.ProdutosFloricultura;
import floricultura.repository.ProdutosRepository;

public class FloriculturaController implements ProdutosRepository {

	private ArrayList<ProdutosFloricultura> listaProdutos = new ArrayList<ProdutosFloricultura>();
	String nome;
	int id;
	
	@Override
	public void procurarporNome(String nome) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void listar() {
		for (var id : listaProdutos) {
		id.visualizar();
		}
	}

	@Override
	public void cadastrar(ProdutosFloricultura id) {
		listaProdutos.add(id);
		System.out.println("\nO produto" + id.getNome() + " foi cadastrada com sucesso");
	}

	@Override
	public void atualizar(ProdutosFloricultura quantidade) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void excluir(int quantidade) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void adicionarProduto(String nome, int quantia) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void retirarProduto(String nome, int quantia) {
		// TODO Auto-generated method stub
		
	}
	public int gerarId() {
		return ++ id;
		}
	}


