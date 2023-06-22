package P3E01;
import java.util.Scanner;

public class PessoaSomaAltura {
	public static void main(String[] args) {
		
		
		P3E01_Pessoa P = new P3E01_Pessoa(2,0);
		Scanner teclado = new Scanner(System.in);
		int quantidade;
		
		for(quantidade=0; quantidade <= P.getQtPessoa(); quantidade++){
			System.out.println("Entre com a quantidade de pessoas: ");
			P.setQtPessoa((int) Double.parseDouble(teclado.nextLine()));
			System.out.println("Altura: ");
			P.setSomaAltura(Double.parseDouble(teclado.nextLine()));
			
			}
		
		System.out.println("A altura media é: " + P3E01_Pessoa.getMediaAltura());
		
		
		
		
		
	}

}
