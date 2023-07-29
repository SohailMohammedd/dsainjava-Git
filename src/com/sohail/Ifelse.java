package com.sohail;

public class Ifelse {
    public static void main(String[] args) {
        int salary = 85000;

        if (salary > 100000)
        {
            salary = salary + 10000;
        }
        else{
            salary = salary +5000;
        }
        System.out.println(salary);
    }
}
