package P2E01;

public class P2E01_Funcionario {
	
		
			private int codFunc;
			private String nomeFunc;
			private double salarioMensal;
			
			public P2E01_Funcionario () {}
			public P2E01_Funcionario(int codFunc, String nomeFunc, double salarioMensal) {
				this.codFunc = codFunc;
				this.nomeFunc = nomeFunc;
				this.salarioMensal = salarioMensal;
				
		}


			public int getCodFunc() {
				return codFunc;
			}


			public void setCodFunc(int codFunc) {
				this.codFunc = codFunc;
			}


			public String getNomeFunc() {
				return nomeFunc;
			}


			public void setNomeFunc(String nomeFunc) {
				this.nomeFunc = nomeFunc;
			}


			public double getSalarioMensal() {
				return salarioMensal;
			}


			public void setSalarioMensal(double salarioMensal) {
				this.salarioMensal = salarioMensal;
			}
		
			public double getSalarioAnual () {
				return this.salarioMensal * 12;
			}
			
			public void setAumento (double percentual) {
				this.salarioMensal = this.salarioMensal * (1.0 + percentual/100.0);
			}
}
