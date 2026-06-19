package logica.exercicio02;

public class Main {
	static void main(String[] args) {
		// Etapa 01: criar variavel: valor.
		// Etapa 02: Se compra for maior ou igual a 100, desconto de 10%
		// Etapa 03: E se não for maior ou igual a 100, não aplica desconto.
		// Etapa 04: Exibir no console os dados: Valor original, valor do desconto e valor final;

		double valorCompra = 80;
		double valorDesconto = 0;
		double valorFinal = 0;

		if (valorCompra >= 100) {
			valorDesconto =  valorCompra * 10 / 100;
			valorFinal = valorCompra - valorDesconto;
			System.out.println("Você recebeu um  desconto!");

		} else {
			valorDesconto = 0;
			valorFinal = valorCompra;
			System.out.println("Você não recebeu um desconto." );
		}
		System.out.println("Valor original: R$" + valorCompra);
		System.out.println("Desconto: R$" + valorDesconto);
		System.out.println("Valor final da compra: R$" + valorFinal);

	}
}
