package com.divisosofttech;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.Comparator;
import java.util.stream.IntStream;
import java.util.stream.Stream;

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
      // Employee.getEmployees().stream().forEach(System.out::println);
      // SecretKeys.checkAnswerKeyForLevel();
    List<Integer>numbers = Arrays.asList(1,2,3,4,5,6,7);
      int x=9;
         int sum = numbers.stream().reduce(x, Integer::sum);
            System.out.println("The sum of all elements is  " + sum);

     List<Employee> employees = Employee.getEmployees();
        Predicate<Employee> startsWithA = emp->emp.getName().startsWith("D");

            employees.stream().
                filter(startsWithA).
                     forEach(System.out::println);

                     Employee.getEmployees().stream()
                     .sorted(Comparator.comparing(Employee::getName, Comparator.reverseOrder()))
                     .map(Employee::getName)
                     .map(String::toUpperCase)
                     .forEach(System.out::println);


    }
}
