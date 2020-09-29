package com.company;

public class Company {

// basic class
    protected double salary_back;
    protected double salary_out;
    protected String employee_normal ;
    protected String employee_master ;
    protected String directors ;
    protected String content ;
    protected String serves ;

    public Company()
    {

    }
//getter method
    public double getSalary_back() { return salary_back;}
    public double getSalary_out() {return salary_out;}
    public String getEmployee_normal() { return employee_normal; }
    public String getEmployee_master() { return employee_master; }
    public String getDirectors() { return directors;}
    public String getContent() {return content;}
    public String getServes() { return serves;}
    public void setSalary_back(double salary_back) {
        this.salary_back = salary_back;
    }
//setter method
    public void setSalary_out(double salary_out) { this.salary_out = salary_out; }
    public void setEmployee_normal(String employee_normal) { this.employee_normal = employee_normal;}
    public void setEmployee_master(String employee_master) { this.employee_master = employee_master;}
    public void setDirectors(String directors) {this.directors = directors; }
    public void setContent(String content) { this.content = content; }
    public void setServes(String serves) { this.serves = serves; }

// this is not correct type string get profit of money
    public void net_profit()
    {
        if (salary_back > salary_out) {
            System.out.println("Gread profit is");
            double average = salary_back - salary_out;
            System.out.println(average);
        } else {
            System.out.println("this average not variable new worked mor for giv it");
            System.out.println("the loss she " + (salary_back - salary_out));
        }

    }
// input information
    public void Company(double salary_back, double salary_out, String employee_normal, String employee_master, String directors, String content, String serves)
    {
        this.salary_back = salary_back;
        this.salary_out = salary_out;
        this.employee_normal = employee_normal;
        this.employee_master = employee_master;
        this.directors = directors;
        this.content = content;
        this.serves = serves;
    }

// print information
    public void print_all_element_inside_company()
    {
        System.out.println("Salary Back is " + " " + salary_back );
        System.out.println("Salary Out is" + " " + salary_out );
        System.out.println("Employee Normal" + " " + employee_normal );
        System.out.println("Employee master " + " " + employee_master );
        System.out.println("Directors " + " " + directors );
        System.out.println("serves" + " " + serves );
























    }





















}
