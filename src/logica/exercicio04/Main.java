package logica.exercicio04;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numero1 = 25;
		int numero2 = 15;
		int opcao;
			do {
				System.out.println("---ESCOLHA UMA OPERAÇÃO----");
				System.out.println("1. Somar");
				System.out.println("2. Subtrair");
				System.out.println("3. Multiplicar");
				System.out.println("4. Divisão exata");
				System.out.println("5. Divisão não-exata");
				System.out.println("6. Encerrar sistema.");
				System.out.printf("Escolha uma opção: ");
				opcao = scanner.nextInt();
				switch (opcao) {
					case 1:
						System.out.println("Resultado da soma: " + (numero1 + numero2));
						break;
					case 2:
						System.out.println("Resultado da subtração: " + (numero1 - numero2));
						break;
					case 3:
						System.out.println("Resultado da multiplicação: " + (numero1 * numero2));
						break;
					case 4:
						System.out.println("Resultado da divisão exata: " + (numero1 / numero2));
						break;
					case 5:
						System.out.println("Resultado da divisão não-exata: " + (numero1 % numero2));
						break;
					case 6:
						break;
					default:
						System.out.println("Opção escolhida não existe!");

				}

			}while (opcao != 6);
			System.out.println("Encerrando sistema...");




		}
	}

