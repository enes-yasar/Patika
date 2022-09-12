import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		double pi =3.14;
		int r, a;
		
		System.out.print("Daire yaricapini giriniz: ");
		r = scan.nextInt();
		
		System.out.print("Daire merkez aci olcusunu giriniz: ");
		a = scan.nextInt();
		
		double alan = (pi * r * r * a) / 360;
		
		System.out.println("Daire alani: " + alan);

	}

}
