import java.util.Scanner;

public class Main {
	static void ekleCikar(int x) {
		System.out.println(x);
		 if (x <= 0) return;
		ekleCikar(x - 5);
		System.out.println(x);
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Bir sayi giriniz: ");
		int num = scan.nextInt();
		ekleCikar(num);
	}

}
