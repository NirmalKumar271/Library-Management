package com.library.digitalLibrary.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.repository.cdi.Eager;

@Entity
@Table(name = "author_table")
@Getter
@Setter
public class AuthorTable {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(name = "author_id")
    int authorId;

@Column(name = "author_name")
    String authorName;

@OneToOne(mappedBy = "authorTable")
BookTable bookTable;
}
