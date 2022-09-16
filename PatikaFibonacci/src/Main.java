import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Kac elemanli olsun: ");
		int eleman = input.nextInt();
		int ilkSayi = 0,ikinciSayi = 1, fibonacci;
		System.out.println("1. eleman:" + ilkSayi);
		System.out.println("2. eleman: " + ikinciSayi);
		for (int i = 1; i < eleman; i++) {
			fibonacci = ilkSayi + ikinciSayi;
			System.out.println(i+2+". eleman: " + ilkSayi + " + " + ikinciSayi + " = " +fibonacci);
			ilkSayi = ikinciSayi;
			ikinciSayi = fibonacci;
			
		}

	}

}
