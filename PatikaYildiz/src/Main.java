import java.util.Iterator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

        Scanner klavye = new Scanner(System.in);
        System.out.println("Bir Sayı Giriniz :");
        int n = klavye.nextInt();

        for (int i = 1; i <n; i++) {
        	for (int j = n; j>i; j--) {
				System.out.print(" ");
			}
        	for (int j = 1; j <=i; j++) {
				System.out.print("*" + " ");
			}
        	System.out.println();
			
		}
        for (int i = 1; i <= n; i++) {
			for (int j = 1; j <=i; j++) {
				System.out.print(" ");
			}
			for (int j = n; j>i; j--) {
				System.out.print("*" + " ");
			}
			System.out.println();
		}

	}

}
