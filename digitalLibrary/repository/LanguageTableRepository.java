package com.library.digitalLibrary.repository;

import com.library.digitalLibrary.entity.LanguageTable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LanguageTableRepository extends JpaRepository<LanguageTable,Integer> {
}
