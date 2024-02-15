import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Ficha1Teste {

	public static void main (String[] args) {
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		Ficha1 f = new Ficha1();
		System.out.println("Introduza o nº do exercício:");
		int ex = s.nextInt();
		
		switch(ex) {
		// Exercício 1
		case 1:
			System.out.println("Introduza a temperatura em ºC:");
			double tc = s.nextDouble();
			System.out.println(tc + " em ºC corresponde a " + f.celsiusParaFahrenheit(tc) + " F");
			
		// Exercício 2
		case 2:
			System.out.println("Introduza dois números:");
			int n1 = s.nextInt();
			int n2 = s.nextInt();
			System.out.println("O maior nº entre " + n1 + " e " + n2 + " é " + f.maximoNumeros(n1, n2));
			
		// Exercício 3
		case 3:
			System.out.println("Introduza o seu primeiro nome, apelido e saldo:");
			String nomePrimeiro = s.next();
			String apelido = s.next();
			String nome = nomePrimeiro + " " + apelido;
			int saldo = s.nextInt();
			System.out.println(f.criaDescricaoConta(nome, saldo));
			
		// Exercício 4	
		case 4:
			System.out.println("Introduza um valor e uma taxa de conversão:");
			double valor = s.nextInt();
			double taxa = s.nextDouble();
			System.out.format("O valor de %.2f€ em libras é %.2f£", valor, f.eurosParaLibras(valor, taxa));
		// Exercício 5	
		case 5:
			System.out.println("Introduza dois inteiros:");
			int a = s.nextInt();
			int b = s.nextInt();
			if(a<=b) {
				System.out.format("Os números por ordem são: %d, %d\n", a, b);
			}
			
			else {
				System.out.format("Os números por ordem são: %d, %d\n", b, a);
			}
			
			System.out.println("A média dos dois números é: " + f.mediaDoisInt(a, b));
			
		// Exercício 6	
		case 6:
			System.out.println("Introduza um número para obter o seu fatorial:");
			int n = s.nextInt();
			System.out.format("O fatorial de %d é %d.", n, f.factorial(n));
			
		// Exercício 7
		case 7:
			DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
			LocalDateTime before = LocalDateTime.now();  
			System.out.println("Data antes da execução: " + dtf.format(before));  
			System.out.println("Resultado do fatorial de 5000: " + f.tempoGasto());
			LocalDateTime after = LocalDateTime.now();
			System.out.println("Data após a execução: " + dtf.format(after));
		}
					
	}
	
}
