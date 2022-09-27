
public class classesAttribute {

	public static void main(String[] args) {
		
		
		//Constructor ile kullanım
		
		Product product=new Product(1,"Laptop","Asus Laptop",3000,2,"mavi");
		
		
//		Product product = new Product();
//		product.setName("Laptop");
//		product.setId(1);
//		product.setDescription("Asus Laptop");
//		product.setPrice(2500);
//		product.setStockAmoun(30);

		System.out.println(product.getName());
		ProductManeger productmanager = new ProductManeger();
		productmanager.Add(product);

		System.out.println(product);
	}

}
