package exemplos;

import java.util.Scanner;

public class TestaScanner {

	public static void main(String[] args) {
		// criando um objeto Scanner
		Scanner lerTeclado = new Scanner(System.in);
		Scanner teclado = new Scanner(System.in);
		Scanner tcl = new Scanner(System.in);
		
		// Pedindo um n�mero inteiro para o usu�rio
		System.out.print("Informe um n�mero : ");
		int num = lerTeclado.nextInt();

		System.out.print("Informe um n�mero : ");
		int num2 = lerTeclado.nextInt();
		System.out.print("N�mero = " + num + "\nN�mero = " + num2);

		int soma = num + num2;
		int sub = num - num2;
		System.out.print("\nSoma = " + soma + "\nSubtra��o = " + sub);
		
		//testando nextLine()
		System.out.print("\n\nInforme seu nome : ");
		String nome = teclado.nextLine();
		System.out.print("Nome = " + nome);
		
		//testando nextFloat
		System.out.print("\n\nInforme a �rea : ");
		float area = tcl.nextFloat();
		System.out.print("Area = " + area);
	}
}
