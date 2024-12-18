package com.library.digitalLibrary.repository;

import com.library.digitalLibrary.entity.UserTable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserTableRepository extends JpaRepository<UserTable,Integer> {
}
