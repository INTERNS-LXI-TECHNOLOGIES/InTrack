package com.divisosofttech;

import java.util.Comparator;

import com.divisosofttech.data.Employee;
import com.divisosofttech.keys.SecretKeys;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    
    // #Question 1

     Employee maxSalaryEmployee = Employee.getEmployees().stream()
                .max(Comparator.comparingDouble(Employee::getSalary))
                .orElse(null); // In case the list is empty    

    SecretKeys.answerKeys[0]  = maxSalaryEmployee.getName() ;


    // # Question 2 Clue word is the designation name of the employee who has the max age.
    Employee maxAgeEmployee = Employee.getEmployees().stream()
    .max(Comparator.comparingDouble(Employee::getAge))
    .orElse(null); // In case the list is empty    

    SecretKeys.answerKeys[1]  = maxAgeEmployee.getDesignation();


    // # Question 3 Clue word is the department name of the employee with the min age.
    Employee minAgeEmployee = Employee.getEmployees().stream()
    .min(Comparator.comparingDouble(Employee::getAge))
    .orElse(null); // In case the list is empty    
   
    SecretKeys.answerKeys[2]  = minAgeEmployee.getDepartment() ;

   // # Question 4 Clue word is the designation name of the employee with the longest name 
   
    Employee longestName = Employee.getEmployees().stream().max(Comparator.comparingDouble((n)->n.getName().length())).orElse(null);

    SecretKeys.answerKeys[3]  = longestName. getDesignation();

   // # Question 4 Clue word is the department name of the employee with the longest designation name
        
   Employee longestDesignationName = Employee.getEmployees().stream().max(Comparator.comparingDouble((n)->n.getDesignation().length())).orElse(null);

    SecretKeys.answerKeys[4]  = longestDesignationName.getDepartment() ;


  // # Questino 5 Clue word is the name of the employee with the shortest department name   
    Employee shortestDepartmentName = Employee.getEmployees().stream().min(Comparator.comparingDouble((n)->n.getDepartment().length())).orElse(null);

    SecretKeys.answerKeys[5]  = shortestDepartmentName.getName() ;

  // Question 6 Clue word is the designation of the employee with the name that has "java" in it  

    Employee nameOfEmployee = Employee.getEmployees().stream().filter((n)->n.getName().contains("java")).findFirst().orElse(null);

    SecretKeys.answerKeys[6]  = nameOfEmployee.getDesignation() ;

//  Question 7 Clue word is name of the department with an employee whose name starts with "P" and has the word "jdk" in it

   Employee nameOfEmployeeP = Employee.getEmployees().stream().filter((n)->n.getName().startsWith("P")).filter(n->n.getName().contains("jdk")).findFirst().orElse(null);
   
   SecretKeys.answerKeys[7]  = nameOfEmployeeP.getDepartment() ;

    // Question 8 Clue word is the name of the department with an employee whose name has four letters and the name starts with "N"

    Employee nameOfEmployeeN = Employee.getEmployees().stream().filter((n)->n.getName().startsWith("N")).filter(n->n.getName().length()==4).findFirst().orElse(null);
    
    SecretKeys.answerKeys[8]  = nameOfEmployeeN.getDepartment() ;

    // Question 8 Clue word is the name of the employee whose salary is 763737


    Employee nameOfEmployeeS = Employee.getEmployees().stream().filter((n)->n.getSalary()==763737).findFirst().orElse(null);

    SecretKeys.answerKeys[9]  = nameOfEmployeeS.getName() ;

    //  Question 9 clue word is name of the employee whose department is Cloud

    Employee departmentIsCloud = Employee.getEmployees().stream().filter(n->n.getDepartment().equals("Cloud")).findFirst().orElse(null);
   
    SecretKeys.answerKeys[10]  = departmentIsCloud.getName() ;

    SecretKeys.checkAnswerKeyForLevels();
    }
}
