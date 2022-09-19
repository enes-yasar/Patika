import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Dizi kac elemanli olsun: ");
		int eleman = scan.nextInt();
		int[] dizi = new int[eleman];
		for (int i = 0; i <eleman; i++) {
			System.out.print(i+1 +". eleman: ");
			dizi[i] = scan.nextInt();
		}
		System.out.println(Arrays.toString(dizi)); //Normal hali 
		Arrays.sort(dizi);							// Küçükten büyüğe sıralandı
		System.out.println("Siralama: " + Arrays.toString(dizi)); // Küçükten büyüğe sıralanmış hali
	}
}
