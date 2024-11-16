/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//........Program to print fibonacci series...........
package practice_question_java;
import java.util.*;
public class Fibonacci_series {
    public static void main(String[]args)
    {
        int a=0;
        int b=1;
        int next;
        int num=10;
        for(int i=2;i<num;i++)
        {
            next=a+b;
            System.out.print(next+" ");
            a=b;
            b=next;
        }
    }
}
