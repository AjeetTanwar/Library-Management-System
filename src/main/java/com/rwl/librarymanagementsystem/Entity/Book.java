package com.rwl.librarymanagementsystem.Entity;


import com.fasterxml.jackson.annotation.JsonIgnore;

import com.rwl.librarymanagementsystem.Enum.Genre;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String title;
    private int price;
    @Enumerated(EnumType.STRING)
    private Genre genre;

    private boolean isIssued;

    @ManyToOne
    @JoinColumn
    @JsonIgnore
    Author author;
    @OneToMany(mappedBy = "book", cascade = CascadeType.ALL)
    List<Transaction> transactionList = new ArrayList<>();

    @ManyToOne
    @JoinColumn
    LibraryCard card;
}
