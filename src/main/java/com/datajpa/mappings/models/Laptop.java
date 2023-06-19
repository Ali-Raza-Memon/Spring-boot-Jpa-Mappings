package com.datajpa.mappings.models;

import javax.persistence.*;

@Entity
@Table(name="jpa_laptop")
public class Laptop {
    @Id
    private int laptopId;
    private String modelNumber;
    private String brand;

    @OneToOne
    @JoinColumn(name="student_id")
    private Student student;

}
