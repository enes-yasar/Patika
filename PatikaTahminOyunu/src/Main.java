import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int tahmin, right;
		int number = (int) (Math.random() * 100);
		System.out.println(number);
		right = 5;
		int[] tahminler = new int[5];
		int index = 0;
		System.out.println("0 - 100 arasında sayi tahmin oyununu hosgelidiniz!");
		while (right > 0) {
			System.out.print("0 - 100 arasinda sayi tahmininizi giriniz:");
			tahmin = scan.nextInt();
			if (tahmin == number) {
				System.out.println("Tebrikler! Dogru tahmin ettiniz");
				break;
			}
			if (tahmin > number) {
				System.out.println("Tahmininiz gizli sayidan buyuk");
				right--;
				tahminler[index] = tahmin;
				index++;
				System.out.println("Kalan tahmin hakkiniz: " + right);
			}
			if (tahmin < number) {
				System.out.println("Tahmininiz gizli sayidan kucuk");
				right--;
				System.out.println("Kalan tahmin hakkiniz: " + right);
				tahminler[index] = tahmin;
				index++;
			}
			if (right ==0) {
				System.out.println("Tahmin hakkiniz kalmamistir.");
				System.out.println("Gizli sayi: " + number);
			}
		}
		System.out.println("Tahminleriniz:"+ Arrays.toString(tahminler));
	}

}
