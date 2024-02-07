package exercícios;

import java.util.Scanner;

/**
 * @author Whendersson1
 */

public class CalcularNotas {
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
			String resposta = "";
			do {
					System.out.println("Vamos conferir a sua média de notas.");
					System.out.println("Por favor digite seu nome:");
					String nome = s.next();
					
					System.out.println("Digite sua primeira nota:");
					Long nota1 = s.nextLong();
					System.out.println("Digite sua segunda nota:");
					Long nota2 = s.nextLong();
					System.out.println("Digite sua terceira nota:");
					Long nota3 = s.nextLong();
					System.out.println("Digite sua quarta nota:");
					Long nota4 = s.nextLong();
					
					Long media = (nota1 + nota2 + nota3 + nota4)/4;
					
					System.out.println("Sua média de notas é " + media + ".");
					
					if (media >= 7) {
						System.out.println("Você está aprovado(a) " + nome + ".");
						System.out.println("Deseja conferir novamente?");
						resposta = s.next();
							
					}
					else if (media >= 5 && media < 7) {
						System.out.println("Você está de recuperação " + nome + ".");
						System.out.println("Deseja conferir novamente?");
						resposta = s.next();
					}
					else if (media < 5) {
						System.out.println("Você está reprovado(a) " + nome + ".");
						System.out.println("Deseja conferir novamente?");
						resposta = s.next();
					}
			}while(resposta.equals("sim"));
			
			System.out.println("Obrigado(a)!");
			
			
			
			
		
		
		
		
		
		
		
	}

	

}
