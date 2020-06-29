package com.calculator;

import org.apache.tomcat.util.net.jsse.JSSEUtil;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Calendar;


class Calculator {
    private int a;
    private int b;

    public Calculator() {
    }

    public int addAtoB(int a, int b) {
        return a + b;
    }

    public int substractAfromB(int a, int b) {
        return a - b;
    }

    public int multiplyAB(int a, int b) {
        return a * b;
    }

    public double divideAB(int a, int b) {
        if (a != 0 && b != 0) {
        }
        return a / b;
    }
}



@SpringBootApplication
public class CalculatorProjectApplication {

    public static void main(String[] args) {

        Calculator calculate = new Calculator();

        int add = calculate.addAtoB(2, 4);
        int minus = calculate.substractAfromB(10, 5);
        int multiply = calculate.multiplyAB(5, 5);
        double divide = calculate.divideAB(10, 2);

        System.out.println(add);
        System.out.println(minus);
        System.out.println(multiply);
        System.out.println(divide);
    }

}
