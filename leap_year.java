/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//...........Program to check leap year or not..............
package practice_question_java;
import java.util.*;
public class leap_year {
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
         System.out.println("Enter year");
        int year=sc.nextInt();
        if(year%4==0 && (year%400==0 || year%100!=0))
        {
            System.out.println(year+" is a leap year");
        }
        else
        {
            System.out.println(year+" is not a leap year");
        }
        
        
       
    }
}
