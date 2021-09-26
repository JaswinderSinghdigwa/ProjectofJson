package com.bl.utility;

import java.io.IOException;

import com.bl.model.Jsondemo.TransactionModel;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;

public class StockAccountUtility{

	/**
	 * Purpose: this method will read the customer accounts and returns all accounts
	 * 
	 * fileName this is path of file is provided by user
	 * @return returns the object of mapped class
	 * @throws JsonParseException   throws exception if parsing fails
	 * @throws JsonMappingException throws exception if mapping to model is fails
	 * @throws IOException          throws exception if input output operation fails
	 */
	public static Object stockAccount(String fileName, Object object)
			throws JsonParseException, JsonMappingException, IOException {
		return JsonUtility.readMapper(fileName, object.getClass());
	}

	/**
	 * Purpose: this method will calculate total value of shares
	 * @return returns the total value of shares
	 */
	public static double valueOf() {
		return 0;

	}

	
	public static Object buyShare(TransactionModel model, int customerId, int companySymbol,
			int numOfCompanyShareToBuy) {

		
		
		return model;
	}	

	/**
	 * Purpose: this method is used to sell shares
	 */
	public static void sellShare() {

	}
	public static String save(String filename, Object object)
			throws JsonParseException, JsonMappingException, IOException {
		JsonUtility.writeMapper(filename, object);
		return "Saving successful";
	}

}