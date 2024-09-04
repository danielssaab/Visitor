
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ProdutoVisitorTest {

	@Test
	void deveCalcularPrecoLivroComDesconto() {
		Livro livro = new Livro("Design Patterns", 100.0, "Erich Gamma");
		CalculadoraPrecoVisitor visitor = new CalculadoraPrecoVisitor();
		assertEquals(90.0, livro.aceitar(visitor));
	}

	@Test
	void deveCalcularPrecoEletronicoComTaxa() {
		Eletronico eletronico = new Eletronico("Smartphone", 1000.0, "Samsung");
		CalculadoraPrecoVisitor visitor = new CalculadoraPrecoVisitor();
		assertEquals(1150.0, eletronico.aceitar(visitor));
	}

	@Test
	void deveCalcularPrecoRoupaComDesconto() {
		Roupa roupa = new Roupa("Camiseta", 50.0, "M");
		CalculadoraPrecoVisitor visitor = new CalculadoraPrecoVisitor();
		assertEquals(47.5, roupa.aceitar(visitor));
	}
}