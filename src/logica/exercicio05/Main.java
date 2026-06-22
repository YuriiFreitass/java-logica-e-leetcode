package logica.exercicio05;

public class Main {
	static void main(String[] args) {
	String cor = "Amarelo";
		if (cor.equalsIgnoreCase("Verde")) {
			System.out.println("Pode seguir");
		} else if (cor.equalsIgnoreCase("Amarelo")) {
			System.out.println("Atenção!");
		} else if (cor.equalsIgnoreCase("Vermelho")){
			System.out.println("Pare.");
		} else {
			System.out.println("Cor inválida");
		}

	}

}
