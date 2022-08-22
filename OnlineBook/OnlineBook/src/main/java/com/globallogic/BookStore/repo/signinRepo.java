package com.globallogic.BookStore.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.globallogic.BookStore.entity.Signup;

public interface signinRepo extends JpaRepository<Signup, Long> {

}
