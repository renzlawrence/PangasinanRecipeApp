package com.example.pangasinanrecipeapp;

public class PersonObject {

    int personImage;
    String name, age, address, email, number;

    public PersonObject(int personImage, String name, String age, String address, String email, String number) {
        this.personImage = personImage;
        this.name = name;
        this.age = age;
        this.address = address;
        this.email = email;
        this.number = number;
    }

    public int getPersonImage() {
        return personImage;
    }

    public void setPersonImage(int personImage) {
        this.personImage = personImage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}
