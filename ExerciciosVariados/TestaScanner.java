package exemplos;

import java.util.Scanner;

public class TestaScanner {

	public static void main(String[] args) {
		// criando um objeto Scanner
		Scanner lerTeclado = new Scanner(System.in);
		Scanner teclado = new Scanner(System.in);
		Scanner tcl = new Scanner(System.in);
		
		// Pedindo um número inteiro para o usuário
		System.out.print("Informe um número : ");
		int num = lerTeclado.nextInt();

		System.out.print("Informe um número : ");
		int num2 = lerTeclado.nextInt();
		System.out.print("Número = " + num + "\nNúmero = " + num2);

		int soma = num + num2;
		int sub = num - num2;
		System.out.print("\nSoma = " + soma + "\nSubtração = " + sub);
		
		//testando nextLine()
		System.out.print("\n\nInforme seu nome : ");
		String nome = teclado.nextLine();
		System.out.print("Nome = " + nome);
		
		//testando nextFloat
		System.out.print("\n\nInforme a área : ");
		float area = tcl.nextFloat();
		System.out.print("Area = " + area);
	}
}
