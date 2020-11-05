package com.training.list.demo;
import java.util.*;

import com.training.domains.Author;
public class AuthorManager {

	
	private List<Author> authorList;

	public AuthorManager() {
		super();
		authorList = new ArrayList<>();
		
	}
	
	public List<Author> getAuthorList() {
		return authorList;
	}

	public boolean  addAuthor(Author author) {
		
		return this.authorList.add(author);
	}
	
	
	public boolean findAuthor(Author author) {
		
		return this.authorList.contains(author);
	}
	
	public boolean removeAuthor(Author author) {
		
		return this.authorList.remove(author);
	}
	
	public boolean updateAuthor(Author oldAuthor ,Author newAuthor) {
	
		  boolean status = false;
		  int idxPos = this.authorList.indexOf(oldAuthor);
		  
		  if(idxPos>=0) {
			  
			  this.authorList.set(idxPos, newAuthor);
		   
			 status = true;
		  }
		  
		  return status;
	}
	
	   
}
