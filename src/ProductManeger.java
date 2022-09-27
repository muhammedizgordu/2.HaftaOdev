
public class ProductManeger {
	public void Add(Product product) {

		System.out.println("Ürün ID: " + product.getId());
		System.out.println("Ürün Eklendi :" + product.getName());
		System.out.println("Ürün Fiyatı: " + product.getPrice());
		System.out.println("Ürün Markası:" + product.getDescription());
		System.out.println("Ürün Stok Sayısı: " + product.getStockAmoun());
	}
	

}
