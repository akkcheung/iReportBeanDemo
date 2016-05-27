package com.mycompany.app;

public class ContactFactory {

	public static java.util.Collection generateCollection() {
		// Creates the collection
		java.util.Vector collection = new java.util.Vector();
		
		// Adds the values in the bean and adds it into the collection
		collection.add(new Contact(1, "fa", "la"));
		collection.add(new Contact(2, "fb", "lb"));
		collection.add(new Contact(3, "fc", "lc"));
		
		// returns the collection of beans.
		return collection;
	} 
	
	
	public static Contact[] generateArray() {
		// Creates the Arraylist
	  Contact[] list = new Contact[3];
	
		// Adds the values in the bean and adds it into the Array
		list[0]= new Contact(1, "fa", "la");
		list[1]= new Contact(2, "fb", "lb");
		list[2]= new Contact(3, "fc", "lc");
	
		// returns the Array of beans.
		return list;
	}
}