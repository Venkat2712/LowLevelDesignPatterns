//package builder;
//
//public class Builder {
//	
//	private int id;
//	private String name;
//	private String description;
//	
//	public int getId() {
//		return id;
//	}
//
//	public Builder setId(int id) {
//		this.id = id;
//		return this;
//	}
//
//	public String getName() {
//		return name;
//	}
//
//	public Builder setName(String name) {
//		this.name = name;
//		return this;
//	}
//
//	public String getDescription() {
//		return description;
//	}
//
//	public Builder setDescription(String description) {
//		this.description = description;
//		return this;
//	}
//
//	public Builder() {
//		
//	}
//	
//	public Product build() {
//		if(id>1) {
//			throw new RuntimeException("id is greater than 1");
//		}
//		return new Product(this);
//	}
//	
//	
//
//
//}
