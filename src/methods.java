
public class methods {

	public static void main(String[] args) {
		sayiBulmaca();										
		sayiBulmaca();
		sayiBulmaca();
		sayiBulmaca();
		
	}
	public static void sayiBulmaca() {
		
		int[] sayiar=new int[] {1,2,4,7,8,0};
		int sira= 1+4;
		int aranacak=0;
		boolean varMi=false;
		
		for(int sayi:sayiar) {
			if(sayi==aranacak) {
				
				varMi=true;
				break;
				
			}
		}
		if(varMi) {
			mesajVer("Sayı mevcut: "+aranacak);
			saymaSayi(19);
		}
		else {
			mesajVer("Sayı mevcut değil: "+aranacak);
			saymaSayi(sira);
		}
	}
	
	public static void mesajVer(String mesaj) {
		System.out.println(mesaj);
		
	}
	public static void saymaSayi(int sira) {
		System.out.println("Sıra Sayısı3: "+ sira);
		
	}
	
	
	

}
