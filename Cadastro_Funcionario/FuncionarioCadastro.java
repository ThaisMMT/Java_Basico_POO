package P2E01;

public class FuncionarioCadastro {
	
	public static void main(String [] args){
		   P2E01_Funcionario F01 = new P2E01_Funcionario();
		   P2E01_Funcionario F02 = new P2E01_Funcionario(1105,"Elen Durantt", 2300.80);
		   
		   F01.setCodFunc(1200);
		   F01.setNomeFunc("Ana Laura");
		   F01.setSalarioMensal(10900.90);

		   System.out.println("Código\t\tNome\t\t\t\tSalário");
		   System.out.println(F01.getCodFunc()  + "\t\t"+ 
		                      F01.getNomeFunc() + "\t\t"+ 
				              F01.getSalarioMensal());

		   System.out.println(F02.getCodFunc()  + "\t\t"+ 
		                      F02.getNomeFunc() + "\t\t"+ 
				              F02.getSalarioMensal());
		   F01.setAumento(15.0);
		   F02.setAumento(15.0);

		   System.out.println("\nSalário Anual");
		   System.out.println("Código\t\tNome");
		   System.out.println(F01.getCodFunc() + "\t\t" +
		                      F01.getSalarioAnual());
		   System.out.println(F02.getCodFunc() + "\t\t" +
		                      F02.getSalarioAnual());
		   }
		
}


