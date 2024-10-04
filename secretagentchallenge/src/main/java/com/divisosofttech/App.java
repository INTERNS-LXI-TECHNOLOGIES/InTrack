package com.divisosofttech;

import com.divisosofttech.data.Employee;
import com.divisosofttech.keys.SecretKeys;


public class App 
{
    public static void main( String[] args )
    {
       Employee.getEmployees().stream().forEach(System.out::println);
       SecretKeys.checkAnswerKeyForLevel();
    }
}
