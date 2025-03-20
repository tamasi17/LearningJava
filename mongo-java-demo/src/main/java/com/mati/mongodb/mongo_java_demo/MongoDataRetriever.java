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
import com.mongodb.client.model.Projections;

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
        
        // Define a projection to include only specific fields
        Bson projection = Projections.fields(
                Projections.include("name", "role"),  // Fields to include
                Projections.excludeId()                // Exclude the "_id" field
        );

        // Execute the query (find one document with projection)
        Document document = collection.find(filter).projection(projection).first(); // first() to retrieve only one
        
        // Check if the document was found
        if (document != null) {
            return document.toJson();  // Convert document to JSON string and return
        } else {
            return "No document found";  // In case no document matches the query
        }
	}

	
	
}
