/*
Q1) Write a program to create a class named shape.
It should contain 2 methods, draw() and erase() that prints &ldquo;Drawing Shape&rdquo; and &ldquo;Erasing Shape&rdquo; respectively.
*/

import java.util.Scanner;

public class shape {
    void draw(){
        System.out.println("Drawing Shape");
    }

    void erase(){
        System.out.println("Erasing Shape");
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        shape obj = new shape();
        obj.draw();
        obj.erase();
    }
}