package com.example.demo.service.impl;


import com.example.demo.entity.GeneralTask;
import com.example.demo.repository.GeneralTaskRepository;
import com.example.demo.service.GeneralTaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GeneralTaskServiceImpl implements GeneralTaskService {

    @Autowired
    private GeneralTaskRepository generalTaskRepository;

    @Override
    public List<GeneralTask> findAll() {
        return generalTaskRepository.findAll();
    }

    @Override
    public GeneralTask findById(Long id) {
        return generalTaskRepository
                .findById(id)
                .orElseThrow(() -> new IllegalArgumentException("task não existe!"));
    }

    @Override
    public GeneralTask create(GeneralTask generalTask) {
        return generalTaskRepository.save(generalTask);
    }

    @Override
    public void deleteById(Long id) {
        generalTaskRepository.deleteById(id);
    }
}
