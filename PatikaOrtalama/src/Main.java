import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Matematik notunuz: ");
		int matNot = scan.nextInt();
		
		System.out.print("Fizik notunuz: ");
		int fızNot = scan.nextInt();
		
		System.out.print("Kimya notunuz: ");
		int kımNot = scan.nextInt();
		
		System.out.print("Turkce notunuz: ");
		int turNot = scan.nextInt();
		
		System.out.print("Tarih notunuz: ");
		int tarNot = scan.nextInt();
		
		System.out.print("Muzik notunuz: ");
		int muzNot = scan.nextInt();
		
		double toplamNot = matNot + fızNot + kımNot + turNot +tarNot + muzNot;
		double ortalama = toplamNot / 6;
		System.out.println("Ortalama: " + ortalama);
		
		boolean kontrol = ortalama >= 60;
		String durum = kontrol ? "Sinifi gecti" : "Sınıfta kaldi";
		System.out.println(durum);
		

	}

}
