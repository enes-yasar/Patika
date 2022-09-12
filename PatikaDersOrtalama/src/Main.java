import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int matematik, fizik, kimya, turkce, muzik;
		double ortalama;
		int dersSayisi=0;
		int toplamNot = 0;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Matematik notunuz: ");
		matematik = scan.nextInt();
		
		if(matematik > 0 && matematik < 100) {
			
			toplamNot += matematik;
			dersSayisi++;
		}
		
		System.out.print("Fizik notunuz: ");
		fizik = scan.nextInt();
		if (fizik > 0 && fizik < 100) {
			
			toplamNot += fizik;
			dersSayisi++;
		}
		
		System.out.print("Kimya notunuz: ");
		kimya = scan.nextInt();
		if (kimya > 0 && kimya < 100) {
			toplamNot += kimya;
			dersSayisi++;
		}
		
		System.out.print("Turkce notunuz: ");
		turkce = scan.nextInt();
		if (turkce > 0 && turkce < 100) {
			toplamNot += turkce;
			dersSayisi++;
		}
		
		System.out.print("Muzik notunuz: ");
		muzik = scan.nextInt();
		if (muzik > 0 && muzik < 100) {
			toplamNot += muzik;
			dersSayisi++;
		}
		ortalama = (double)toplamNot / dersSayisi;
		
		if (ortalama < 55) {
			System.out.println(ortalama + " Ortalamayla sinifta kaldiniz!!");
		}
		else {
			System.out.println(ortalama + " Ortalamayla sinifi basariyla gectiniz!!");
		}
		
		
	}

}
