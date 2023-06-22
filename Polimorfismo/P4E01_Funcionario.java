package P4E01;

public class P4E01_Funcionario extends P4E01_Pessoa {
	protected int idFunc;
	protected String cargo;
	
	public P4E01_Funcionario() {}
	public P4E01_Funcionario(int id, String nome, int idFunc, String cargo) {
		super(id, nome);
		this.idFunc = idFunc;
		this.cargo = cargo;
	}
	
	public int getIdFunc() {
		return idFunc;
	}
	public String getCargo() {
		return cargo;
	}
	public void setIdFunc(int idFunc) {
		this.idFunc = idFunc;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	
	public void imprime() {
		System.out.println("Funcionário...: "+nome);
	}

}
