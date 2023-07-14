package EntradadeDados;

import java.util.Locale;
import java.util.Scanner;

public class charSat {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		char x;
		
		x = sc.next().charAt(0);
		
		System.out.printf("Informe seu sexo: %s %n", x);
				
		sc.close();

	}

}
