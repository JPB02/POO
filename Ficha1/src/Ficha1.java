import java.math.BigInteger;

public class Ficha1 {
	
	// Exercício 1
	public double celsiusParaFahrenheit(double graus) {
		return (graus*1.8)+32;
	}
	
	// Exercício 2
	public int maximoNumeros(int a, int b) {
		if (a >= b) return a;
		else return b;
	}
	 
	// Exercício 3
	public String criaDescricaoConta(String nome, double saldo) {
		String out = "Olá " + nome + "! O teu saldo é: " + saldo + "€";
		return out;
	}
	
	// Exercício 4
	public double eurosParaLibras(double valor, double taxaConversao) {
		return (valor*taxaConversao);
	}
	
	// Exercício 5
	public double mediaDoisInt(int a, int b) {
		return (a+b)/2;
	}
	
	// Exercício 6
	// É necessário BigInteger para armazenar factorial de 5000
	public BigInteger factorial(int num) {
		if (num == 0) return BigInteger.ONE;    
		else return BigInteger.valueOf(num).multiply(factorial(num-1));   
	}
	
	// Exercício 7
	public BigInteger tempoGasto() {
		long start = System.currentTimeMillis();
		BigInteger f = factorial(5000);
		long end = System.currentTimeMillis();
		System.out.println("Tempo de execução(ms): "+ (end-start));
		return f;
	}
	
}
