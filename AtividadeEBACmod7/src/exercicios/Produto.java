package exercicios;

/**
 * @author Whendersson1
 */

public class Produto {
	
	public static void main(String[] args) {

		long valorpreco = valor(50);
		long valorcodigo = valor(176676433);
		long quantidadeestoque = valor(6);
		System.out.println("O preço do produto é: " + valorpreco);
		System.out.println("O código do produto é: " + valorcodigo);
		System.out.println("A quantidade em estoque é: " + quantidadeestoque);
		
	}
	
	static long valor(long num) {
		return num;
	}
}
