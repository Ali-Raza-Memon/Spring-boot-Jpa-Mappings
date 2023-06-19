package com.datajpa.mappings.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="jpa_student")
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Student {

    @Id
    private int studentId;
    private String studentName;
    private String about;


}
