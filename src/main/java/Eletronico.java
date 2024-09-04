public class Eletronico implements Produto {

	private String nome;
	private double preco;
	private String marca;

	public Eletronico(String nome, double preco, String marca) {
		this.nome = nome;
		this.preco = preco;
		this.marca = marca;
	}

	public String getNome() {
		return nome;
	}

	public double getPreco() {
		return preco;
	}

	public String getMarca() {
		return marca;
	}

	@Override
	public double aceitar(ProdutoVisitor visitor) {
		return visitor.calcularPrecoEletronico(this);
	}
}