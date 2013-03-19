package grails.exercise

import grails.exercise.model.Book

class BookStoreController {

    def bookStoreService

    def index() {
        List<Book> books = bookStoreService.listBooks()
        return [books: books]
    }
}
