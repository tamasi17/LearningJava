/**
 * 
 */
package com.mati.mongodb.mongo_java_demo;


import com.mongodb.client.MongoClient; // Import MongoClient to connect to MongoDB
import com.mongodb.client.MongoClients; // Import MongoClients class to create a connection
import com.mongodb.client.MongoDatabase; // Import MongoDatabase to work with a specific database
import org.bson.Document;


/**
 * Class that defines the connection to a MongoDB Database
 */
public class MongoConnection {
    
//    MongoDB connection URI (Uniform Resource Identifier) - private por encapsulacion, static para toda la clase, final duh

      private static final String uri = "mongodb+srv://mateidelman:chdLN3gevFqrT9VC@logindam0.lsxzl.mongodb.net/?retryWrites=true&w=majority&appName=LoginDAM0";
        
      /**
       * Method to establish and return a connection to a MongoDB Database
       * @param dbName
       * @return
       */
      public static MongoDatabase getDatabase(String dbName) {
          MongoClient mongoClient = MongoClients.create(uri);  // Create a MongoClient to connect to MongoDB
          return mongoClient.getDatabase(dbName); // Return the MongoDatabase instance
      }
      
       
}
