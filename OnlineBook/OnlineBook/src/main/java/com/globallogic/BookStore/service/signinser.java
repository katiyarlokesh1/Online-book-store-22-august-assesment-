package com.globallogic.BookStore.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.globallogic.BookStore.entity.Signup;

@Component
public interface signinser {
public String signin(Signup s);
public List<Signup> showdet();
public String update(Signup s);
public String delete(long id);

}
