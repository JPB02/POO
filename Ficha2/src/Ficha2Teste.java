import java.util.Arrays;
import java.util.Scanner;

public class Ficha2Teste {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		Ficha2 f = new Ficha2();
		System.out.println("Introduza o nº do exercício:");
		int ex = s.nextInt();
		
		switch(ex) {
		
		// Exercício 1
		case 1:
			int valor = 0;
			System.out.println("Número de inteiros a ler?: ");
			int n = s.nextInt();
			
			int[] valores = new int[n];
			
			for(int i=0; i<n; i++) {
				valor = s.nextInt();
				valores[i] = valor;
			}
			System.out.println("O mínimo do array é: " + f.minArray(valores));
			
		// Exercício 2
		case 2:
			valor = 0;
			System.out.println("Introduza dois índices: ");
			int i1 = s.nextInt();
			int i2 = s.nextInt();
			
			System.out.format("O array com índices entre %d e %d é: %s", i1, i2, Arrays.toString(f.middleArray(i1, i2)));
			
		// Exercício 3
		case 3:
			valor = 0;
			System.out.println("Número de inteiros a ler?(array 1): ");
			n = s.nextInt();
			
			int [] arr1 = new int[n];
			
			for(int i=0; i<n; i++) {
				valor = s.nextInt();
				arr1[i] = valor;
			}
			
			System.out.println("Número de inteiros a ler?(array 2): ");
			n = s.nextInt();
			
			int [] arr2 = new int[n];
			
			for(int i=0; i<n; i++) {
				valor = s.nextInt();
				arr2[i] = valor;
			}
			
			System.out.println("O array dos valores comuns é: " + Arrays.toString(f.commonArray(arr1, arr2)));
		}
	}
	
}
