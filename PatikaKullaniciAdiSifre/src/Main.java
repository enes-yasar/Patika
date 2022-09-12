import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String kullaniciAdi = "patika";
		String sifre = "java123";
		String girisSifre, yeniSifre, secim;
		
		System.out.print("Kullanici adi: ");
		kullaniciAdi = scan.nextLine();
		System.out.print("Sifre: ");
		girisSifre = scan.nextLine();
		
		if (girisSifre.equals(sifre)) {
			System.out.println("Basariyla giris yapildi.");
		}
		else {
			System.out.print("Sifreyi yanlis girdiniz.\nSifrenizi degistirmek istermisiniz?(e:evet h:hayir): ");
			secim = scan.nextLine();
			if (secim.equals("e")) {
				System.out.print("Yeni sifre: ");
				yeniSifre = scan.nextLine();
				if (yeniSifre.equals(sifre)) {
					System.out.print("Yeni sifreniz eski sifreyle ayni olamaz lütfen baska bir sifre giriniz!!\nYeni sifre:");
					yeniSifre = scan.nextLine();
					System.out.println("Sifre basariyla degistirildi!");
				}
				else {
					System.out.println("Sifre basariyla degistirildi!");
				}
			}
			else {
				System.out.println("Basariyla cikis yapildi.");
			}
		}
	}

}
