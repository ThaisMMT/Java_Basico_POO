package exemplos;

public class P6Pre06 {

	public static void main(String[] args) {
		int [] a = {2,5,89,323,1,3};
		
		for(int i =0; i <a.length; i++) {
			//imprime o array
			System.out.print(a[i] + " ");
		}
		
		System.out.println("\n\n----- FOR APRIMORADO -----\n");
		
		//Uma forma mais simplificada do for com dois ponto (:) 
		// FOR aprimorado
		for(int dado:a) {
			System.out.print(dado + " ");
		}
	}

}
