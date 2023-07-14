package EntradadeDados;

import java.util.Locale;
import java.util.Scanner;

public class todosJuntos {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		String x;
		int y;
		char z;
		double s;
		
		x = sc.next();
		y = sc.nextInt();
		z = sc.next().charAt(0);
		s = sc.nextDouble();
		
		System.out.printf("Informe seu nome: Meu nome é %s %n", x);
		System.out.printf("Informe sua idade: Eu tenho %d anos %n", y);
		System.out.printf("Informe seu sexo: %s %n", z);
		System.out.printf("Informe seu salário: R$ %.2f %n", s);
		
		sc.close();


	}

}
