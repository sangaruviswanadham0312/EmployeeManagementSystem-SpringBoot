package com.vishwa2.Employee.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table (name="Employee")

public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
     int id;

     String name;
     String email;
     double salary;
     String department;

}
