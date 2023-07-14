package EntradadeDados;

import java.util.Locale;
import java.util.Scanner;

public class Double {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		double x;
		x = sc.nextDouble();
		
		System.out.printf("Informe sua renda: R$ %.2f Reais", x);
		sc.close();

	}

}
