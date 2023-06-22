package exemplocalculadora;

public class TestaCalculadora {

	public static void main(String[] args) {
		// criando uma calculadora
		 Calculadora EX = new Calculadora();

		 
		 // usando o método
		 int z = EX.adicao(5,3);
		 System.out.println("1) 5 + 3 = " + z);
		 System.out.println("2) 5 - 3 = " + EX.sub(5,3));
		 System.out.println("3) 5 * 3 = " + EX.mult(5,3));
		 System.out.println("4) 6 / 3 = " + EX.div(6,3));	
		 
		 //tabuada
		 System.out.println("\n2 * 0 = " + EX.mult(2,0));
		 System.out.println("2 * 1 = " + EX.mult(2,1));
		 System.out.println("2 * 2 = " + EX.mult(2,2));
		 System.out.println("2 * 3 = " + EX.mult(2,3));
	}
}
