import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("Dogum yilinizi giriniz: ");
		int dogumYili = scan.nextInt();
        boolean artik = false;
        
        if(dogumYili % 4 == 0)
        {
            if( dogumYili % 100 == 0)
            {
                if ( dogumYili % 400 == 0)
                    artik = true;
                else
                    artik = false;
            }
            else
                artik = true;
        }
        else
            artik = false;
 
        if(artik)
            System.out.println(dogumYili + " artik yildir.");
        else
            System.out.println(dogumYili + " artik yil degildir.");
		

	}

}
