package com.example

class Book {
	String name
	String backCover
	Date publicationDate
	static belongsTo = Person
	static constraints = {
	}
}
   
