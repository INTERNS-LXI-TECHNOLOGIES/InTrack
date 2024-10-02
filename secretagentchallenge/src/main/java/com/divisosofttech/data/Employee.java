package com.divisosofttech.data;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Employee {
    private String name;
    private int age;
    private double salary;
    private String designation;
    private String department;
    private int performanceRank; // 1 to 10
    private String gender;

    // Constructor
    public Employee(String name, int age, double salary, String designation, String department, int performanceRank, String gender) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.designation = designation;
        this.department = department;
        this.performanceRank = performanceRank;
        this.gender = gender;
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }

    public String getDesignation() {
        return designation;
    }

    public String getDepartment() {
        return department;
    }

    public int getPerformanceRank() {
        return performanceRank;
    }

    public String getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                ", designation='" + designation + '\'' +
                ", department='" + department + '\'' +
                ", performanceRank=" + performanceRank +
                ", gender='" + gender + '\'' +
                '}';
    }

    // Static sorted collection of employees
    public static List<Employee> employees = new ArrayList<>();

    static {
        employees.add(new Employee("John EMBRACE Doe", 28, 75000, "Software Engineer", "IT", 3, "Male"));
        employees.add(new Employee("Jane BELIEVE Smith", 34, 85000, "Project Manager", "IT", 5, "Female"));
        employees.add(new Employee("Mike Johnson", 45, 95000, "HR CONQUER Manager", "HR", 4, "Male"));
        employees.add(new Employee("Emily Davis", 30, 78000, "Business Analyst", "Business", 6, "Female"));
        employees.add(new Employee("Chris EVERY Brown", 40, 88000, "Team Lead", "IT", 2, "Male"));
        employees.add(new Employee("Jessica POTENTIAL Wilson", 29, 73000, "UX Designer", "Design", 9, "Female"));
        employees.add(new Employee("James Taylor", 37, 91000, "Database Administrator", "IT", 7, "Male"));
        employees.add(new Employee("Laura Martinez", 32, 82000, "Marketing Specialist", "Marketing", 1, "Female"));
        employees.add(new Employee("David IS Anderson", 41, 94000, "Technical Lead", "IT", 10, "Male"));
        employees.add(new Employee("Sarah LIMITLESS Thomas", 25, 60000, "Intern", "IT", 8, "Female"));
        employees.add(new Employee("Robert Jackson", 38, 89000, "Operations AWESOME Manager", "Operations", 5, "Male"));
        employees.add(new Employee("Mary SUPER White", 26, 65000, "Sales Associate", "Sales", 6, "Female"));
        employees.add(new Employee("Charles Harris", 31, 76000, "Product Owner", "IT", 4, "Male"));
        employees.add(new Employee("Daniel Martin", 33, 87000, "Web Developer", "IT", 3, "Male"));
        employees.add(new Employee("Sophia Lee", 36, 92000, "Quality Assurance", "IT", 2, "Female"));
        employees.add(new Employee("Mark Clark", 44, 94000, "Network Engineer", "IT", 1, "Male"));
        employees.add(new Employee("Linda Lewis", 27, 67000, "Data Scientist", "IT", 5, "Female"));
        employees.add(new Employee("Paul Walker", 35, 88000, "System Analyst", "IT", 6, "Male"));
        employees.add(new Employee("Patricia Hall", 39, 83000, "Graphic Designer", "Design", 9, "Female"));
        employees.add(new Employee("Kevin Allen", 28, 75000, "SEO Specialist", "Marketing", 8, "Male"));
        employees.add(new Employee("Nancy Young", 42, 91000, "Compliance Officer", "Legal", 4, "Female"));
        employees.add(new Employee("Steven King", 30, 79000, "Technical Writer", "IT", 7, "Male"));
        employees.add(new Employee("Michelle Wright", 34, 85000, "Data Analyst", "Business", 3, "Female"));
        employees.add(new Employee("Brian Scott", 26, 62000, "Junior Developer", "IT", 10, "Male"));
        employees.add(new Employee("Lisa Green", 29, 72000, "HR Coordinator", "HR", 5, "Female"));
        employees.add(new Employee("Daniel Lewis", 37, 90000, "Project Coordinator", "IT", 4, "Male"));
        employees.add(new Employee("Catherine Lee", 32, 81000, "Social Media Manager", "Marketing", 1, "Female"));
        employees.add(new Employee("Jacob Hall", 40, 95000, "IT Director", "IT", 2, "Male"));
        employees.add(new Employee("Olivia Turner", 25, 68000, "Research Analyst", "Research", 9, "Female"));
        employees.add(new Employee("Matthew Harris", 38, 87000, "Support Engineer", "IT", 8, "Male"));
        employees.add(new Employee("Angela Johnson", 31, 74000, "Web Designer", "Design", 6, "Female"));
        employees.add(new Employee("Edward Young", 43, 92000, "Network Administrator", "IT", 3, "Male"));
        employees.add(new Employee("Jessica Hernandez", 29, 69000, "Content Writer", "Marketing", 10, "Female"));
        employees.add(new Employee("George Roberts", 36, 84000, "Product Manager", "IT", 5, "Male"));
        employees.add(new Employee("Emily Walker", 30, 80000, "Sales Manager", "Sales", 4, "Female"));
        employees.add(new Employee("David Martinez", 27, 72000, "Customer Support", "Support", 1, "Male"));
        employees.add(new Employee("Sarah Wilson", 39, 91000, "Business Consultant", "Consulting", 2, "Female"));
        employees.add(new Employee("Jason Allen", 34, 87000, "Technical Support", "Support", 3, "Male"));
        employees.add(new Employee("Victoria King", 26, 68000, "Marketing Analyst", "Marketing", 6, "Female"));
        employees.add(new Employee("Anthony Scott", 35, 85000, "IT Consultant", "IT", 9, "Male"));
        employees.add(new Employee("Megan Lewis", 31, 78000, "Office Manager", "Administration", 7, "Female"));
        employees.add(new Employee("Charles Taylor", 28, 73000, "Account Executive", "Sales", 10, "Male"));
        employees.add(new Employee("Abigail White", 30, 80000, "Research Scientist", "Research", 8, "Female"));
        employees.add(new Employee("Joshua Young", 36, 92000, "Business Analyst", "Business", 1, "Male"));
        employees.add(new Employee("Natalie Harris", 32, 81000, "Training Coordinator", "HR", 5, "Female"));
        employees.add(new Employee("Henry Walker", 38, 90000, "Sales Director", "Sales", 4, "Male"));
        employees.add(new Employee("Ava Green", 27, 69000, "Product Designer", "Design", 2, "Female"));
        employees.add(new Employee("Lucas Allen", 33, 85000, "Senior Software Engineer", "IT", 3, "Male"));
        employees.add(new Employee("Grace Taylor", 40, 95000, "Customer Success Manager", "Support", 1, "Female"));
        employees.add(new Employee("Jack ROBINSON", 26, 68000, "Junior Analyst", "Business", 10, "Male"));
        employees.add(new Employee("Ella Thompson", 29, 73000, "IT Support", "Support", 9, "Female"));
        employees.add(new Employee("Samuel Davis", 41, 92000, "Head of HR", "HR", 8, "Male"));
        employees.add(new Employee("Chloe Smith", 36, 90000, "Executive Assistant", "Administration", 6, "Female"));
    }

    public static List<Employee> getEmployees() {
        // Sort employees by performance rank
        Collections.sort(employees, Comparator.comparingInt(Employee::getPerformanceRank));
        return employees;
    }

}