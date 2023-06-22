package exemplos;

public class ArrayString {

	public static void main(String[] args) {
		// concatena string no array
		String [] s=new String [3];
	    s [0]="a";
	    s [1]="b";
	    s [2]="c";

	    String concatena = "";

	    for (String item : s) {
	        concatena = concatena.concat(item);
	    }
	    System.out.println(concatena);

	}

}
