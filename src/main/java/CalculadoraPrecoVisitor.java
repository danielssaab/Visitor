public class CalculadoraPrecoVisitor implements ProdutoVisitor {

	@Override
	public double calcularPrecoLivro(Livro livro) {
		// Aplica 10% de desconto em livros
		return livro.getPreco() * 0.90;
	}

	@Override
	public double calcularPrecoEletronico(Eletronico eletronico) {
		// Aplica 15% de taxa sobre o preço dos eletrônicos
		return eletronico.getPreco() * 1.15;
	}

	@Override
	public double calcularPrecoRoupa(Roupa roupa) {
		// Aplica 5% de desconto em roupas
		return roupa.getPreco() * 0.95;
	}
}