package exemplos;

public class Cliente_Private {
	//atributos de instância com private
	private int idCliente;
	private String nomeCliente;
	private String cpfCliente;
	private double limiteCliente;
	
// ---------------------METODO GETTERS E SETTERS DE TODOS-----------------------------------------
	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public String getCpfCliente() {
		return cpfCliente;
	}

	public void setCpfCliente(String cpfCliente) {
		this.cpfCliente = cpfCliente;
	}

	public double getLimiteCliente() {
		return limiteCliente;
	}

	public void setLimiteCliente(double limiteCliente) {
		this.limiteCliente = limiteCliente;
	}

	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}
	
	public int getIdCliente() {
		return idCliente;
	}
}
