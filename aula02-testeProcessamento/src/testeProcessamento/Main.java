package testeProcessamento;

public class Main {

	public static void main(String[] args) {
		int x = 5;
		double y = 2 * x;
		
		System.out.println(x);
		System.out.println(y);
		
		double b, B, h, area;
		b = 6.0;
		h = 5.0;
		B = 8.0;
		
		area = (b+B) / 2.0 * h;
		System.out.println(area);
		
		float c, C, i, areaa;
		c = 6f;
		C = 8f;
		i = 5f;
		areaa = (c+C) / 2f *i;
		System.out.println(areaa);
		
		int a, z;
		double resultado;
		
		a = 5;
		z = 2;
		resultado = (double) a/z;
		System.out.println(resultado);
		
		double l;
		int m;
		
		l = 5.0;
		m = (int) l ;
		System.out.println(m);
	}

}
