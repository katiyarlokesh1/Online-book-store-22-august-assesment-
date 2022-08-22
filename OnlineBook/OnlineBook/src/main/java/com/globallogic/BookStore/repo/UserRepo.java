package com.globallogic.BookStore.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.globallogic.BookStore.entity.user;

public interface UserRepo extends JpaRepository<user,Long> {

}
