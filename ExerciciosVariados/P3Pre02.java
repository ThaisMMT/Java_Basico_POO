import java.util.Scanner;

public class P3Pre02 {

	public static void main(String[] args) {
		Scanner ze = new Scanner(System.in);
		int qtdAluno = 0;
		double soma = 0.0;
		String acabou = "n�o";
		while(acabou.equalsIgnoreCase("n�o")) {
			System.out.print("nota 1...:");
			double nota1 = Double.parseDouble(ze.nextLine());
			System.out.print("nota 2...:");
			double nota2 = Double.parseDouble(ze.nextLine());
			double media = (nota1+nota2)/2;
			soma = soma + media;
			qtdAluno++;
			System.out.print("Acabou (sim/n�o)...:");
			acabou = ze.nextLine();
		}
		double mediaClasse = soma / qtdAluno;
		System.out.println("M�dia = "+mediaClasse);
	}

}
