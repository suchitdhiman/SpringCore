package com.sk.client;

import com.sk.com.Adhar;
import com.sk.com.Employee;
import com.sk.com.Person;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        Adhar adhar = new Adhar(213437483748l, 25, 9374934947l);
        
        Person employee = new Employee("monu", adhar, "saharanpur", "mphasis", 25000);
        System.out.println(employee);
    }
}
