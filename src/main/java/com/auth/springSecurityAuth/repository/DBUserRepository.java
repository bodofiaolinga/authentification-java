package com.auth.springSecurityAuth.repository;

import com.auth.springSecurityAuth.model.DBUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DBUserRepository extends JpaRepository<DBUser, Integer> {
   public DBUser findByUsername(String username);
}
