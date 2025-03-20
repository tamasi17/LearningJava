/**
 * 
 */
package com.mati.mongodb.mongo_java_demo;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoCollection;  // Import MongoCollection to work with collections
import com.mongodb.client.MongoDatabase;   // Import MongoDatabase for accessing the database
import org.bson.Document;                  // Import Document class to represent the data

/**
 * Class that inserts documents into the MongoDB Database
 */
public class MongoDataInserter {
	
	public static void insertData(String nombre, String role) {
		
		// Get database connection	
		MongoDatabase database = MongoConnection.getDatabase("testDAM");
		
		// Get the collection
		MongoCollection<Document> collection = database.getCollection("prueba");
		
		// New document
		Document doc = new Document ("name", nombre)
				.append("id", 4)
				.append("role", role);
		
		// Insert document into collection
		collection.insertOne(doc);
		
	}
	
	

}
