import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int yas,mesafe,yolculukTipi;
		double kmTutar = 0.10;
		double gidisDonusIndirimOrani = 0.20;
		double normalTutar, yasIndirimOrani,indirimliTutar,gidisDonusIndirimi, yasIndirimi, toplamTutar;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Yasinizi giriniz: ");
		yas = scan.nextInt();
		System.out.print("Mesafeyi giriniz giriniz(km): ");
		mesafe = scan.nextInt();
		System.out.print("Yolculuk tipini giriniz(1-gidis,2-gidis-donus): ");
		yolculukTipi = scan.nextInt();
		normalTutar = kmTutar * mesafe; 
		
		if (yas <= 0 || mesafe <= 0 || yolculukTipi != 1 && yolculukTipi != 2 ) {
			System.out.println("Hatali veri girisi!!");
		}
		else if (yas < 12) {
			// İLK NORMAL TUTAR HESAPLANDI
			System.out.println("Normal tutar: TL" + normalTutar);
			// yolculuk tipine göre indirim yapıldı 
			
			if (yolculukTipi == 2) {
				
				yasIndirimOrani = 0.5;
				yasIndirimi = normalTutar * yasIndirimOrani;                                   // yas indirimi yapıldı
				System.out.println("Yas indirimi: TL" + yasIndirimi);
				
				indirimliTutar = normalTutar - yasIndirimi;
				gidisDonusIndirimi = indirimliTutar * gidisDonusIndirimOrani;                // gidis - donus indirimi yapıldı
				
				System.out.println("Gidis - donus indirimi: TL" + gidisDonusIndirimi);
				indirimliTutar -= gidisDonusIndirimi;                                     // tüm indirimler indirimli tutara aktarıldı
				
				System.out.println("Indirimli tutar: TL" + indirimliTutar);
				
				toplamTutar = indirimliTutar * 2;                                          // gidis - dönüş ödenecek tutar  
				System.out.println(" Indirimli toplam tutar: TL" + toplamTutar);
			}
			else {
				
				yasIndirimOrani = 0.5;
				yasIndirimi = normalTutar * yasIndirimOrani;                             // yas indirimi yapıldı
				System.out.println("Yas indirimi: TL" + yasIndirimi);			
				indirimliTutar = normalTutar - yasIndirimi;
				System.out.println("Indirimli tutar: TL" + indirimliTutar);
			}
			
		}
		else if (yas >= 12 && yas<= 24 ) {
			
			System.out.println("Normal tutar: TL" + normalTutar);	
			
			if (yolculukTipi == 2) {
				yasIndirimOrani = 0.10;
				yasIndirimi = normalTutar * yasIndirimOrani;                            // yas indirimi yapıldı
				System.out.println("Yas indirimi: TL" + yasIndirimi);
				
				indirimliTutar = normalTutar - yasIndirimi;
				gidisDonusIndirimi = indirimliTutar * gidisDonusIndirimOrani;          // gidis - dönüş indirimi yapıldı
				System.out.println("Gidis - donus indirimi: TL" + gidisDonusIndirimi);
				
				indirimliTutar -= gidisDonusIndirimi;
				System.out.println("Indirimli tutar: TL" + indirimliTutar);
				toplamTutar = indirimliTutar * 2 ;									// gidis - dönüş ödenecek tutar 
				System.out.println("Indirimli toplam tutar: TL" + toplamTutar);
			}
			else {
				yasIndirimOrani = 0.10;
				yasIndirimi = normalTutar * yasIndirimOrani;					// yas indirimi yapıldı
				System.out.println("Yas indirimi: TL" + yasIndirimi);
				indirimliTutar = normalTutar - yasIndirimi;
				System.out.println("Indirimli tutar: TL" + indirimliTutar);
			}
		}
		else if (yas >= 65) {
			System.out.println("Normal tutar: TL" + normalTutar);
			
			if (yolculukTipi == 2) {
				
				yasIndirimOrani = 0.30;
				yasIndirimi = normalTutar * yasIndirimOrani;			// yas indirimi yapıldı
				System.out.println("Yas indirimi: TL" + yasIndirimi);
				
				indirimliTutar = normalTutar - yasIndirimi;
				gidisDonusIndirimi = indirimliTutar * gidisDonusIndirimOrani;  // gidis - dönüş indirimi yapıldı
				System.out.println("Gidis - donus indirimi: TL" + gidisDonusIndirimi);
				
				indirimliTutar -= gidisDonusIndirimi;
				System.out.println("Indirimli tutar: TL" + indirimliTutar);
				toplamTutar = indirimliTutar * 2 ;								// gidiş - dönüş ödenecek tutar
				System.out.println("Indirimli toplam tutar: TL" + toplamTutar);
			}
			else {
				yasIndirimOrani = 0.30;
				yasIndirimi = normalTutar * yasIndirimOrani;				// yaş indirimi yapıldı
				System.out.println("Yas indirimi: TL" + yasIndirimi);
				indirimliTutar = normalTutar - yasIndirimi;
				System.out.println("Indirimli tutar: TL" + indirimliTutar);
			}
		}
		else {													// yaş indirim kriterlerine uymayan kısım
			if (yolculukTipi == 2) {
				normalTutar = mesafe * kmTutar;
				System.out.println("Normal tutar: TL" + normalTutar);
				
				gidisDonusIndirimi = normalTutar * gidisDonusIndirimOrani; // gidiş dönüş indirimi yapıldı
				normalTutar -= gidisDonusIndirimi;
				System.out.println("Gidis - donus indirimli tutar: TL" + normalTutar);
			}
			else {
				normalTutar = mesafe * kmTutar;							
				System.out.println("Toplam tutar: TL" + normalTutar);
			}
		}
	}

}
