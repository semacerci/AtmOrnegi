package javaKitapDenemeleri;

import java.util.Scanner;

public class AtmOrnek {

	public static void main(String[] args) {

		Bakiye bakiye = new Bakiye();

		Scanner kullanici = new Scanner(System.in);

		System.out.println("Atm'ye Ho�geldin");

		System.out.print("Kullan�c� Ad�:");
		String kullaniciAd� = kullanici.nextLine();

		System.out.print("�ifre:");
		String kullaniciSifre = kullanici.nextLine();

		if (kullaniciAd�.equals("sema1") && kullaniciSifre.equals("123")) {
			System.out.println("SEMA �ER�� HESABINA BA�ARIYLA G�R�� YAPILDI");
			System.out.println(bakiye.islemSecenekleri);

			System.out.println("L�tfen Se�iminizi Yap�n");
			String secim = kullanici.nextLine();

			switch (secim) {
			case "1":
				System.out.println("Bakiyeniz:" + bakiye.bilgiler.semaBakiye);
				break;

			case "2":
				System.out.println("�ekmek istedi�iniz Tutar:");
				int cekilecekTutar = kullanici.nextInt();
				if (bakiye.bilgiler.semaBakiye >= cekilecekTutar) {
					bakiye.bilgiler.semaBakiye -= cekilecekTutar;
					System.out.println("Para hesab�n�zdan �ekildi");
					System.out.println("Kalan Bakiyeniz:" + bakiye.bilgiler.semaBakiye);
				} else {
					System.out.println("Bakiye Yetersiz");
				}
				break;
			case "3":
				System.out.println("Ne Kadar Para Yat�rmak �stiyorsunuz:");
				int yatacakTutar = kullanici.nextInt();
				if (yatacakTutar < bakiye.bilgiler.semaBakiye) {
					System.out.println("iban giriniz:");
					kullanici.nextLine();
					 String yatacakIban = kullanici.nextLine();
					if (yatacakIban.equals(bakiye.bilgiler.ugur�BAN)) {
						System.out.println("Para U�ura yat�r�l�yor...");
						bakiye.bilgiler.semaBakiye -= yatacakTutar;
						bakiye.bilgiler.ugurBakiye += yatacakTutar;
						System.out.println("Kalan Bakiyeniz:" + bakiye.bilgiler.semaBakiye);
					}

				}

				break;

			}

		} else if (kullaniciAd�.equals("ugur2") && kullaniciSifre.equals("456")) {
			System.out.println("U�UR �ER�� HESABINA G�R�� YAPILDI");
			System.out.println("L�tfen Se�iminizi Yap�n");
			String secim = kullanici.nextLine();
			System.out.println(bakiye.islemSecenekleri);
		} else {
			System.out.println("Kullan�c� Ad� veya �ifreniz Hatal�!");
		}
	}

}
