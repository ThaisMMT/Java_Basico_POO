package P3E03;

import java.util.Scanner;
import java.util.Random;
import java.util.Date;

public class testaTurma {
	static Scanner ze = new Scanner(System.in);
	static Random maria = new Random(new Date().getTime());
	
	public static void main(String[] args) {
		
		P3E03_Turma t1 = new P3E03_Turma();
		t1.setIdTurma(1);
		t1.setQtdAlunos(5);
		t1.setNotas(getNotas(t1.getQtdAlunos()));
		System.out.println("Média da Turma "+
		                    t1.getIdTurma()+
		                    "...: "+
		                    t1.mediaTurma());
		
		P3E03_Turma t2 = new P3E03_Turma(2,100);
		t2.setNotas(getNotasAleatorias(t2.getQtdAlunos()));
		System.out.println("Média da Turma "+
		                    t2.getIdTurma()+
		                    "...: "+
		                    t2.mediaTurma());

		P3E03_Turma t3 = new P3E03_Turma(3,10,getNotasAleatorias(10));
		System.out.println("Média da Turma "+
                t3.getIdTurma()+
                "...: "+
                t3.mediaTurma());
	}
	
	public static double [] getNotas(int qtdAlunos){
		double notasTurma[] = new double[qtdAlunos];
		System.out.println("Informe a nota dos "+qtdAlunos+" alunos");
		for(int i=0; i<qtdAlunos;i++) {
			System.out.print("nota do aluno "+(i+1)+"...: ");
			notasTurma [i] = Double.parseDouble(ze.nextLine());
		}
		return notasTurma;
	}
	
	public static double [] getNotasAleatorias(int qtdAlunos){
		double notasTurma[] = new double[qtdAlunos];
		for(int i=0; i<qtdAlunos;i++) {
			notasTurma [i] = maria.nextDouble()*7.0+3.0;
		}
		return notasTurma;
	} 
}