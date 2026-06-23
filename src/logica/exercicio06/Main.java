package logica.exercicio06;

public class Main {
	static void main(String[] args) {
		// Obs: eu preciso que a saída dele seja pelo menos assim:
		// ok, consegui fazer: Um valor em cada linha
		// Agora preciso fazer: Um valor na linha um e os outros
		// irem acumulando // i = linha, j = coluna
		int[] runningSum = {1, 2, 3, 4};
		for (int i = 0; i < runningSum.length; i++) {
			for (int j = 0; j < runningSum[i]; j++) {
				System.out.print(runningSum[j]);
				if (j < i) {
					System.out.print(",");
				}
			}
			System.out.println();
		}
	}
}