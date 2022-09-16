import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String userName, password;
		int right = 3;
		int balance = 1500;
		int select;
		while (right > 0) {
			System.out.print("Kullanici adiniz: ");
			userName = scan.nextLine();
			System.out.print("Parolaniz: ");
			password = scan.nextLine();

			if (userName.equals("patika") && password.equals("dev123")) {
				System.out.println("Merhaba, Kodluyoruz Bankasına Hoşgeldiniz!");
				System.out.println("1-Para yatirma\n" +
	                    "2-Para Cekme\n" +
	                    "3-Bakiye Sorgula\n" +
	                    "4-Cikis Yap");

                System.out.print("Lutfen yapmak istediginiz islemi seciniz : ");
                select = scan.nextInt();
                switch (select) {
				case 1:
                    System.out.print("Yatirilacak Para Miktarı : ");
                    int price = scan.nextInt();
                    scan.nextLine();
                    balance += price;
                    System.out.println("Yeni Bakiye: " + balance);
					break;
					
				case 2:
                    System.out.print("Cekilecek Para Miktarı : ");
                    int price2 = scan.nextInt();
                    scan.nextLine();
                    if (price2 > balance) {
						System.out.println("Yetersiz Bakiye!!!");
					}
                    else {
						balance -= price2;
						System.out.println("Cekilen Tutar: " + price2);
						System.out.println("Yeni Bakiye: " + balance);
					}
                    break;
				case 3:
					System.out.println("Bakiyeniz: " + balance);
					scan.nextLine();
					break;
				case 4: 
					System.out.println("Cikis yapiliyor!!");
					scan.nextLine();
					break;
				default:
					System.out.println("Gecersiz islem!!");
					scan.nextLine();
					break;
				}
			}
			else {
				right--;
				System.out.println("Hatali kullanici adi veya sifre. Tekrar deneyiniz!!");
				if (right == 0) {
					System.out.println("Hesabiniz bloke olmustur lütfen banka ile iletişime giriniz!!");
				}
				else {
					System.out.println("Kalan hakkiniz: " + right);
				}
			}
		}

	}

}
