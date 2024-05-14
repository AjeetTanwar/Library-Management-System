package com.rwl.librarymanagementsystem.Controller;


import com.rwl.librarymanagementsystem.Entity.Author;
import com.rwl.librarymanagementsystem.Service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/author")
public class AuthorController {

    @Autowired
    AuthorService authorService;

    @PostMapping("/add")
    public String addAuthor(@RequestBody Author author){
        authorService.addAuthor(author);
        return "Added the author";
    }

    @GetMapping("/get_authors")
    public List<Author> getAuthors(){
        return authorService.getAuthors();
    }
}
