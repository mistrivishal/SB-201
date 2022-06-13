package com.masai.Q4;

import java.util.ArrayList;
import java.util.List;

public class Ecommerce {
	
	List<Product> productList=new ArrayList<>();
	
	public void addProductToList(Product product){
		if(productList.contains(product)) {
			int x = product.getCount() + product.getCount();
			product.setCount(x);
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
