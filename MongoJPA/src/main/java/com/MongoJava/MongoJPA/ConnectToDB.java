package com.MongoJava.MongoJPA;


import org.bson.Document;

import com.mongodb.client.ListCollectionsIterable;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;

public class ConnectToDB {

public static void main(String[] args)
  {
	MongoClient mongoClient = MongoClients.create(
	    "mongodb+srv://abhijeet:230694@cluster0-8wbwf.mongodb.net/test?retryWrites=true&w=majority");
	MongoDatabase database = mongoClient.getDatabase("sample_mflix");
	ListCollectionsIterable<Document> al= database.listCollections();
	MongoCursor<Document> cursor=al.cursor();
	while(cursor.hasNext())
	{
		System.out.println(cursor.next());
	}
  }
}
