package com.globallogic.BookStore.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.globallogic.BookStore.entity.admin;

public interface AdminRepo extends JpaRepository<admin, Long> {
	

}
