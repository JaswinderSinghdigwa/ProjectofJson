package com.bl.utility;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;


public class JsonUtility {
	private static ObjectMapper mapper;
	static {
		mapper = new ObjectMapper();
	}

	/**
	 * Purpose: reading the json file, parse and return the mapped object
	 * 
	 * path   path of json file
	 *  object model class object where we can mapped objects
	 * @return returns the mapped objectg
	 * @throws JsonParseException   throws exception if parsing fails
	 * @throws JsonMappingException throws exception if mapping to model is fails
	 * @throws IOException          throws exception if input output operation fails
	 */
	public static Object readMapper(String path, Object object)
			throws JsonParseException, JsonMappingException, IOException {
		return mapper.readValue(new File(path), object.getClass());

	}

	/**
	 * Purpose: writing the json file
	 * 
	 * path   path of json file
	 *  object model class object where we can mapped objects
	 * @return
	 * @throws JsonParseException   throws exception if parsing fails
	 * @throws JsonMappingException throws exception if mapping to model is fails
	 * @throws IOException          throws exception if input output operation fails
	 */
	public static String writeMapper(String path, Object object)
			throws JsonParseException, JsonMappingException, IOException {
		mapper.writeValue(new File(path), object);
		return "Success writing into file";

	}
}