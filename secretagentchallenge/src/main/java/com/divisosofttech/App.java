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

    SecretKeys.answerKeys[1]  = "";


    // # Question 3 Clue word is the department name of the employee with the min age.

    
    SecretKeys.answerKeys[2]  = "" ;

   // # Question 4 Clue word is the designation name of the employee with the longest name 
   
    SecretKeys.answerKeys[3]  = "" ;



   // # Question 4 Clue word is the department name of the employee with the longest designation name
        
   

    SecretKeys.answerKeys[4]  = "" ;


  // # Questino 5 Clue word is the name of the employee with the shortest department name   
    

    SecretKeys.answerKeys[5]  = "" ;

  // Question 6 Clue word is the designation of the employee with the name that has "java" in it  

    


    SecretKeys.answerKeys[6]  = "" ;

//  Question 7 Clue word is name of the department with an employee whose name starts with "P" and has the word "jdk" in it

   
   

    SecretKeys.answerKeys[7]  = "" ;

    // Question 8 Clue word is the name of the department with an employee whose name has four letters and the name starts with "N"

    
    SecretKeys.answerKeys[8]  = "" ;

    // Question 8 Clue word is the name of the employee whose salary is 763737


    

    SecretKeys.answerKeys[9]  = "" ;

    //  Question 9 clue word is name of the employee whose department is Cloud

    

    

    SecretKeys.answerKeys[10]  = "" ;

    
   



    

    SecretKeys.checkAnswerKeyForLevels();
    }
}
