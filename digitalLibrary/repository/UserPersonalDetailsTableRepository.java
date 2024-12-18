package com.library.digitalLibrary.repository;

import com.library.digitalLibrary.entity.UserPersonalDetailsTable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserPersonalDetailsTableRepository extends JpaRepository<UserPersonalDetailsTable,Integer>{
}
