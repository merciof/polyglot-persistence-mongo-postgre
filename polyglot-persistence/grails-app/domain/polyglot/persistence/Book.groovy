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
        title nullable: true
        isbn nullable: true
        ageCount nullable: true
        ublishDate nullable: true
        thumbnailUrl nullable: true
        shortDescription nullable: true
        largeDescription nullable: true
        status nullable: true
        authors nullable: true
        categories nullable: true  
    }
}
