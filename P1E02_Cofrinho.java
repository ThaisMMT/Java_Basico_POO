package P1E02;

public class P1E02_Cofrinho {
	public static void main(String[] args) {
		
		int q1 = 2;
		int q2 = 4;
		int q3 = 25;
		int q4 = 10;
		int q5 = 40;
		int q6 = 80;
		double dolar = 4.95;
		double r; 
		r = (q1 + 0.25 * q2 + 0.25 * q3 + 0.1* q4 + 0.05 * q5 + 0.01 * q6) * dolar;
		int r2 = (int) Math.round(r); 
		
		System.out.println("Voce tem " + r2 + " reais no cofrinho");
		
	}

}
