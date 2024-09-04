public interface ProdutoVisitor {

	double calcularPrecoLivro(Livro livro);
	double calcularPrecoEletronico(Eletronico eletronico);
	double calcularPrecoRoupa(Roupa roupa);
}