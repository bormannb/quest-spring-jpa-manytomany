package com.wildcodeschool.wildandwizard.entity;

import javax.management.MXBean;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.Join.Table;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Wizard {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstName;
    private String lastName;
    private Date birthday;
    private String birthPlace;
    private String biography;
    private boolean muggle;

    //-------
    @ManyToMany
    @JoinTable(name="wizard_course", joinColumn = @JoinColumn(name="wizard_id"),
    inversJoinColumns = @JoinColumn(name = "course_id"))   
    
    private List<Course> courses; 
    
    public Wizard() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getBirthPlace() {
        return birthPlace;
    }

    public void setBirthPlace(String birthPlace) {
        this.birthPlace = birthPlace;
    }

    public String getBiography() {
        return biography;
    }

    public void setBiography(String biography) {
        this.biography = biography;
    }

    public boolean isMuggle() {
        return muggle;
    }

    public void setMuggle(boolean muggle) {
        this.muggle = muggle;

    }
    
    //--
    public List<Course> getCourses(){
        return courses;
    
    }

    public void setCourses(List<Course> courses){
        this.courses = courses;
           

    }
     
    
}