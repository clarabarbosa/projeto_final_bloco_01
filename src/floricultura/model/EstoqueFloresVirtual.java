package floricultura.model;

public class EstoqueFloresVirtual extends Floricultura{

	private int estoqueVirtual;
	
	public EstoqueFloresVirtual(String nome, int quantidade, int tipo, float valor, int validade, int estoqueVirtual) {
		super(nome, quantidade, tipo, valor, validade);
		this.estoqueVirtual = estoqueVirtual; 
	}

	public int getEstoqueVirtual() {
		return estoqueVirtual;
	}

	public void setEstoqueVirtual(int estoqueVirtual) {
		this.estoqueVirtual = estoqueVirtual;
	}
	@Override
	public boolean retirarProduto(int quantia) {
		
		if(this.getQuantidade() + this.getEstoqueVirtual() < quantia){
			System.out.println("\nSaldo Insuficiente em Estoque!");
			return false;
		}
		this.setQuantidade(this.getQuantidade() - quantia);
		return true;
	}
	public void visualizar() {
	super.visualizar();
	System.out.println("Saldo no Estoque Virtual: " + this.estoqueVirtual);
	
	}}

