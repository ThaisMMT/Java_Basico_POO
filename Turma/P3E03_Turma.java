package P3E03;

public class P3E03_Turma {
	
	private int idTurma;
	private int qtdAlunos;
	private double [] notas;
	
	public P3E03_Turma() {}
	
	public P3E03_Turma(int idTurma, int qtdAlunos) {
		this.idTurma = idTurma;
		this.qtdAlunos = qtdAlunos;
	}
	
	public P3E03_Turma(int idTurma, int qtdAlunos, double[] notas) {
		this.idTurma = idTurma;
		this.qtdAlunos = qtdAlunos;
		this.notas = notas;
	}

	public int getIdTurma() {
		return idTurma;
	}

	public int getQtdAlunos() {
		return qtdAlunos;
	}

	public double[] getNotas() {
		return notas;
	}

	public void setIdTurma(int idTurma) {
		this.idTurma = idTurma;
	}

	public void setQtdAlunos(int qtdAlunos) {
		this.qtdAlunos = qtdAlunos;
	}

	public void setNotas(double[] notas) {
		this.notas = notas;
	}

	public double mediaTurma() {
		double soma = 0.0;
		for(double n:notas) {
			soma = soma + n;
		}		
		return soma/notas.length;
	}
}
