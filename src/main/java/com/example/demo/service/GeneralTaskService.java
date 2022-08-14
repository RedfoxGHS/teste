package com.example.demo.service;

import com.example.demo.entity.GeneralTask;

import java.util.List;

public interface GeneralTaskService {
    public List<GeneralTask> findAll();
    public GeneralTask findById(Long id);
    public GeneralTask create(GeneralTask generalTask);
}
