package com.company;

import java.util.Scanner;

public class Person {
    public Scanner input = new Scanner(System.in);

    String name;
    String lastName;
    int age;
    String nationality;
    boolean marriage;
    boolean have_children;
    String children;
    String Name_your_wife;
    String nameFather;
    String nameMather;
    String why_stay;
    String Level_Student;
    String post;

    public Person() {

    }

    public void person(String name, String lastName, int age, String nationality, boolean marriage, boolean have_children, String name_your_wife,
                       String nameFather, String nameMather, String why_stay, String level_Student, String post) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.nationality = nationality;
        this.marriage = marriage;
        this.nameFather = nameFather;
        this.nameMather = nameMather;
        this.why_stay = why_stay;
        this.Level_Student = Level_Student;
        this.post = post;
    }

    public String getName() { return name; }
    public String getLastName() { return lastName; }
    public int getAge() { return age; }
    public String getNationality() { return nationality; }
    public boolean getMarriage() { return marriage; }
    public String getLevel_Student() { return Level_Student; }
    public String getName_your_wife() { return Name_your_wife; }
    public String getNameFather() { return nameFather; }
    public String getNameMather() { return nameMather; }
    public String getPost() { return post; }
    public String getWhy_stay() { return why_stay; }

    public void setLastName(String lastName) { this.lastName = lastName; }
    public void setLevel_Student(String level_Student) { Level_Student = level_Student; }
    public void setMarriage(boolean marriage) { this.marriage = marriage; }
    public void setName(String name) { this.name = name; }
    public void setName_your_wife(String name_your_wife) { Name_your_wife = name_your_wife; }
    public void setNameFather(String nameFather) { this.nameFather = nameFather; }
    public void setNameMather(String nameMather) { this.nameMather = nameMather; }
    public void setNationality(String nationality) { this.nationality = nationality; }
    public void setWhy_stay(String why_stay) { this.why_stay = why_stay; }


    public void print_all_information_inside_person() {
        System.out.println("Name " + " " + name);
        System.out.println("Last Name" + " " + lastName);
        System.out.println("Age" + " " + age);
        System.out.println("Nationality" + " " + nationality);
        ///////////////////////////////////////////////////
        if (marriage == true) {

            System.out.println("Marriage" + " " + true);
            System.out.println("If have Children typing true");
            have_children = input.nextBoolean();
        } else if (have_children == true){
           System.out.println("enter nu,ber the children :");
            children = input.next();
            System.out.println(children);
    }else System.out.println(false);

        System.out.println("Name the your mather"+" "+ nameMather);
        System.out.println("Name the your father"+" "+ nameFather);
        System.out.println("Why are you ?"+" "+ why_stay);
        System.out.println("your level the student"+" "+ Level_Student);
        System.out.println("your post " + " " + post);
}










}
