/**
 * 
 */
package com.mati.mongodb.mongo_java_demo;

import com.mongodb.client.FindIterable;  // Import FindIterable for query results
import com.mongodb.client.MongoCollection;  // Import MongoCollection to work with collections
import com.mongodb.client.MongoDatabase;  // Import MongoDatabase for accessing the database
import org.bson.Document;  // Import Document to work with MongoDB documents
import org.bson.conversions.Bson;  // Import Bson for query filters
import com.mongodb.client.model.Filters;  // Import Filters for query filters

/**
 * Class to retrieve data from a MongoDB Database
 */
public class MongoDataRetriever {

	public static String retrieveData(String searchField, String searchValue) {
		
		// Get database connection
		MongoDatabase database = MongoConnection.getDatabase("testDAM");
		
		// Get the collection
		MongoCollection<Document> collection = database.getCollection("prueba");
		
		// Define a query filter for one document based on field and value
        Bson filter = Filters.eq(searchField, searchValue);
        
        // Execute the query (find one documents)
        Document document = collection.find(filter).first(); // first() to retrieve only one
        
        // Check if the document was found
        if (document != null) {
            return document.toJson();  // Convert document to JSON string and return
        } else {
            return "No document found";  // In case no document matches the query
        }
	}
	
	
	
	public static String retrieveAllData() {
		
		StringBuilder result = new StringBuilder(); // To build a large string, concatenating all the documents as a single string.
		
		// Get database connection
		MongoDatabase database = MongoConnection.getDatabase("testDAM");
		
		// Get the collection
		MongoCollection<Document> collection = database.getCollection("prueba");
		
		// Define a query filter (empty means all documents)
        Bson filter = Filters.empty();
        
        // Execute the query (find all documents)
        FindIterable<Document> documents = collection.find(filter);
        
        // Loop through the results and append to the result StringBuilder
        for (Document doc : documents) {
            result.append(doc.toJson()).append("\n");  // Add each document in JSON format to the result
        }
		
		return result.toString();  // Return the string with all documents
	}
	
	
	
}
