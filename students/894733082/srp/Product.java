package com.coderising.ood.srp;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.Serializable;

public class Product {
	private String productID;
	private String productDesc;

	public static List<Product> getAllPromotionProductList(){
		BufferedReader bufferReader = null;
		try {
			File file = new File("C:\\coderising\\workspace_ds\\ood-example\\src\\product_promotion.txt");
			bufferReader = new BufferedReader(new FileReader(file));
			String line  = bufferReader.readLine();
			String[] line_data = line.split(" ");
			Product product = new Product(line_data[0], line_data[1])
		} catch(Exception ex){
			System.out.println("reading file error")
		} finally {
			bufferReader.close();
		}
		return new List<Product>
	}
}