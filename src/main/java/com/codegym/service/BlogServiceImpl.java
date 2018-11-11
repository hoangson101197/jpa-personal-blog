package com.codegym.service;

import com.codegym.model.Blog;
import com.codegym.repository.BlogRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class BlogServiceImpl implements BlogService{

    @Autowired
    private BlogRepository customerRepository;

    @Override
    public List<Blog> findAll() {
        return customerRepository.findAll();
    }

    @Override
    public Blog findById(Long id) {
        return customerRepository.findById(id);
    }

    @Override
    public void save(Blog customer) {
        customerRepository.save(customer);
    }

    @Override
    public void remove(Long id) {
        customerRepository.remove(id);
    }
}