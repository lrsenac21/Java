package EntradadeDados;

import java.util.Locale;
import java.util.Scanner;

public class string {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		String x;
		x=sc.next();
		System.out.printf("Informe seu nome: %s", x);
		
		sc.close();
	}

}
