package com.training.list.demo;

import java.util.Comparator;

import com.training.domains.Author;

public class AuthorNameComparator implements Comparator<Author> {

	@Override
	public int compare(Author object1, Author object2) {
	
		
		return object1.getAuthorName().compareTo(object2.getAuthorName());
	}

}
