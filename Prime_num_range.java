/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//..........Program to list of prime numbers in given range..................
package practice_question_java;

public class Prime_num_range {
 public static boolean prime(int n)
 {
     if(n<2)
     {
         return false;
     }
     else
     {
         for(int i=2;i<n;i++)
         {
             if(n%i==0)
             {
                 return false;
                 
             }
          
         }
         return true;
     }
 }
 public static void print()
 {
     for(int i=2;i<15;i++)
     {
         if(prime(i))
         {
             System.out.println(i);
         }
     }
 }
 public static void main(String[]args)
 {
     print();
 }
}
