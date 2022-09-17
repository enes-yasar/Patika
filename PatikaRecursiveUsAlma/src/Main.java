import java.util.Scanner;

public class Main {
	static int usAlma(int taban, int us) {
		int sonuc = 0;
		if (us == 0) {
			return 1;
		}
		else if (taban == 1) {
			return 1;
		}
		return taban * usAlma(taban, us-1);
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Taban sayiyi giriniz: ");
		int taban = scanner.nextInt();
		System.out.print("Us sayiyi giriniz: ");
		int us = scanner.nextInt();
		System.out.println("SONUC: " + usAlma(taban, us));

	}

}
