package exemplos;

public class ArraysComoParametros {

	public static void main(String[] args) {
		// declarando array
		int b[] = {5,3,8,7,9};
		int m[] = {2,4,6,8};
		
		// puxa o metodo
		imprime(b);
		imprime(m);
	}
	
	// Arrays como parâmetros
	public static void imprime(int [] a) {
		
		for(int i=0; i< a.length; i++) {
			//imprime o array
			System.out.print(a[i]+" ");
		}
		
		System.out.print("\n");
	}

}
