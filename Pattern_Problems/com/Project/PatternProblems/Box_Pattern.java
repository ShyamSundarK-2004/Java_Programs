package com.Project.PatternProblems;
import java.util.Scanner;

public class Box_Pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter the number of columns: ");
        int cols = sc.nextInt();


        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
  sc.close();
    }

}

//output:
//Enter the number of rows: 4
//Enter the number of columns: 5    
//* * * * *
//* * * * *
//* * * * *
//* * * * * 
