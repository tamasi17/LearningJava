/**
 * 
 */
package com.mati.mongodb.mongo_java_demo;

/**
 * 
 */
public class TestMongo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		
		MongoConnection.getDatabase("testDAM");
		
		
		MongoDataInserter.insertData("Juan");
		
		
		String result = MongoDataRetriever.retrieveData("name", "Juan");
		System.out.println("\n Resultado: \n " + result);  // Prints the document or a "not found" message

	
		
		
	}

}
