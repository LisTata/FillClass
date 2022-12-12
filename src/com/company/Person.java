package com.company;

import java.io.Serializable;
import java.util.List;

public class Person implements Serializable {
    private int id;
    private String name;
    private List<String> emails;

    public Person() {
    }



    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Person(int id, String name, List<String> emails) {
        this.id = id;
        this.name = name;
        this.emails = emails;
    }

    public void addEmail(String email){
        emails.add(email);

    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<String> getEmails() {
        return emails;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", emails=" + emails +
                '}';
    }
}
