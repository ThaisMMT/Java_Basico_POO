package P3E01;

public class P3E01_Pessoa {
	
	private static int qtPessoa;
	private static double somaAltura;
	
	public P3E01_Pessoa(int qtPessoa, double somaAltura) {
		this.qtPessoa = qtPessoa;
		this.somaAltura = somaAltura;
	         	        		 
		}

	public int getQtPessoa() {
		return qtPessoa;
	}

	public void setQtPessoa(int qtPessoa) {
		this.qtPessoa = qtPessoa;
	}

	public double getSomaAltura() {
		return somaAltura;
	}

	public Double setSomaAltura(double somaAltura) {
		return this.somaAltura = somaAltura;
	}
	
	public static double getMediaAltura() {
		return somaAltura/qtPessoa;
		
	}

}
