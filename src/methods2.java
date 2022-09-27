
public class methods2 {

	public static void main(String[] args) {
		String mesaj = sehirVer();
		String yeniMesaj = mesaj.substring(0, 2);
		int sayi= topla(5,7);
		System.out.println(yeniMesaj);
		System.out.println(mesaj);
		System.out.println(sayi);
	}

	public static void ekle() {
		System.out.println("Eklendi");

	}

	public static void sil() {
		System.out.println("Silindi");

	}

	public static void guncelle() {
		System.out.println("Güncellendi");

	}

	public static int topla(int sayi1,int sayi2) {
		return sayi1+sayi2;
	}
	public static String sehirVer() {
		return "Ankara";
	}
}
