import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Oyun olusmasi icin satir giriniz:");
		int satir = scan.nextInt();
		System.out.print("Oyun olusmasi icin sutun giriniz:");
		int sutun = scan.nextInt();
		MineSweeper mine = new MineSweeper(satir, sutun);
		mine.run();
	}

}
