package com.patientdemo.Controller;
import com.mongodb.MongoClient;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.bson.Document;

public class  PatientController {
 
	public static void main( String args[] ) {
	
		MongoClient mongo = new MongoClient( "localhost" , 27017 );
		
		
		MongoDatabase database = mongo.getDatabase("myDb");
		
		// Retrieving a collection
		MongoCollection<Document> collection = database.getCollection("sampleCollection");
		System.out.println("Collection sampleCollection selected successfully");
		Document document1 = new Document("title", "MongoDB")
		.append("description", "database")
		.append("likes", 100)
		.append("url", "http://www.tutorialspoint.com/mongodb/")
		.append("by", "tutorials point");
		Document document2 = new Document("title", "RethinkDB")
		.append("description", "database")
		.append("likes", 200)
		.append("url", "http://www.tutorialspoint.com/rethinkdb/")
		.append("by", "tutorials point");
		List<Document> list = new ArrayList<Document>();
		list.add(document1);
		list.add(document2);
		collection.insertMany(list);
	
		FindIterable<Document> iterDoc = collection.find();
		int i = 1;
	
		Iterator it = iterDoc.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
			i++;
		}
	}
}
