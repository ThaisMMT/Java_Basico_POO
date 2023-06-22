package P4E01;

public class P4E01_Gerente extends P4E01_Funcionario {
	private int qtdFunc;

	public P4E01_Gerente() {}
	public P4E01_Gerente(int id, String nome, int idFunc, String cargo, int qtdFunc) {
		super(id, nome, idFunc, cargo);
		this.qtdFunc = qtdFunc;
	}
	public int getQtdFunc() {
		return qtdFunc;
	}
	public void setQtdFunc(int qtdFunc) {
		this.qtdFunc = qtdFunc;
	}

	public void imprime() {
		System.out.println("Gerente...: "+nome);
	}
}

