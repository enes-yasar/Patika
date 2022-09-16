
public class Main {

	public static void main(String[] args) {
		int asal;
		for (int i = 1; i <=100; i++) {
			asal = 0;
			for (int j = 1; j <=100; j++) {
				if (i % j == 0) {
					asal++;
				}
			}
			if (asal == 2) {
				System.out.println(i);
			}
			
		}

	}

}
