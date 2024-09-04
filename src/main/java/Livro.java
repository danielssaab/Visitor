public class Livro implements Produto {

	private String titulo;
	private double preco;
	private String autor;

	public Livro(String titulo, double preco, String autor) {
		this.titulo = titulo;
		this.preco = preco;
		this.autor = autor;
	}

	public String getTitulo() {
		return titulo;
	}

	public double getPreco() {
		return preco;
	}

	public String getAutor() {
		return autor;
	}

	@Override
	public double aceitar(ProdutoVisitor visitor) {
		return visitor.calcularPrecoLivro(this);
	}
}