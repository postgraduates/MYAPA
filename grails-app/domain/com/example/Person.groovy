package com.example

class Person {
	String name
	String lastname
	Date publicationDate
	static hasMany = [books:Book]
	
    static constraints = {
    }
}
