package com.rwl.librarymanagementsystem.Service;


import com.rwl.librarymanagementsystem.Entity.Author;
import com.rwl.librarymanagementsystem.Entity.Book;
import com.rwl.librarymanagementsystem.Repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    @Autowired
    AuthorRepository authorRepository;
    public void addBook(Book book) throws Exception{

        Author author;

        try {
            author = authorRepository.findById(book.getAuthor().getId()).get();
        }
        catch (Exception e){
            throw new Exception("Author not present");
        }

        List<Book> booksWritten = author.getBooks();
        booksWritten.add(book);

        authorRepository.save(author);

    }
}
