/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//..........Program to check number is positive or negative
package practice_question_java;
import java.util.*;
import java.io.*;
public class Positive_negative {
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number");
        int n=sc.nextInt();
        if(n==0)
        {
            System.out.println("It is zero");
        }
       else if(n>0)
        {
            System.out.println(n+" is positive number");
        }
        else
        {
            System.out.println(n+" is negative number");
        }
       
    }
}
