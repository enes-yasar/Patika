import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Sicakligi giriniz: ");
		int sicaklik = scan.nextInt();
		if (sicaklik <= 5) {
			System.out.println("Kayak yapabilirsiz.");
		}
		else if (sicaklik > 5 && sicaklik <= 15  ) {
			System.out.println("Sinemaya gidebilirsiniz.");
		}
		else if (sicaklik > 15 && sicaklik <= 25) {
			System.out.println("Piknik yapabilirsiniz");
		}
		else if (sicaklik > 25) {
			System.out.println("Yüzmeye gidebilirsiniz.");
		}
	}

}
