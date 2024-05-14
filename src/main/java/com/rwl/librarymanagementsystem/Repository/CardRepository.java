package com.rwl.librarymanagementsystem.Repository;


import com.rwl.librarymanagementsystem.Entity.LibraryCard;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CardRepository extends JpaRepository<LibraryCard, Integer> {
}
