package exemplos;

public class UsandoConstrutorMain {

	public static void main(String[] args) {
		 Usando_construtor c01 = new Usando_construtor(15,"Lidiane","xxx.xxx.xxx-xx");
		 c01.exibeDados();
		 
		 Usando_construtor c02 = new Usando_construtor(16,"Maria");
		 c02.setCpfCliente("444.444.444.44");
		 c02.exibeDados();
		 
// --------------------------------USANDO ID AUTOMÁTICO ------------------------------------	
		 Usando_construtor c03 = new Usando_construtor();
		 c03.setNomeCliente("Aline");
		 c03.setCpfCliente("111.111.111-11");
		 c03.exibeDados();
		 
		 Usando_construtor c04 = new Usando_construtor();
		 c04.setNomeCliente("José");
		 c04.setCpfCliente("444.555.444.55");
		 c04.exibeDados();
	}

}
