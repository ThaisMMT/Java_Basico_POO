package exemplos;

public class Usando_construtor {
	private int idCliente;
	private String nomeCliente;
	private String cpfCliente;
	
	//atributo static
	private static int id;

// --------------------------------USANDO ID AUTOMÁTICO ------------------------------------	
	public Usando_construtor() {
		id++;
		this.idCliente=id;
	}
// ---------------------CONSTRUTOR COM 3 ELEMENTOS---------------------------------------------
	public Usando_construtor(int idCliente, String nomeCliente, String cpfCliente) {
		this.setIdCliente(idCliente);
		this.setNomeCliente(nomeCliente);
		this.setCpfCliente(cpfCliente);
	}
	
// ---------------------CONSTRUTOR COM 2 ELEMENTOS---------------------------------------------
	public Usando_construtor(int idCliente, String nomeCliente) {
		this.setIdCliente(idCliente);
		this.setNomeCliente(nomeCliente);
	}

// ----------------------------GETTERS E SETTERS---------------------------------------------
	public int getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}

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
	
// ---------------------METODO PARA EXIBIR---------------------------------------------
	public void exibeDados() {
		System.out.println("id......."+idCliente);
		System.out.println("Nome......."+nomeCliente);
		System.out.println("CPF......."+cpfCliente+"\n");
	}
}
