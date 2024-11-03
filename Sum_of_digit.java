/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//.......Program to sum of given digits............
package practice_question_java;
import java.util.*;
public class Sum_of_digit {
    public static void main(String[]args)
    {
        int num=46598;
        int sum=0;
        while(num>0)
        {
        int ld=num%10;
        sum=sum+ld;
        num=num/10;
    }
        System.out.println("The sum of given digits are:"+sum);
    }
}
