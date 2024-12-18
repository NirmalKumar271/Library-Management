package com.library.digitalLibrary.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "language_table")
@Getter
@Setter
public class LanguageTable {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(name = "language_id")
    int languageId;

@Column(name = "language_name")
    String languageName;

@OneToMany(mappedBy = "languageTable")
    List<BookTable> bookTable;
}
