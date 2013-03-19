package grails.exercise

import grails.exercise.model.Book

class BookStoreService {

    def feedService

    List<grails.exercise.model.Book> listBooks() {
        List<Book> books = []
        def feed = feedService.getBooksFeed()
        feed.books.each { jsonBook ->
            Book book = new Book()
            book.title = jsonBook.title
            book.author = jsonBook.author
            book.yearReleased = jsonBook.year
            books.add(book)
        }
        return books
    }
}
