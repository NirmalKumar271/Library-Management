package com.library.digitalLibrary.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.sql.Date;

@Entity
@Table(name = "user_table")
@Getter
@Setter
public class UserTable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    int userId;
    @Column(name = "user_name")
    String userName;
    @OneToOne
    @JoinColumn(name = "personal_details_id",referencedColumnName = "personal_details_id")
    UserPersonalDetailsTable userPersonalDetailsTable;
    @OneToOne
    @JoinColumn(name = "book_id",referencedColumnName = "book_id")
    BookTable bookTable;
    @Column(name = "from_date")
    java.sql.Date fromDate;
    @Column(name = "to_date")
    Date toDate;
    @Column(name = "book_received")
    String bookReceived;
}
