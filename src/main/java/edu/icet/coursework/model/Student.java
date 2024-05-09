package edu.icet.coursework.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Student {
    private String studNo;
    private String fname;
    private String lname;
    private String dep;
    private String course;
}
