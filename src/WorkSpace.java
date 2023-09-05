import java.util.Scanner;

public class WorkSpace {

	public static void main(String[] args) {
		// Asal Sayı Bulma Uygulaması
		// Asal Sayı: 1 ve kendisinden başka hiçbir sayıya bölünmeyen sayılara
		// denmektedir.

		Scanner scanner = new Scanner(System.in);
		boolean asalMi = false;

		System.out.println("*****ASAL SAYI BULMA UYGULAMASI*****");
		System.out.println("Lütfen bir sayı giriniz.");

		int sayi = scanner.nextInt();

		for (int i = 2; i < sayi; i++) {
			if (sayi % i == 0) {
				asalMi = false;
				break;
			} else {
				asalMi = true;
			}
		}
		if (asalMi) {
			System.out.println("Girdiğiniz " + sayi + " sayısı asaldır.");
		} else {
			System.out.println("Girdiğiniz " + sayi + " sayısı asal değildir.");
		}
	}

}
