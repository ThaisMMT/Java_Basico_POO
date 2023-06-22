package P1E03;

public class P1E03_Graus {
	public static void main(String[] args) {
		
		double c = 35;
		double f;
		double k;
		double Ra;
		double Re;
		
		f = (c*1.8) + 32;
		k = c + 273.15;
		Ra = (c * 1.8) + 32 + 459.67;
		Re = c * 0.8;
		
		System.out.println(c + " Graus Celcius em Fahrenheit " + f );
		System.out.println(c + " Graus Celcius em Kelvin " + k );
		System.out.println(c + " Graus Celcius em Reaumur " + Re );
		System.out.println(c + " Graus Celcius em Rankine " + Ra );
	}

}
