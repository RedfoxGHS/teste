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
    public GeneralTask create(@PathVariable Long id, @PathVariable String name){
        GeneralTask generalTask = new GeneralTask();
        generalTask.setIdTask(id);
        generalTask.setName(name);
        return generalTaskService.create(generalTask);
    }

    @DeleteMapping
    public void delete(@PathVariable Long id){
        generalTaskService.deleteById(id);
    }
}
