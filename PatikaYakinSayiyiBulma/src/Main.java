import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
        int[] list = {15,12,788,1,-1,-778,2,0};
        int number;
        Scanner input = new Scanner(System.in);
        System.out.println(Arrays.toString(list));
        int min = list[0];
        int max = list[0];
        System.out.print("Bir sayi giriniz: ");
        number = input.nextInt();
        Arrays.sort(list);
       
        for(int i : list){
            if(i > number){
            	max = i;
            	break;
            }
            if (i < number) {
				min = i;
			}
        }
        System.out.println("Girilen sayidan kucuk en yakin sayi: " + min);
        System.out.println("Girilen sayidan buyuk en yakin sayi: " + max);
		
	}

}
