package com.mycompany.mavenproject1;

import java.util.Scanner;

public class proj {
    public static void main(String[] args){        
        
        Scanner scan = new Scanner(System.in);
        
        byte cc = 0; 
        
        while (true) {
            
            while (cc == 1) {
                System.out.print("\nDo you want to finish?: ");
                String done = scan.nextLine();
                if (done.toLowerCase().equals("yes")) {
                    cc++; 
                } else if ( done.toLowerCase().equals("no")) {
                    cc--;
                } else {
                    System.out.println("\nEnter only yes/no.");
                }
            } if (cc == 2) { break; }
            
            System.out.print("\nEnter the value of a: ");
            float a = 0;
            if (scan.hasNextFloat()) {
                a += scan.nextFloat();
            } else {
                System.out.println("\nEnter only numbers");
                break;
            }
            System.out.print("\nEnter the value of b: ");
            float b = 0;
            if (scan.hasNextFloat()) {
                b += scan.nextFloat();
            } else {
                System.out.println("\nEnter only numbers");
                break;
            }
            System.out.print("\nEnter the value of c: ");
            float c = 0;
            if (scan.hasNextFloat()) {
                c += scan.nextFloat();
            } else {
                System.out.println("\nEnter only numbers");
                break;
            }

            float D;
            D = sqr(b) - 4*a*c;
            if (D == 0) {
                System.out.println("\nD = 0\n");
                double x;
                x = -b/2*a;
                System.out.println("Answer: X = " + x);
                cc++;
            } else if ( D < 0 ) {
                System.out.println("\nD < 0, No roots.");
                cc++;
            } else {
                System.out.println("\nD > 0\n");
                double x1;
                double x2;

                double sqrtD = Math.sqrt(D); 

                x1 = (-b + sqrtD)/2*a;
                x2 = (-b - sqrtD)/2*a;

                System.out.println("Answer: x1 = " + x1 + "\n\tx2 = " + x2);
                cc++;
            }
         }
    }

    public static float sqr(float num) {
        float res;
        res = num * num;
        return res;
    }
}
