import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.print("Dogum yilinizi giriniz: ");

		String dogumYili = scan.nextLine();

		try {
			int cinZodyagi = Integer.parseInt(dogumYili);
			if (cinZodyagi % 12 == 0) {
				System.out.println("Cin Zodyagi Burcunuz: Maymun");
			} else if (cinZodyagi % 12 == 1) {
				System.out.println("Cin Zodyagi Burcunuz: Horoz");
			} else if (cinZodyagi % 12 == 2) {
				System.out.println("Cin Zodyagi Burcunuz: Kopek");
			} else if (cinZodyagi % 12 == 3) {
				System.out.println("Cin Zodyagi Burcunuz: Domuz");
			} else if (cinZodyagi % 12 == 4) {
				System.out.println("Cin Zodyagi Burcunuz: Fare");
			} else if (cinZodyagi % 12 == 5) {
				System.out.println("Cin Zodyagi Burcunuz: Okuz");
			} else if (cinZodyagi % 12 == 6) {
				System.out.println("Cin Zodyagi Burcunuz: Kaplan");
			} else if (cinZodyagi % 12 == 7) {
				System.out.println("Cin Zodyagi Burcunuz: Tavsan");
			} else if (cinZodyagi % 12 == 8) {
				System.out.println("Cin ZodyagıiBurcunuz: Ejderha");
			} else if (cinZodyagi % 12 == 9) {
				System.out.println("Cin Zodyagi Burcunuz: Yılan");
			} else if (cinZodyagi % 12 == 10) {
				System.out.println("Cin Zodyagi Burcunuz: At");
			} else if (cinZodyagi % 12 == 11) {
				System.out.println("Cin Zodyagi Burcunuz: Koyun");
			}

		} catch (Exception e) {

			System.out.println("Hatali veri girisi! Lutfen dogum yilinizi giriniz!"); // int veri tipi dışında veri girşinde hata vermesini sağladık
		}

	}

}
