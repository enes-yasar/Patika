import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n1,n2,ebob=1, ekok = 1;
		int sayac = 1;
		System.out.print("Ilk sayiyi sayisini giriniz: ");
		n1 = scan.nextInt();
		System.out.print("Ikinci sayisini giriniz: ");
		n2 = scan.nextInt();
		
		if (n1 < n2) {
			while (sayac <= n1) {
				if (n1 % sayac == 0 && n2 % sayac == 0) {
					ebob = sayac;
				}
				
				sayac++;
			}
			
			System.out.println("EBOB: " + ebob);
			
		}
		else {
			while (sayac <= n1) {
				if (n1 % sayac == 0 && n2 % sayac == 0) {
					ebob = sayac;
				}

				sayac++;
			}
			System.out.println("EBOB: " + ebob);
			
		}
		System.out.println("------------------EKOK--------------------------");
		while (sayac <= (n1 * n2)) {
			if (sayac % n1 == 0 && sayac % n2 == 0) {
				ekok = sayac;
				break;
			}
			sayac++;
		}
		System.out.println("EKOK: " + ekok);

	}

}
