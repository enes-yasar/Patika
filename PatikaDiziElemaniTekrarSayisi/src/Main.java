import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Dizi kac elemanli olsun: ");
		int n = scan.nextInt();
		int[] A = new int[n];
		int count = 0;

		for (int i = 0; i < A.length; i++) {
			System.out.print(i + 1 + ". elemani: ");
			A[i] = scan.nextInt();
		}

		Arrays.sort(A);
		System.out.println("Dizi: " + Arrays.toString(A));
		
		for (int i = 0; i < A.length; i++) {
			count = 0;
			for (int j = 0; j < A.length; j++) {
				if (A[i] == A[j]) {
					count++;

				}
			}

			if (i == 0 && A[i + 1] == A[i]) {
				System.out.println(A[i] + " sayisi " + count + " kez tekrar edildi");
			}

			if (i == 0 && A[i + 1] != A[i]) {
				System.out.println(A[i] + " sayisi " + count + " kez tekrar edildi");
			}

			/*
			 * dizideki elemanlar küçükten büyüğe sıralandığından kendinden bir önceki
			 * eleman ya aynıdır ya farklıdır eğer aynı ise bu elemanı tekrar sayma.
			 */

			if (i != 0 && A[i - 1] != A[i]) {
				System.out.println(A[i] + " sayisi " + count + " kez tekrar edildi");
			}

		}
	}

}
