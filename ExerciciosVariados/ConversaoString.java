package exemplos;

import java.util.Scanner;

public class ConversaoString {

	public static void main(String[] args) {
		 Integer num1 = 1;
		 Integer num2 = 2;
		 
		 //compara a string atual com a string do parâmetro, retornando um inteiro
		 if(num1.compareTo(num2) == -1) {
			 System.out.println("num1 é maior que num2");
		 }
		 
		 //compara a string atual com a string do parâmetro, retornando um inteiro
		 if(num1.compareTo(num2) == 0) {
			 System.out.println("num1 é igual a num2");
		 }
		 
		 //compara a string atual com a string do parâmetro, retornando um inteiro
		 if(num1.compareTo(num2) == 1) {
			 System.out.println("num1 é menor que num2");
		 }
		 
		 //compara a string atual com a string do parâmetro, retornando um inteiro
		 if(num1.equals(num2)) {
			 System.out.println("num1 é igual a num2");
		 }
		 
		 Scanner lerTeclado = new Scanner(System.in);

		 System.out.print("\nInforme um número : ");
		 String dado = lerTeclado.next();
		 
		 //Transforma um número inteiro em String
		 Integer num3 = Integer.parseInt(dado);
		 System.out.print("num3 = " + num3.toString());


	}

}
