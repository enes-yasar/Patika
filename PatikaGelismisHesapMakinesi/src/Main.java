import java.awt.datatransfer.SystemFlavorMap;
import java.util.Iterator;
import java.util.Scanner;

import javax.sound.midi.SysexMessage;

public class Main {
	static void toplama() {
		Scanner scan = new Scanner(System.in);
		int sayi, adet, toplam = 0;
		System.out.print("Kac adet sayi gireceksiniz:");
		adet = scan.nextInt();
		for (int i = 1; i <= adet; i++) {
			System.out.println(i + ".sayi");
			sayi = scan.nextInt();
			toplam += sayi;
		}
		System.out.println("Girilen sayilarin toplami: " + toplam);
	}

	static void cikarma() {
		Scanner scan = new Scanner(System.in);
		int sayi, adet, cikarma = 0;
		System.out.print("Kac adet sayi gireceksiniz:");
		adet = scan.nextInt();
		for (int i = 1; i <= adet; i++) {
			System.out.println(i + ".sayi");
			sayi = scan.nextInt();
			if (i == 1) {
				cikarma += sayi;
				continue;
			}
			cikarma -= sayi;
		}
		System.out.println("Girilen sayilarin cikarimi: " + cikarma);
	}

	static void carpma() {
		Scanner scan = new Scanner(System.in);
		int sayi, adet, sonuc = 1;
		System.out.print("Kac adet sayi gireceksiniz: ");
		adet = scan.nextInt();
		for (int i = 1; i <= adet; i++) {
			System.out.print(i + ". sayi:");
			sayi = scan.nextInt();
			sonuc *= sayi;
		}
		System.out.println("Girilen sayilarin carpimi: " + sonuc);
	}

	static void bolme() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Kac adet sayi gireceksiniz:");
		int adet = scan.nextInt();
		double sayi, sonuc = 0.0;
		for (int i = 1; i <= adet; i++) {
			System.out.print(i + ".sayi:");
			sayi = scan.nextDouble();
			if (i != 1 && sayi == 0) {
				System.out.println("Bolen 0 olamaz!!!!");
				continue;
			}
			if (i == 1) {
				sonuc = sayi;
				continue;
			}
			sonuc /= sayi;
		}
		System.out.println("Bolme sonucu: " + sonuc);
	}

	static void usluSayi() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Taban sayiyi giriniz: ");
		int taban = scanner.nextInt();
		System.out.print("Us sayiyi giriniz: ");
		int us = scanner.nextInt();
		System.out.println("Sonuc: " + Math.pow(taban, us));
	}

	static void faktoriyel() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Hangi sayinin faktoriyeli hesaplansın: ");
		int sayi = scan.nextInt();
		int faktoriyel = 1;
		for (int i = 1; i <= sayi; i++) {
			faktoriyel *= i;
		}
		System.out.println("Girilen sayinin faktoriyeli: " + faktoriyel);
	}

	static void modAlma() {
		Scanner scan = new Scanner(System.in);
		int sayi, mod, sonuc;
		System.out.print("Modu alinacak sayi: ");
		sayi = scan.nextInt();
		System.out.print("Kaca gore mod alinsin:");
		mod = scan.nextInt();
		sonuc = sayi % mod;
		System.out.println(sayi + " sayisinin " + mod + " sayisina gore modu: " + sonuc);
	}

	static void dikdortgenAlanCevre() {
		Scanner scan = new Scanner(System.in);
		int kisaKenar, uzunKenar, cevre, alan;
		System.out.print("Kisa kenar: ");
		kisaKenar = scan.nextInt();
		System.out.print("Uzun kenar: ");
		uzunKenar = scan.nextInt();
		cevre = 2 * (uzunKenar + kisaKenar);
		alan = uzunKenar * kisaKenar;
		System.out.println("Cevre: " + cevre + "\nAlan: " + alan);
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("1-Toplama\n2-Cikarma\n3-Carpma\n4-Bolme\n5-Us Alma"
				+ "\n6-Faktoriyel Hesapla\n7-Mod Alma\n8-Dikdortgen Cevre - Alan Hesabi\n0-Cikis");
		System.out.print("Yapilacak islemi secin:");
		int secim = scanner.nextInt();

		switch (secim) {
		case 0:
			System.out.println("Cikis yapiliyor...");
			break;
		case 1:
			toplama();
			break;
		case 2:
			cikarma();
			break;
		case 3:
			carpma();
			break;
		case 4:
			bolme();
			break;
		case 5:
			usluSayi();
			break;
		case 6:
			faktoriyel();
			break;
		case 7:
			modAlma();
			break;
		case 8:
			dikdortgenAlanCevre();
			break;
		default:
			System.out.println("Hatali secim!!!!");
			break;
		}

	}

}
