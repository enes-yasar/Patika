import java.util.Scanner;

public class Main {
	
	static boolean isPalindrom(int number) {
		
		int temp = number, reverseNumber = 0, lastNumber;
		System.out.println("Girilen sayi =>" + temp);
		
		while (temp != 0) {				
			lastNumber = temp % 10;		
			reverseNumber = (reverseNumber * 10) + lastNumber;			
			temp /= 10;
		}
		System.out.println("Ters alinmis hali =>" + reverseNumber);
		if (number == reverseNumber) {
			System.out.println("Girilen sayi polindrom");
		}
		else {
			System.out.println("Girilen sayi polindrom degil");
		}
		return true;
	}
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);	
		System.out.print("Kontol edilecek sayiyi giriniz: ");
		int number = input.nextInt();
		isPalindrom(number);


	}

}
