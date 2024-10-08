package com.lambda.stream;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.time.Month;
import java.util.Date;

public class App {
    public static void main(String[] args) {

        //This code will generate a stream of LocalDate objects, filter those from the year 2023, and print them to the console.
       Stream <LocalDate> datess = Stream.generate(LocalDate::now);
       datess.filter(d->d.getYear()==2023)
       .forEach(System.out::println);

//  print an infinite stream of timestamps to the console
  Stream<Date> stream = Stream.generate(() -> { return new Date(); });
        stream.forEach(p -> System.out.println(p));

//  print an limited stream of timestamps to the console
        Stream<LocalDate> dateswithLimit = Stream.generate(LocalDate::now).limit(10);
        dateswithLimit.forEach(System.out::println);


        // Starting and ending dates for the time range
        LocalDate startDate = LocalDate.of(2023, Month.NOVEMBER, 7);
        LocalDate endDate = LocalDate.of(2024, Month.OCTOBER, 8);

        // Generate a stream of LocalDate objects
Stream<LocalDate> dates = Stream.generate(LocalDate::now).limit(10); // Generate 100 dates
        // Filter dates within the specified range (inclusive)
        List<LocalDate> filteredDates = dates
               .filter(date -> date.isAfter(startDate) || date.isEqual(startDate)) // After or equal to start date
                .filter(date -> date.isBefore(endDate) || date.isEqual(startDate)) // Before or equal to end date
                .collect(Collectors.toList());

        System.out.println("Dates within the range (" + startDate + " - " + endDate + "):");
        filteredDates.forEach(System.out::println);

      //  Stream<Date> dates = Stream.generate(() -> new Date());

    }
}