package oopIntro;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		Product product1=new Product(1,"Lenovo V14",6500,"Lenovo Dizüstü Bilgisayar 8 GB",10);
		
		Product product2=new Product();
		product2.setId(2);
		product2.setName("Lenovo V15");
		product2.setDetail("16 Gb Ram");
		product2.setDiscount(10);
		product2.setUnitPrice(10000);
		
		Product product3=new Product();
		product3.setId(2);
		product3.setName("Lenovo V16");
		product3.setDetail("32 Gb Ram");
		product3.setDiscount(15);
		product3.setUnitPrice(12000);
		
		Product products[]	= {product1,product2,product3};
		
		for (Product product : products) {
			System.out.println(product.getId());
			System.out.println(product.getName());
			System.out.println(product.getDetail());
			System.out.println(product.getUnitPrice());
			System.out.println(product.getUnitPriceAfterDiscount());
		}
		
		Category category1=new Category();
		category1.setId(1);
		category1.setName("Bilgisayar");
		
		Category category2=new Category();
		category2.setId(2);
		category2.setName("Temizlik");
		
		Category categories[]= {category1,category2};
		for (Category category : categories) {
			System.out.println(category.getId());
			System.out.println(category.getName());
			
		}
		
		ProductManager productManager=new ProductManager();
		productManager.addToCart(product1);
		productManager.addToCart(product2);
		productManager.addToCart(product3);
		


		
		//System.out.println(products.length);
	}

}
