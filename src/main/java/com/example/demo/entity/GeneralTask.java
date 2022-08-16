package com.example.demo.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.annotation.Generated;

@Data
@Document
public class GeneralTask {

    @Id
    private Long idTask;

    private String name;
}
