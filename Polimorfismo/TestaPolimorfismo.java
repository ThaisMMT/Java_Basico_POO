package P4E01;

public class TestaPolimorfismo {
	public static void main(String[] args) {
		P4E01_Funcionario f1 = new P4E01_Funcionario(1,"Felipe",212,"Dev");
		P4E01_Gerente     g1 = new P4E01_Gerente(2,"Suely",332,"Manager",25);
		P4E01_Rh daniel = new P4E01_Rh();
		
		daniel.imprimeDados(f1);
		daniel.imprimeDados(g1);
	}
}