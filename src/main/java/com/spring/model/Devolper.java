package com.spring.model;

import com.spring.model.enums.Gender;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Table
public class Devolper {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private int age;

    @Enumerated(EnumType.STRING)
    private Gender gender;

    private float salary;

    private String position;

    public Devolper(String name, int age, Gender gender, float salary, String position) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.salary = salary;
        this.position = position;
    }
}
