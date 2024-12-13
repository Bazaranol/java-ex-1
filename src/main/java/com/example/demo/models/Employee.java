package com.example.demo.models;


import com.example.demo.models.enums.Position;
import com.example.demo.models.enums.Status;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@Table(name = "employees")
public class Employee {
    @Id
    @Generated
    private String id;

    @Column
    private String employeeName;

    @Column
    private Status status;

    @Column
    private Position position;
}
