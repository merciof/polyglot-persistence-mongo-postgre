package polyglot.persistence

import grails.mongodb.MongoEntity

class Book implements MongoEntity<Book> {
    
    String title
    String isbn
    Integer pageCount
    Date publishDate
    String thumbnailUrl
    String shortDescription
    String largeDescription
    String status
    String[] authors
    String [] categories
    
    static mapWith = "mongo"
    
    static mapping = {
        collection "books"   
    }

    static constraints = {
    }
}