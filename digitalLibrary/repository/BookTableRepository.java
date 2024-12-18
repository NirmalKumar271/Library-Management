package com.library.digitalLibrary.repository;

import com.library.digitalLibrary.entity.BookTable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookTableRepository extends JpaRepository<BookTable,Integer>{


}
