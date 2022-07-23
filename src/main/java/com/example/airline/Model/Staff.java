package com.example.airline.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "Staff")

public class Staff {

    @Id
    @Column (name = "StaffID")
    private long StaffID;

    @Column (name = "Name")
    private long Name;

    @Column (name = "Gender")
    private String Gender;

    @Column (name = "Category")
    private String Category;

    public Staff(){

    }

    public Staff(long staffID, long name, String gender, String category) {
        StaffID = staffID;
        Name = name;
        Gender = gender;
        Category = category;
    }

    public long getStaffID() {
        return StaffID;
    }

    public void setStaffID(long staffID) {
        StaffID = staffID;
    }

    public long getName() {
        return Name;
    }

    public void setName(long name) {
        Name = name;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String gender) {
        Gender = gender;
    }

    public String getCategory() {
        return Category;
    }

    public void setCategory(String category) {
        Category = category;
    }

    @Override
    public String toString() {
        return "Staff{" +
                "StaffID=" + StaffID +
                ", Name=" + Name +
                ", Gender='" + Gender + '\'' +
                ", Category='" + Category + '\'' +
                '}';
    }
}
