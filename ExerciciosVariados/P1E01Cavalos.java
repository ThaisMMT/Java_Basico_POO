package Cavalo;

public class P1E01Cavalos {
	public static void main(String[] args) {
		double m = 5000;
		double  h = 3900.00;
		double t = 2000;
		double cavalos;
		
		cavalos = (m * (h/t))/745.6999;
		int cavaloUm =(int)  Math.round(cavalos);
		
		System.out.println("Precisa de " + cavaloUm + " cavalos");
		
		
	}

}
