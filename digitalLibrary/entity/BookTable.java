package com.library.digitalLibrary.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "book_table")
@Getter
@Setter
public class BookTable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "book_id")
    int bookId;
    @Column(name = "book_name")
    String bookName;
    @OneToOne
    @JoinColumn(name = "author_id",referencedColumnName = "author_id")
    AuthorTable authorTable;

    @ManyToOne
    @JoinColumn(name = "language_id",referencedColumnName = "language_id")
    LanguageTable languageTable;

    @Column(name = "ratings_1to5_only")
    int ratings1to5;
    @OneToOne(mappedBy = "bookTable")
    UserTable userTable;
}
