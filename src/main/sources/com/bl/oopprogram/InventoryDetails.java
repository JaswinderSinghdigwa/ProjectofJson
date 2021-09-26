package com.bl.oopprogram;


import java.io.File;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;

import com.bl.model.Jsondemo.InventoryDetailModel;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class InventoryDetails {
	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException{
		String path = "/home/aman/development/eclipseworkspace/Jsondemo/Json/inventory.json";
		String path2 = "/home/aman/eclipseworkspace/Jsondemo/Json/inventory_detailsOuput.json";
		
		ObjectMapper mapper = new ObjectMapper();
		
		int total=0;
		InventoryDetailModel model = mapper.readValue(new File(path), InventoryDetailModel.class);
		System.out.println("Rice : " + model.getRice().get(0).getName());
		System.out.println("Price : " + model.getRice().get(0).getPrice_per_kg());
		total += model.getRice().get(0).getPrice_per_kg();
		System.out.println("wheats : " + model.getWheats().get(0).getName());
		System.out.println("Price : " + model.getWheats().get(0).getPrice_per_kg());
		total += model.getWheats().get(0).getPrice_per_kg();
		System.out.println("pulses : " + model.getPulses().get(0).getName());
		System.out.println("Price : " + model.getPulses().get(0).getPrice_per_kg());
		total += model.getPulses().get(0).getPrice_per_kg();
		System.out.println("\nTotal : " + total);

		// code for writing all details into new file
		model.setTotal(total);
		mapper.writeValue(new File(path2), model);
		System.out.println("\nWrite into file is completed!!!");
		
		
	}
}
