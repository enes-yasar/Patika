
public class Main {

	public static void main(String[] args) {

		double toplam = 0.0;
		double ortalama;
		double dizi[] = {3,4,5,6,8};
		for (int i = 0; i < dizi.length; i++) {
			toplam += (1 / (dizi[i]));
			System.out.println("Toplam: " + toplam);
		}
		ortalama = dizi.length / toplam;
		System.out.println("Harmonik Ortalama: " + ortalama);
	}

}
