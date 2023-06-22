package P2E04;

public class Aluno {
	
	public static void main (String [] args) {
		
		
		P2E04_AlunoDisciplina aluno = new P2E04_AlunoDisciplina(0, 0, 0);
		
		
		
		aluno.setIdDisciplina(12); 
		
		aluno.setNotaB1(6);
		
		aluno.setNotaB2(10);
		
		System.out.println("Identificação do Aluno: " + aluno.getIdDisciplina());
		System.out.println("Nota do primeiro bimestre: " + aluno.getNotaB1());
		System.out.println("Nota do segundo bimestre: " + aluno.getNotaB2());
		
		
		aluno.getMediaAritmetica();
		
		aluno.getMediaPonderada();
		
		System.out.println("Media aritmetica: " + aluno.getMediaAritmetica());
		System.out.println("Media ponderada: " + aluno.getMediaPonderada());
		
		
		
		
	}

}
