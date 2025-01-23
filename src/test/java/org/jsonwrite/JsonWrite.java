package org.jsonwrite;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import com.fasterxml.jackson.core.exc.StreamWriteException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonWrite {

	public static void main(String[] args) throws StreamWriteException, DatabindException, IOException {
		
		File file= new File("C:\\Users\\ASUS\\eclipse-workspace\\JsonSerializationWrite\\src\\test\\resources\\write.json");
		
		ObjectMapper objectMapper = new ObjectMapper();
		
		ArrayList<Topping> topping= new ArrayList();
		Topping topping2= new Topping("5001", "None");
		Topping topping3= new Topping("5002", "Glazed");
		Topping topping4= new Topping("5003", "Sugar");
		Topping topping5= new Topping("5004", "Powdered Sugar");
		Topping topping6= new Topping("5005", "Chocolate with Sprinkles");
		Topping topping7= new Topping("5006", "Chocolate");
		Topping topping8= new Topping("5007", "Maple");
		topping.add(topping2);
		topping.add(topping3);
		topping.add(topping4);
		topping.add(topping5);
		topping.add(topping6);
		topping.add(topping7);
		topping.add(topping8);
		
		ArrayList<Batter> batter= new ArrayList();
		Batter batter2= new Batter("1001", "Regular");
		Batter batter3= new Batter("1002", "Blueberry");
		Batter batter4= new Batter("1003", "Chocolate");
		Batter batter5= new Batter("1004", "Devil's Food");
		batter.add(batter2);
		batter.add(batter3);
		batter.add(batter4);
		batter.add(batter5);
		
		Batters batters= new Batters(batter);
		RootJson rootJson= new RootJson("0001", "donut", "cake", 0.55, batters, topping);
		objectMapper.writeValue(file, rootJson);
		
	}

}
