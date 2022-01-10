package com.epam.rd.autotasks.snail;

import java.util.Scanner;

public class Snail
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int h = scan.nextInt();
        int days = 1;
        int distance = a-b;
        if (b>=a && a<h){
            System.out.print("Impossible");
            return;
        }
        else if (a>=h) {
            System.out.println(days);
            return;
        }
        while (distance<h){
            days++;
            distance = distance + a;
            if (distance>=h) {
                System.out.println(days);
                return;
            }
            distance = distance - b;
        }
        //Write a program that reads a,b and h (line by lyne in this order) and prints
        //the number of days for which the snail reach the top of the tree.
        //a - feet that snail travels up each day, b - feet that slides down each night, h - height of the tree

    }
}
