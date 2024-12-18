package com.library.digitalLibrary.pojoClass;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BookTablePojo {

    int bookId;
    String bookName;
    AuthorTablePojo authorTablePojo;
    LanguageTablePojo languageTablePojo;
    int ratings1to5;

}
