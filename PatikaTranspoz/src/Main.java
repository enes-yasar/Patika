
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Satir sayisi: ");
		int satir = scan.nextInt();
		System.out.print("Sutun sayisi: ");
		int sutun = scan.nextInt();
		int dizi[][] = new int[satir][sutun];
		int transpoz[][] = new int [satir][sutun];
		
		for (int i = 0; i < satir; i++) { 			// döngüyle elemanlari alıyoruz 
			for (int j = 0; j < sutun; j++) {
				System.out.print((i+1) +". satir " + (j+1) + ". eleman: ");
				dizi[i][j] = scan.nextInt();
				transpoz[i][j] = dizi[i][j];
			}
			
		}

		System.out.println("=============NORMAL DIZI===============");
        for(int i = 0; i < satir; i++)
        {
            for(int j = 0; j < sutun; j++)
            {
                System.out.print(dizi[i][j] + "\t"); 		// dizinin normal halini yazdırıyoruz
            }
            System.out.println("\n");
        }
		System.out.println("==============TRANSPOZ=================");
		for (int i = 0; i <sutun; i++) {             	/*satır ve sütunun yerini değistirerek
														transpoz alıp ekrana yazdırıyoruz */
			for (int j = 0; j < satir; j++) {
				System.out.print(transpoz[j][i] + "\t");
			}
			System.out.println("\n");
		}

	}

}
