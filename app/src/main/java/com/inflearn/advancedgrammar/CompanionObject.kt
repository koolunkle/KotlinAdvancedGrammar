package com.inflearn.advancedgrammar

class Book private constructor(val id: Int, val name: String) {

    companion object BookFactory : IdProvider {

        val myBook = "new book"

        override fun getId(): Int {
            return 100
        }

        fun create() = Book(getId(), myBook)

    }

}

interface IdProvider {
    fun getId(): Int
}

fun main() {

    val book = Book.create()
    println("${book.id} ${book.name}")

    val bookId = Book.getId()
    println(bookId)

}