package com.rwl.librarymanagementsystem.Controller;


import com.rwl.librarymanagementsystem.Entity.Book;
import com.rwl.librarymanagementsystem.Service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/book")
public class BookController {

    @Autowired
    BookService bookService;

    @PostMapping("/add")
    public String addBook(@RequestBody Book book) throws Exception {
        try {
            bookService.addBook(book);
        } catch (Exception e) {
            return e.getMessage() + ": Book not added";
        }
            return "added the book";
    }
}
