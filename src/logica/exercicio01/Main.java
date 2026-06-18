package logica.exercicio01;

public class Main {
	static void main(String[] args) {
		// Passo 01: criar duas variaveis: saldo e valor do saque.
		// Passo 02: Se houver saldo suficiente, realize o saque
		// Passo 03: Se não houver informar que o saldo é insuficiene
		// Exibir o saldo final.

		double saldo = 500;
		double valorSaque = 500;

			if (valorSaque <= saldo) {
				saldo -= valorSaque;
				System.out.println("Saque foi realizado com sucesso.");

			} else if (valorSaque > saldo) {
				System.out.println("Não foi possível realizar o saque.");
			}
		System.out.println("Saldo atual: " + saldo);

	}
}
