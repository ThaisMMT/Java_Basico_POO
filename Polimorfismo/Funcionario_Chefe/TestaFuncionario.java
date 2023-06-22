package P4E02;

public class TestaFuncionario {
	public static void main(String[] args) {
		P4E02_Funcionario jose = new P4E02_Funcionario();
		jose.setNome("José da Silva");
		jose.setRg("11.444.555-9");
		jose.setSalarioMensal(5800.0);
		
		System.out.println("Pagamento...: R$ "+jose.pagamento());
		
		P4E02_Chefe maria = new P4E02_Chefe();
		maria.setNome("Maria da Silva");
		maria.setRg("22.333.111-8");
		maria.setSalarioMensal(15900.0);
		maria.setAdicionalChefia(2000.0);
		maria.setContas(1200.0);
		maria.setGastosExtras(3500.0);
		
		System.out.println("Pagamento...: R$ "+maria.pagamentoExtra());
	}

}
