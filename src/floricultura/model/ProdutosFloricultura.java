package floricultura.model;

public abstract class ProdutosFloricultura {

	private String nome;
	private int quantidade;
	private int tipo;
	private float valor;
	private int validade;
	private int estoques;
	
	public ProdutosFloricultura(String nome, int quantidade, int tipo, float valor, int validade) {
		this.nome = nome;
		this.quantidade = quantidade;
		this.tipo = tipo;
		this.valor = valor;
		this.validade = validade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int id) {
		this.quantidade = quantidade;
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	public float getValor() {
		return valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}

	public int getValidade() {
		return validade;
	}

	public void setValidade(int validade) {
		this.validade = validade;
	}
	
	public boolean retirarProduto(int quantia) {
		if(this.getQuantidade() < quantia) {
			System.out.println("Quantidade insuficiente no estoque Físico!");
			return false;
		}
		
		this.setQuantidade(this.getQuantidade() - quantia);
		return true;
	}
	
	public void adicionarProduto(int quantia) {
		this.setQuantidade(this.getQuantidade() + quantia);
	}

	public void visualizar(){
		
		String estoques;
		switch (this.estoques) {
		case 1 -> estoques = "EstoqueFloresVirtual";
		}
		
		System.out.println("\n\n**************************************");
		System.out.println("Dados do produto: ");
		System.out.println("******************************************");
		System.out.println("Nome do produto: " + this.nome);
		System.out.println("Quantidade do produto: " + this.quantidade );
		System.out.println("Data de validade do produto: " + this.validade);
		System.out.println("Valor do produto: " + this.valor           );
	}
}
		
	

