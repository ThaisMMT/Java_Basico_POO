public class Funcionario implements Impressora {
	private int idFuncionario;
	private String nomeFuncionario;
	
	public Funcionario(int idFuncionario, String nomeFuncionario) {
		this.idFuncionario = idFuncionario;
		this.nomeFuncionario = nomeFuncionario;
	}

	public int getIdFuncionario() {
		return idFuncionario;
	}

	public String getNomeFuncionario() {
		return nomeFuncionario;
	}

	public void setIdFuncionario(int idFuncionario) {
		this.idFuncionario = idFuncionario;
	}

	public void setNomeFuncionario(String nomeFuncionario) {
		this.nomeFuncionario = nomeFuncionario;
	}
	
	public void felizNatal() {
		System.out.println("Feliz natal querido Funcionario.");
		System.out.println("Muita alegria para voc� e sua familia");
	}
	public void dadosPessoais() {
		System.out.println("Dados do Funcionario");
		System.out.println("id......:"+idFuncionario);
		System.out.println("nome....:"+nomeFuncionario);
	}
	public void parabens() {
		System.out.println("Querido Funcionario "+nomeFuncionario+", parab�ns pelo seu anivers�rio");
		System.out.println("Muitas felicidades, muitos anos de vida.");
	}
}