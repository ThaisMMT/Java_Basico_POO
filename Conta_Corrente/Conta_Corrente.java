package P2E03;

public class Conta_Corrente {
	public static void main(String [] arg) {
		 P2E03_ContaCorrente  ccPrimeiro = new P2E03_ContaCorrente  (0,0);
		 P2E03_ContaCorrente  ccSegundo = new P2E03_ContaCorrente  (0,0);
		 
		 ccPrimeiro.setNumCC(80);
		 ccPrimeiro.setSaldoCC(5900);
		 
		 ccSegundo.setNumCC(90);
		 ccSegundo.setSaldoCC(200);
		 
		 System.out.println("Numero da conta: " 
				 			+ ccPrimeiro.getNumCC() + ", " 
				 			+ " Saldo da conta é: "  
				 			+ ccPrimeiro.getSaldoCC() + ", " 
				 			+ " Saldo com o deposito: " 
				 			+ ccPrimeiro.getdepositar(50) + ", " 
				 			+ " Saldo com o saque: " 
				 			+ ccPrimeiro.getsacar(100));
		 
		 System.out.println("Numero da conta: " 
		 			+ ccSegundo.getNumCC() + ", " 
		 			+ " Saldo da conta é: " 
		 			+ ccSegundo.getSaldoCC() + ", " 
		 			+ " Saldo com deposito: " 
		 			+ ccSegundo.getdepositar(1000) + ", " 
		 			+ " Saldo com o saque: " 
		 			+ ccSegundo.getsacar(400));
		 		 
		 
		 
		 
	}

}
