public class Roupa implements Produto {

	private String descricao;
	private double preco;
	private String tamanho;

	public Roupa(String descricao, double preco, String tamanho) {
		this.descricao = descricao;
		this.preco = preco;
		this.tamanho = tamanho;
	}

	public String getDescricao() {
		return descricao;
	}

	public double getPreco() {
		return preco;
	}

	public String getTamanho() {
		return tamanho;
	}

	@Override
	public double aceitar(ProdutoVisitor visitor) {
		return visitor.calcularPrecoRoupa(this);
	}
}