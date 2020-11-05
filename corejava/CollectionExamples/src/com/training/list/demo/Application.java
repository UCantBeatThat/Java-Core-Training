package com.training.list.demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import com.training.domains.Author;

public class Application {
	
	public static void print(List<Author> authorList) {
		
for(Author eachAuthor : authorList) {
			
			System.out.println(eachAuthor);
		}
		

	}

	public static void main(String[] args) {

		
		AuthorManager mgr = new AuthorManager();
		
		Author ram = new Author(101,"Ram",484848,"ram@ab.com");
		mgr.addAuthor(ram);
		mgr.addAuthor(new Author(102,"Shyam",684848,"shy@ab.com"));
		mgr.addAuthor(new Author(103,"Siva",584848,"siva@ab.com"));
		
		Author  test = new Author(104,"Rakesh",586878,"rak@ab.com");
		
		mgr.addAuthor(test);
		List<Author> authorList = mgr.getAuthorList();
		
		Collections.sort(authorList);

		   print(authorList);
				System.out.println("Found :"+mgr.findAuthor(test));
	
	 mgr.updateAuthor(test, new Author(104,"Rakesh Sharma",586878,"rak@ab.com"));
	
	
	 System.out.println("After Update- Sorted by Name");
	Collections.sort(authorList,new AuthorNameComparator());
	 print(authorList);
	 
	 mgr.removeAuthor(ram);
	 System.out.println("After Delete");
	 print(authorList);
	 
	 List<String> nameList = new ArrayList<>();
	 
	 nameList.add("Ramesh");
	 nameList.add("Zahir");
	 nameList.add("Anand");
	 nameList.add("Siva");
	 Collections.sort(nameList);
	 System.out.println(nameList);
	 
	 
	 // Fail Fast Iterators
	 
	   Iterator<String> stringItr = nameList.iterator();
	   
	     while(stringItr.hasNext()) {
	    	 
	    	  String fetched = stringItr.next();
	    	  
	    	  nameList.remove(fetched);
	    	  
	    	 //  stringItr.remove(); Will Not  Throw Exception
	    	  
	    	  
	     }
	  
	}

}
