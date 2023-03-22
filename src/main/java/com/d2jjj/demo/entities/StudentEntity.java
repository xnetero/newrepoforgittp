package com.d2jjj.demo.entities;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
public class StudentEntity {
    @Id
    @Column(name = "id_student")
    private long id;
    @Column(name = "name_student")
    private String name;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "StudentEntity{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}

