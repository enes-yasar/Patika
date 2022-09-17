import java.util.Scanner;

public class Main {
	private static int isPrime(int num, int i) {
		
		if (i == 1) {
			return 1;
		} else if (num % i == 0) {
			return 0;
		}else {
			return isPrime(num, i - 1);
		}
			

	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Bir sayi giriniz:");
		int number = scan.nextInt();
		int prime = isPrime(number, number/2);
		if (prime == 1) {
			System.out.println(number + " sayisi asaldir.");
		}
		else {
			System.out.println(number + " sayisi asal degildir.");
		}
	}

}
