package com.divisosofttech;

import java.util.Comparator;
import java.util.Optional;

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
    Employee age = Employee.getEmployees().stream()
                .max(Comparator.comparingDouble(Employee::getAge))
                .orElse(null);

    SecretKeys.answerKeys[1]  = age .getDesignation() ; //
            


    // # Question 3 Clue word is the department name of the employee with the min age.
    Employee minage= Employee.getEmployees().stream()
    .min(Comparator.comparingDouble(Employee::getAge))
    .orElse(null);
    
    SecretKeys.answerKeys[2]  = minage.getDepartment();

   // # Question 4 Clue word is the designation name of the employee with the longest name 

   Employee maxlen= Employee.getEmployees().stream()
    .max(Comparator.comparingInt(n->n.getName().length()))
    .orElse(null);
    
    SecretKeys.answerKeys[3]  =  maxlen.getDesignation(); 


   // # Question 4 Clue word is the department name of the employee with the longest designation name
        
   Employee maxlength= Employee.getEmployees().stream()
    .max(Comparator.comparingInt(n->n.getDesignation().length()))
    .orElse(null);
    
    SecretKeys.answerKeys[4]  =  maxlength.getDepartment();

    


  // # Questino 5 Clue word is the name of the employee with the shortest department name   
    
  Employee minlength= Employee.getEmployees().stream()
    .min(Comparator.comparingInt(n->n.getDepartment().length()))
    .orElse(null);
    
    SecretKeys.answerKeys[5]  =  minlength.getName();

  // Question 6 Clue word is the designation of the employee with the name that has "java" in it  

    Employee startj=Employee.getEmployees().stream().filter(n->n.getName().contains("java")).findFirst().orElse(null);



    SecretKeys.answerKeys[6]  = startj.getDesignation(); ;

//  Question 7 Clue word is name of the department with an employee whose name starts with "P" and has the word "jdk" in it

   
  Employee clueWord = Employee.getEmployees().stream()
            .filter(emp -> emp.getName().startsWith("P"))  
            .filter(emp -> emp.getName().toLowerCase().contains("jdk"))  
            
            .findFirst().orElse(null);

    SecretKeys.answerKeys[7]  = clueWord.getDepartment() ;

    // Question 8 Clue word is the name of the department with an employee whose name has four letters and the name starts with "N"
    Employee fourle = Employee.getEmployees().stream()
    .filter(n -> n.getName().startsWith("N"))  
    .filter(n -> n.getName().length()==4)  
    
    .findFirst().orElse(null);
    
    SecretKeys.answerKeys[8]  = fourle.getDepartment();

    // Question 8 Clue word is the name of the employee whose salary is 763737


    Employee specificSalaryEmployee = Employee.getEmployees().stream()
    .filter(n -> n.getSalary() == 763737)  // Filter employees with salary 763737
    .findFirst()                               // Get the first match
    .orElse(null); 

    SecretKeys.answerKeys[9]  = specificSalaryEmployee.getName() ;

    //  Question 9 clue word is name of the employee whose department is Cloud

    

    Employee cloudEmployee = Employee.getEmployees().stream()
    .filter(emp -> emp.getDepartment().equalsIgnoreCase("Cloud"))  // Filter employees in "Cloud" department
    .findFirst()                                                   // Get the first match
    .orElse(null);    

    SecretKeys.answerKeys[10]  =cloudEmployee.getName() ;

    
   



    

    SecretKeys.checkAnswerKeyForLevels();
    }
}
