/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//..............Program to check number is prime or not......................
package practice_question_java;
import java.util.*;
public class Prime_number {
    public static void prime(int n)
    {
        int flag=0;
        if(n<2)
        {
            System.out.println(n+" is  not prime");
        }
        else{
        for(int i=2;i<n;i++)
        {
            if(n%i==0)
            {
                flag=1;
                break;
            }
            
        }
        if(flag==0)
        {
            System.out.println(n+" is prime");
        }
        else
        {
            System.out.println(n+" is not prime");
        }
        }
    }
   
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number");
        int n=sc.nextInt();
        
        prime(n);
    }
}
