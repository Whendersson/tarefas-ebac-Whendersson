package exercicio;

/**
 * @author Whendersson1
 */

public class CalculoMedia {
	 
	public static void main(String[] args){
		
		long num1 = valor(6);
		long num2 = valor(8);
		long num3 = valor(10);
		long num4 = valor(14);
		
		long soma = valor(num1 + num2 + num3 + num4);
		long media = valor(soma / 4);
		
		System.out.println("A média das notas é: " + media);
		
				
	}
	
	static long valor(long num) {
      return num;
      
	}  
}
