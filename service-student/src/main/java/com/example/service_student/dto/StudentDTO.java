package com.example.service_student.dto;

public class StudentDTO {
    private String id;
    private String name;
    private int age;
    private String gender;
    private Long schoolId;
    public StudentDTO(String id, String name, int age, String gender, Long schoolId) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.schoolId = schoolId;
    }
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Long getSchoolId() {
        return schoolId;
    }

    public void setSchoolId(Long schoolId) {
        this.schoolId = schoolId;
    }
}