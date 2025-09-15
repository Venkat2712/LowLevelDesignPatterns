package builder;

import java.time.format.DateTimeFormatterBuilder;

public class Client {
	public static void main(String[] args) {
//		Builder builder = new Builder();
//		builder.setDescription("Pixel");
//		builder.setId(1);
//		builder.setName("pixel");
//		System.out.println(builder);
//		System.out.println(builder.getDescription());
//		
//		Product product = new Product(builder);
//		System.out.println(product.getDescription());
//		
		
		
		Product product  =Product.getBuilder().setDescription("Oneplus 12").setId(1).setName("12R").build();
		System.out.println(product.getDescription());
		System.out.println(product.getId());
		
		
		
		
		Product product1 = Product.getBuilder().setName("VD").build();
		System.out.println(product1.getName());
		
		
		
		
		
		
		
	}

}
