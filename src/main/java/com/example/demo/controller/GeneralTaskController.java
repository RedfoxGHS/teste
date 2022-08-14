package com.example.demo.controller;

import com.example.demo.entity.GeneralTask;
import com.example.demo.service.GeneralTaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/general-task")
public class GeneralTaskController {

    @Autowired
    private GeneralTaskService generalTaskService;

    @GetMapping
    public List<GeneralTask> findAll(){
        return generalTaskService.findAll();
    }

    @GetMapping("/{id}")
    public GeneralTask findById(@PathVariable Long id){
        return generalTaskService.findById(id);
    }

    @PostMapping
    public GeneralTask create(@RequestBody GeneralTask generalTask){
        return generalTaskService.create(generalTask);
    }
}
