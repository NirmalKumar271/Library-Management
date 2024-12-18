package com.library.digitalLibrary.service;

import com.library.digitalLibrary.entity.*;
import com.library.digitalLibrary.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LibraryService {
    @Autowired
    AuthorTableRepository authorTableRepository;
    @Autowired
    BookTableRepository bookTableRepository;
    @Autowired
    LanguageTableRepository languageTableRepository;
    @Autowired
    UserPersonalDetailsTableRepository userPersonalDetailsTableRepository;
    @Autowired
    UserTableRepository userTableRepository;
    public void bookBasedAuthors(){
     List <AuthorTable> authorTable=authorTableRepository.findAll();
     for (AuthorTable authorTable1:authorTable){
         System.out.println("Author Id:   "+authorTable1.getAuthorId());
         System.out.println("Author Name:   "+authorTable1.getAuthorName());
         System.out.println("Author Write Books:   "+authorTable1.getBookTable().getBookName() );
         System.out.println("---------------------------");
     }
    }
    public void userPicksBooks(){
      List<UserPersonalDetailsTable>userPersonalDetailsTable =userPersonalDetailsTableRepository.findAll();
      for (UserPersonalDetailsTable userPersonalDetailsTables:userPersonalDetailsTable){
          System.out.println("User Id:   "+userPersonalDetailsTables.getPersonalDetailsId());
          System.out.println("User Name:   "+userPersonalDetailsTables.getUserTable().getUserName());
          System.out.println("User Address:   "+userPersonalDetailsTables.getAddress());
          System.out.println("User Pick Book:   "+userPersonalDetailsTables.getUserTable().getBookTable().getBookName());
          System.out.println("--------------------------");
      }
    }

   public void crossedDueDates(){
      List<UserTable>userTable=userTableRepository.findAll();
      for (UserTable userTable1:userTable){
          System.out.println("Book Name:   "+userTable1.getBookTable().getBookName());
          System.out.println("From Date:   "+userTable1.getFromDate());
          System.out.println("Due Date:   "+userTable1.getToDate());
          System.out.println("User Details:");
          System.out.println("User Name:   "+userTable1.getUserName());
          System.out.println("User PhoneNumber:   "+userTable1.getUserPersonalDetailsTable().getPhoneNumber());
          System.out.println("---------------------------");
      }
   }
   public void BookRatings(){
        List<BookTable>bookTable=bookTableRepository.findAll();
        for (BookTable bookTable1:bookTable){
            System.out.println("Book Id:   "+bookTable1.getBookId());
            System.out.println("Book Name:   "+bookTable1.getBookName());
            System.out.println("Book Ratings:   "+bookTable1.getRatings1to5());
            System.out.println("--------------------------");
        }
   }

   public void bookBasedLanguages(){
        List<LanguageTable>languageTable=languageTableRepository.findAll();
        for (LanguageTable languageTable1:languageTable){

            System.out.println("Language:   "+languageTable1.getLanguageName());
            System.out.println("------------------------");

        List<BookTable>bookTable=languageTable1.getBookTable();
        for (BookTable bookTable1:bookTable){
            System.out.println("BookId:   "+bookTable1.getBookId());
            System.out.println("BookName:   "+bookTable1.getBookName());
            System.out.println("-----------------------");

        }

        }
   }
}
