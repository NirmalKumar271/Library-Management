package com.library.digitalLibrary.controller;

import com.library.digitalLibrary.service.LibraryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LibraryController {
    @Autowired
    LibraryService libraryService;
    @GetMapping(path = "//bookBasedAuthor//")
    public void bookBasedAuthor(){
        libraryService.bookBasedAuthors();

    }
    @GetMapping(path = "//userPicksBook//")
    public void userPicksBook(){

        libraryService.userPicksBooks();
    }
    @GetMapping(path = "//crossedDueDate//")
    public void crossedDueDate(){
        libraryService.crossedDueDates();
    }
    @GetMapping(path = "//bookRating//")
    public void bookRating(){
        libraryService.BookRatings();
    }
    @GetMapping(path = "//bookBasedLanguage//")
    public void bookBasedLanguage(){
        libraryService.bookBasedLanguages();
    }

}
