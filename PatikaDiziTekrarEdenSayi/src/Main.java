import java.util.Arrays;

public class Main {

	static boolean isFind(int[] arr, int value) {
		// Aynı sayının olup olmadığını kontrol ediliyor
		for (int i : arr) {
			if (i == value) {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {

		int[] list = { 10, 8, 22, 8, 2, 9, 10, 8, 18, 33, 9, 18,2,15,22,19 };

		int[] duplicate = new int[list.length];

		int startIndex = 0;

		for (int i = 0; i < list.length; i++) {

			for (int k = 0; k < list.length; k++) {

				if ((i != k) && (list[i] == list[k] && (list[i] % 2 == 0))) {
					if (!isFind(duplicate, list[k]))
						duplicate[startIndex++] = list[i];
				}
			}
			

		}
		System.out.println(Arrays.toString(duplicate));

	}
}
