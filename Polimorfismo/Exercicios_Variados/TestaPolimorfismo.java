public class TestaPolimorfismo {
	public static void main(String[] args) {
		Funcionario f1 = new Funcionario(1,"Felipe",212,"Dev");
		Gerente     g1 = new Gerente(2,"Suely",332,"Manager",25);
		RH daniel = new RH();
		
		daniel.imprimeDados(f1);
		daniel.imprimeDados(g1);
	}
}