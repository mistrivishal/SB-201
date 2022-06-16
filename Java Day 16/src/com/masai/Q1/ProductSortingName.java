package com.masai.Q1;

import java.util.Comparator;

public class ProductSortingName implements Comparator<Product>{

	@Override
	public int compare(Product p1, Product p2) {
		
		return p1.getProductName().compareTo(p2.getProductName());
	}
	
	
}
