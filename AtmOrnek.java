package javaKitapDenemeleri;

import java.util.Scanner;

public class AtmOrnek {

	public static void main(String[] args) {

		Bakiye bakiye = new Bakiye();

		Scanner kullanici = new Scanner(System.in);

		System.out.println("Atm'ye Hoþgeldin");

		System.out.print("Kullanýcý Adý:");
		String kullaniciAdý = kullanici.nextLine();

		System.out.print("Þifre:");
		String kullaniciSifre = kullanici.nextLine();

		if (kullaniciAdý.equals("sema1") && kullaniciSifre.equals("123")) {
			System.out.println("SEMA ÇERÇÝ HESABINA BAÞARIYLA GÝRÝÞ YAPILDI");
			System.out.println(bakiye.islemSecenekleri);

			System.out.println("Lütfen Seçiminizi Yapýn");
			String secim = kullanici.nextLine();

			switch (secim) {
			case "1":
				System.out.println("Bakiyeniz:" + bakiye.bilgiler.semaBakiye);
				break;

			case "2":
				System.out.println("Çekmek istediðiniz Tutar:");
				int cekilecekTutar = kullanici.nextInt();
				if (bakiye.bilgiler.semaBakiye >= cekilecekTutar) {
					bakiye.bilgiler.semaBakiye -= cekilecekTutar;
					System.out.println("Para hesabýnýzdan çekildi");
					System.out.println("Kalan Bakiyeniz:" + bakiye.bilgiler.semaBakiye);
				} else {
					System.out.println("Bakiye Yetersiz");
				}
				break;
			case "3":
				System.out.println("Ne Kadar Para Yatýrmak Ýstiyorsunuz:");
				int yatacakTutar = kullanici.nextInt();
				if (yatacakTutar < bakiye.bilgiler.semaBakiye) {
					System.out.println("iban giriniz:");
					kullanici.nextLine();
					 String yatacakIban = kullanici.nextLine();
					if (yatacakIban.equals(bakiye.bilgiler.ugurÝBAN)) {
						System.out.println("Para Uðura yatýrýlýyor...");
						bakiye.bilgiler.semaBakiye -= yatacakTutar;
						bakiye.bilgiler.ugurBakiye += yatacakTutar;
						System.out.println("Kalan Bakiyeniz:" + bakiye.bilgiler.semaBakiye);
					}

				}

				break;

			}

		} else if (kullaniciAdý.equals("ugur2") && kullaniciSifre.equals("456")) {
			System.out.println("UÐUR ÇERÇÝ HESABINA GÝRÝÞ YAPILDI");
			System.out.println("Lütfen Seçiminizi Yapýn");
			String secim = kullanici.nextLine();
			System.out.println(bakiye.islemSecenekleri);
		} else {
			System.out.println("Kullanýcý Adý veya Þifreniz Hatalý!");
		}
	}

}
