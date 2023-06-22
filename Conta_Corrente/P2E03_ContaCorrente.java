package P2E03;

public class P2E03_ContaCorrente {
	private int numCC;
	private int saldoCC;
	
	public P2E03_ContaCorrente(int numCC, int saldoCC) {
		this.numCC = numCC;
		this.saldoCC = saldoCC;
	}

	public int getNumCC() {
		return numCC;
	}

	public void setNumCC(int numCC) {
		this.numCC = numCC;
	}

	public int getSaldoCC() {
		return saldoCC;
	}

	public void setSaldoCC(int saldoCC) {
		this.saldoCC = saldoCC;
	}
	
	public double getdepositar(double valor) {
		return saldoCC += valor;	
	}
	
	public double getsacar(double valor) {
		return saldoCC -= valor;
	}
	

}
