package P4E01;

public abstract class P4E01_Pessoa {
	protected int id;
	protected String nome;
	public P4E01_Pessoa(int id, String nome) {
		this.id = id;
		this.nome = nome;
	}
	public P4E01_Pessoa() {
	}
	public int getId() {
		return id;
	}
	public String getNome() {
		return nome;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public abstract void imprime();
}