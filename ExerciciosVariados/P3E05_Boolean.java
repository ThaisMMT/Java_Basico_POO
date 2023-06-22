package P305;

import java.util.Scanner;

public class P3E05_Boolean {
	
	 public static void main(String[] args)  
	   {
	      Scanner teclado = new Scanner(System.in);
	      System.out.println("Digite 6 numeros: ");
	      int[] num = new int[6];
	      for(int i = 0; i < num.length; i++)
	      {
	         num[i] = teclado.nextInt();
	         System.out.println("Numero " + num[i] + " é um numero primo? " + ePrimo(num[i]));
	      }
	   }

	   public static boolean ePrimo(int n)
	   {
	      for(int i = 2; i < n; i++)
	      {
	         if(n % i == 0)
	            return false;
	      }
	      return true;
	   }

	  


}
