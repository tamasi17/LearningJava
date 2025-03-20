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

		
		MongoConnection.getDatabase("testDAM"); // Connects to our db
		
		
		MongoDataInserter.insertData("Juan", "Red Hat Hacker"); // Inserts data
		
		
		String result = MongoDataRetriever.retrieveData("name", "Juan");
		System.out.println("\n Resultado: \n " + result);  // Prints the document or a "not found" message

	
		
		
	}

}
