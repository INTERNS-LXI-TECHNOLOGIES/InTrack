package com.lambda.stream;
import java.util.List;
import java.util.LinkedList;
//import java.util.Arrays;



public class EmployeeData {


    public static List<Employee>getEmployees(){

        List<Employee> empList = new LinkedList<>();

        empList.add(new Employee(1,"Fahad","IT",180000));
        empList.add(new Employee(1,"Ibrahim","IT",11000));
        empList.add(new Employee(1,"Farseen","Business",19000));
        empList.add(new Employee(1,"kiran","Procurement",18200));
        empList.add(new Employee(1,"Yasir","Logistics",13200));
        empList.add(new Employee(1,"Fairuz","Manufacturing",13000));
        empList.add(new Employee(1,"Aswin","IT",14000));
        empList.add(new Employee(1,"Nimmy","Marketing",16000));
        empList.add(new Employee(1,"Yedhu","Manufacturing",17000));
        empList.add(new Employee(1,"Sarath","IT",18000));
        empList.add(new Employee(1,"Afsal","Marketing",18000));
        empList.add(new Employee(1,"magesh","Logistics",18600));
        empList.add(new Employee(1,"Jayaram","Accounting",14300));
        empList.add(new Employee(1,"Mohd Fahad","IT",138000));
        empList.add(new Employee(1,"avinash","Accounting",28000));

        return empList;

    }

    public static List<String> getNames(){

        List<String> memberNames = new LinkedList<>();
            memberNames.add("balan");
            memberNames.add("Rashid");
            memberNames.add("Anjana");
            memberNames.add("Midhuna");
            memberNames.add("Lavanya");
            memberNames.add("Sainu");
            
            return memberNames;
        }
    }





