/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//.........Program to find greater number in three variable.........
package practice_question_java;
import java.util.*;
public class Greater_two_number {
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number");
        int a=sc.nextInt();
         System.out.println("Enter second number");
        int b=sc.nextInt();
         System.out.println("Enter third number");
        int c=sc.nextInt();
        
        if(a>b && a>c)
        {
            System.out.println(a+" is greater");
        }
        else if(b>a && b>c)
        {
            System.out.println(b+" is greater");
        }
        else
        {
            System.out.println(c+" is greater");
        }
    }
}
