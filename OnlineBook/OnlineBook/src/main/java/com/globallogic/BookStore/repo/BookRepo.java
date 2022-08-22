package com.globallogic.BookStore.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.globallogic.BookStore.entity.book;

public interface BookRepo extends JpaRepository<book, Long>{

}
