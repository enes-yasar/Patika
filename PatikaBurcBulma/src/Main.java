import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner giris = new Scanner(System.in);
		int ay, gun;
		String burc = null;
		System.out.println("Burc Hesaplama");
		System.out.print("Lütfen ay giriniz(1 ile 12 arasinda)=");
		ay = giris.nextInt();
		while (ay < 1 || ay > 12) {
			System.out.print("Lutfen ay giriniz(1 ile 12 arasinda)=");
			ay = giris.nextInt();
		}
		System.out.print("Lutfen gun giriniz(1 den 31 e kadar)=");
		gun = giris.nextInt();
		while (gun < 1 || gun > 31) {
			System.out.print("Lutfen gun giriniz(1 den 31 e kadar)=");
			gun = giris.nextInt();
		}
		if (ay == 1) {
			if (gun <= 19) {
				burc = "oglak";
			}
			if (gun > 19) {
				burc = "kova";
			}
		}
		if (ay == 2) {
			if (gun <= 18) {
				burc = "kova";
			}
			if (gun > 18) {
				burc = "balik";
			}
		}
		if (ay == 3) {
			if (gun <= 19) {
				burc = "balik";
			}
			if (gun > 19) {
				burc = "koc";
			}
		}
		if (ay == 4) {
			if (gun <= 19) {
				burc = "koc";
			}
			if (gun > 19) {
				burc = "boga";
			}
		}
		if (ay == 5) {
			if (gun <= 20) {
				burc = "boga";
			}
			if (gun > 20) {
				burc = "ikizler";
			}
		}
		if (ay == 6) {
			if (gun <= 21) {
				burc = "ikizler";
			}
			if (gun > 21) {
				burc = "yengec";
			}
		}
		if (ay == 7) {
			if (gun <= 22) {
				burc = "yengec";
			}
			if (gun > 22) {
				burc = "aslan";
			}
		}
		if (ay == 8) {
			if (gun <= 22) {
				burc = "aslan";
			}
			if (gun > 22) {
				burc = "basak";
			}
		}
		if (ay == 9) {
			if (gun <= 22) {
				burc = "basak";
			}
			if (gun > 22) {
				burc = "terazi";
			}
		}
		if (ay == 10) {
			if (gun <= 22) {
				burc = "terazi";
			}
			if (gun > 22) {
				burc = "akrep";
			}
		}
		if (ay == 11) {
			if (gun <= 21) {
				burc = "akrep";
			}
			if (gun > 21) {
				burc = "yay";
			}
		}
		if (ay == 12) {
			if (gun <= 21) {
				burc = "yay";
			}
			if (gun > 21) {
				burc = "oglak";
			}
		}
		System.out.println("Burcunuz: " + burc);
	}

}
