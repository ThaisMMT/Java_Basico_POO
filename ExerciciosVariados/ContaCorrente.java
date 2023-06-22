public class ContaCorrente {
	// atributos
	private int numCC;
	private double saldoCC;
	
	// construtores
	public ContaCorrente() {}
	public ContaCorrente(int numCC, double saldoCC) {
		this.numCC = numCC;
		this.saldoCC = saldoCC;
	}
	
	// getters
	public int getNumCC() {return this.numCC;}
	public double getSaldoCC() {return this.saldoCC;}
	
	// setters
	public void setNumCC(int numCC) {
		this.numCC = numCC;
	}
	
	public void setSaldoCC(double saldoCC) {
		this.saldoCC = saldoCC;
	}
	
	// m�todos pr�prios da classe
	public void depositar(double valor) {
		saldoCC += valor;
	}
	public void sacar(double valor) {
		saldoCC -= valor;
	}
}