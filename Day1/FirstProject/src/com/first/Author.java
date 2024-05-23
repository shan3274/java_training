package com.first;

public class Author {
	private String author_name;
	private String year_of_publication;
	private String book_name;
	public Author(String author_name,String year_of_publication,String book_name) {
		this.author_name = author_name;
		this.year_of_publication = year_of_publication;
		this.book_name = book_name;
	}
	public String details() {
		return "Author name : "+author_name+"\nYear of publication : "+year_of_publication+"\nBook name : "+book_name;
	}
	
	public static void main(String[] args) {
		Author author = new Author("Shan khan","2010","Harry potter");
		System.out.println(author.details());
	}
}
