/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//.........Program to chcek number is even or odd and list of even and odd numbers from 1 to 15...
package practice_question_java;
import java.util.*;
public class Even_odd {
    public static void main(String[]args)
    {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter number");
       int n=sc.nextInt();
        if(n%2==0)
        {
            System.out.println(n+" is even");
        }
        else
        {
            System.out.println(n+" is odd");
        }
        
        
        System.out.println("the even number of 1 to 15 are:");
        for(int i=1;i<=15;i++)
        {
            
            if(i%2==0)
            {
                System.out.print(i+" ");
            }
           
        }
        System.out.println();
        System.out.println("the odd number of 1 to 15 are:");
        for(int i=1;i<=15;i++)
        {
            
            if(i%2!=0)
            {
                System.out.print(i+" ");
            }
           
        }
    }
}
