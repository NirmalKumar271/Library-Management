package com.library.digitalLibrary.pojoClass;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.time.DateTimeException;
import java.util.Date;

@Getter
@Setter
public class UserTablePojo {

    int userId;

    String userName;

    UserPersonalDetailsTablePojo userPersonalDetailsTablePojo;

    BookTablePojo bookTablePojo;

    Date fromDate;

    Date toDate;

    String bookReceived;
}
