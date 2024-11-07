/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

//............Program to check whether given number is Armstrong or not..................
package practice_question_java;
import java.util.*;
public class Armstrong_num {
    public static void main(String[]args)
    {
        int num=153;
        if(isArm(num))
        {
            System.out.println("It is Armstrong number");
        }
        else
        {
            System.out.println("It is not Armstrong number");
        }
    }
    
    public static boolean isArm(int num)
    {
        int sum=0; int rem=0;
       
        //calculate digit
        int count_digit=0;
        int temp=num;
        while(temp!=0)
        {
            temp=temp/10;
            count_digit++;
            
        }
        
        temp=num;
        //calculate Armstrong
         while(temp!=0)
         {
             rem=temp%10;
             sum+=Math.pow(rem,count_digit);
             temp=temp/10;
         }
         if(num==sum)
         {
             return true;
         }
         else{
         return false;
         }
    }
}
