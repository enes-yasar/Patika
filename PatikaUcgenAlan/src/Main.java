import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("1. kenari giriniz: ");
		int kenar1 = scan.nextInt();
		System.out.print("2. kenari giriniz: ");
		int kenar2 = scan.nextInt();
		System.out.print("3. kenari giriniz: ");
		int kenar3 = scan.nextInt();
		
		int u = (kenar1 + kenar2 + kenar3) / 2;
		int cevre = 2 * u;
		double sonuc = u * (u - kenar1) * (u - kenar2) * (u - kenar3); 
		double alan = Math.sqrt(sonuc);
		
		System.out.println("Ucgenin cevresi: " + cevre);
		System.out.println("Ucgenin alaiı: " + alan);
	}

}
