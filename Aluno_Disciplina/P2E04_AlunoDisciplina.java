package P2E04;

public class P2E04_AlunoDisciplina {
	
	private int idDisciplina;
	private double notaB1;
	private double notaB2;
	
	
	
	public P2E04_AlunoDisciplina(int idDisciplina, double notaB1, double notaB2) {
		this.idDisciplina = idDisciplina;
		this.notaB1 = notaB1;
		this.notaB2 = notaB2;
	}






	public int getIdDisciplina() {
		return idDisciplina;
	}



	public void setIdDisciplina(int idDisciplina) {
		this.idDisciplina = idDisciplina;
	}



	public double getNotaB1() {
		return notaB1;
	}



	public void setNotaB1(double notaB1) {
		this.notaB1 = notaB1;
	}



	public double getNotaB2() {
		return notaB2;
	}



	public void setNotaB2(double notaB2) {
		this.notaB2 = notaB2;
	}



	public double getMediaAritmetica() {
		return (this.notaB1 + this.notaB2)/2;
	}



	public double getMediaPonderada() {
		return (4 * this.notaB1  + 6 * this.notaB2) /10;
	}


	



	

}
