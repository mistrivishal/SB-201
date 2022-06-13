package com.masai.Q4;

import java.util.ArrayList;
import java.util.List;

public class Ecommerce {
	
	List<Product> productList=new ArrayList<>();
	
	public void addProductToList(Product product){
		int x = product.getCount();
		if(productList.contains(product)) {
			int y = productList.indexOf(product);
			Product p1 = productList.get(y);
			p1.setCount(x + p1.count);
		}
		else {
			productList.add(product);
			System.out.println("Product added successfully");
		}
	}
	
	List<Product> showAllProduct(){
		return productList;
	}
	
	
}
