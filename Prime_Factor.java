/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

//.......Program to find prime factor of a number..............
package practice_question_java;

public class Prime_Factor {
    public static void main(String[]args)
    {
        int num=15;
        for(int i=2;i<=num;i++)
        {
            if(num%i==0)
            {
                System.out.print(i+" ");
                num/=i;
            }
        }
    }
    
}
