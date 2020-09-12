package net.codejava.controller;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;
import com.mongodb.MongoClient;
 
public class mongodatabase {
    public static void main(String[] args) {
        MongoClient mongo = new MongoClient("localhost", 27017);
        MongoDatabase database = mongo.getDatabase("mydb");
        MongoCollection<Document> collection = database.getCollection("samplecol");
        Document document1 = new Document("firstname", "roshan")
        .append("lastname", "chaube"); 
        
    }
}