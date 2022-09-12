import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		double armutFiyat = 2.14;
		double elmaFiyat = 3.67;
		double domatesFiyat = 1.11;
		double muzFiyat = 0.95;
		double patlicanFiyat = 5.00;
		
		double armutKilo, elmaKilo, domatesKilo, muzKilo, patlicanKilo, toplam;	
		Scanner scan = new Scanner(System.in);
		System.out.print("Armut kac kilo: ");
		armutKilo = scan.nextDouble();
		System.out.print("Elma kac kilo: ");
		elmaKilo = scan.nextDouble();
		System.out.print("Domates kac kilo: ");
		domatesKilo = scan.nextDouble();
		System.out.print("Muz kac kilo: ");
		muzKilo = scan.nextDouble();
		System.out.print("Patlican kac kilo: ");
		patlicanKilo = scan.nextDouble();
		
		toplam = ((armutFiyat * armutKilo) + (elmaFiyat * elmaKilo) + (domatesFiyat * domatesKilo) + (muzFiyat * muzKilo) + (patlicanFiyat * patlicanKilo));
		System.out.println("Toplam fiyat: " + toplam);
		
	}

}
