package com.example.redis.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

import java.io.Serializable;
@AllArgsConstructor
@NoArgsConstructor
@Data
public class User implements Serializable {

    @Id
    private String id;
    private String name;
    private String salary;
}
