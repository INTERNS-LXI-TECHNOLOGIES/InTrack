package com.divisosofttech;

import java.util.Comparator;

import com.divisosofttech.data.Employee;
import com.divisosofttech.keys.SecretKeys;

/**
 * Hello world!
 *
 */
public class App {
  public static void main(String[] args) {

    // #Question 1

    Employee maxSalaryEmployee = Employee.getEmployees().stream()
        .max(Comparator.comparingDouble(Employee::getSalary))
        .orElse(null); // In case the list is empty

    SecretKeys.answerKeys[0] = maxSalaryEmployee.getName();

    // # Question 2 Clue word is the designation name of the employee who has the
    // max age.
    Employee maxAgEmployee = Employee.getEmployees().stream().max(Comparator.comparingInt(Employee::getAge))
        .orElse(null);

    SecretKeys.answerKeys[1] = maxAgEmployee.getDesignation();

    // # Question 3 Clue word is the department name of the employee with the min
    // age.

    Employee minAgEmployee = Employee.getEmployees().stream().min(Comparator.comparingInt(Employee::getAge))
        .orElse(null);

    SecretKeys.answerKeys[2] = minAgEmployee.getDepartment();
    

    // # Question 4 Clue word is the designation name of the employee with the
    // longest name
    Employee longestNameEmployee = Employee.getEmployees().stream()
        .max(Comparator.comparingInt(e -> e.getName().length())).orElse(null);

    SecretKeys.answerKeys[3] = longestNameEmployee.getDesignation();

    // # Question 4 Clue word is the department name of the employee with the
    // longest designation name

    Employee longestdesgNameEmployee = Employee.getEmployees().stream()
        .max(Comparator.comparingInt(e -> e.getDesignation().length())).orElse(null);

    SecretKeys.answerKeys[4] = longestdesgNameEmployee.getDepartment();

    // # Questino 5 Clue word is the name of the employee with the shortest
    // department name

    Employee shortestdepNameEmployee = Employee.getEmployees().stream()
        .min(Comparator.comparingInt(e -> e.getDepartment().length())).orElse(null);

    SecretKeys.answerKeys[5] = shortestdepNameEmployee.getName();

    // Question 6 Clue word is the designation of the employee with the name that
    // has "java" in it

    Employee javaNameEmployee = Employee.getEmployees().stream().filter(a -> a.getName().contains("java")).findFirst()
        .orElse(null);

    SecretKeys.answerKeys[6] = javaNameEmployee.getDesignation();

    // Question 7 Clue word is name of the department with an employee whose name
    // starts with "P" and has the word "jdk" in it

    Employee startsWithP = Employee.getEmployees().stream().filter(a -> a.getName().startsWith("P"))
        .filter(d -> d.getName().contains("jdk")).findFirst().orElse(null);

    SecretKeys.answerKeys[7] = startsWithP.getDepartment();

    // Question 8 Clue word is the name of the department with an employee whose
    // name has four letters and the name starts with "N"

    Employee startsWithN = Employee.getEmployees().stream().filter(a -> a.getName().startsWith("N")).findFirst()
        .orElse(null);

    SecretKeys.answerKeys[8] = startsWithN.getDepartment();

    // Question 8 Clue word is the name of the employee whose salary is 763737

    Employee employeeSalary = Employee.getEmployees().stream().filter(a -> a.getSalary() == 763737).findFirst()
        .orElse(null);

    SecretKeys.answerKeys[9] = employeeSalary.getName();

    // Question 9 clue word is name of the employee whose department is Cloud

    // Employee

    SecretKeys.answerKeys[10] = "";

    SecretKeys.checkAnswerKeyForLevels();
  }
}