package com.library.digitalLibrary.repository;

import com.library.digitalLibrary.entity.AuthorTable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorTableRepository extends JpaRepository<AuthorTable,Integer> {
}
