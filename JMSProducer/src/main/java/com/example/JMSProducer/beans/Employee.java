package com.example.JMSProducer.beans;

import java.io.Serializable;

/**
 * Created by np85075 on 4/25/2019.
 */
public class Employee{

    private int id;
    private String name;
    private double salary;
    private String message;

    public Employee(int id,String name,double salary,String message){
        this.id=id;
        this.name=name;
        this.salary=salary;
        this.message=message;
    }
    Employee(){

    }

    public int getId() {
        return id;
    }

    public double getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
