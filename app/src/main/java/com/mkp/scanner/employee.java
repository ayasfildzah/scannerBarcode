package com.mkp.scanner;
public class employee {
    int id;
    String name, dept, joiningDate, ket;


    public employee(int id, String name, String dept, String joiningDate, String ket) {
        this.id = id;
        this.name = name;
        this.dept = dept;
        this.joiningDate = joiningDate;
        this.ket = ket;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDept() {
        return dept;
    }

    public String getJoiningDate() {
        return joiningDate;
    }

    public String getKet() {
        return ket;
    }
}