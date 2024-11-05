/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//.........Program for factorial................
package practice_question_java;

public class Factorial {
    public static void main(String[]args)
    {
        int fact=1;
        int num=5;
        for(int i=1;i<=num;i++)
        {
            fact=fact*i;
        }
        System.out.println("The Factorial of given number is"+fact);
    }
    
}
