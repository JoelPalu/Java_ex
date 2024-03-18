package org.example;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortFilterLambda {
    public static void main(String[] args) {
        ArrayList<Person> people = new ArrayList<>();

        people.add(new Person("Alice", 30, "New York"));
        people.add(new Person("Bob", 25, "Los Angeles"));
        people.add(new Person("Charlie", 35, "New York"));
        people.add(new Person("David", 28, "Chicago"));
        people.add(new Person("Eve", 22, "New York"));

        System.out.println("Unsorted list:");
        for (Person person : people) {
            System.out.println(person);
        }

        // Sort by age
        System.out.println("\nSorted by age:");
        people.sort(Comparator.comparingInt(Person::getAge));
        for (Person person : people) {
            System.out.println(person);
        }

        // Filter by city
        List<Person> filtered = people.stream()
                .filter(person -> person.getCity().equals("New York"))
                .collect(Collectors.toList());

        // Print the sorted and filtered list
        System.out.println("\nFiltered by city (New York):");
        for (Person person : filtered) {
            System.out.println(person);
        }
    }
}