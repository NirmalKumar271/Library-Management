package com.library.digitalLibrary.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = " user_personal_details_table")
@Getter
@Setter
public class UserPersonalDetailsTable {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(name = "personal_details_id")
    int personalDetailsId;
@Column(name = "phone_number")
    long phoneNumber;
@Column(name = "address")
    String address;
@OneToOne(mappedBy = "userPersonalDetailsTable")
    UserTable userTable;

}
