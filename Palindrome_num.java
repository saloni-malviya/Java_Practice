/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//......Program to check given number is palindrome or not.................
package practice_question_java;

public class Palindrome_num {
    public static void main(String[]args)
    {
        int num=121;
        int temp=num;
        int rev=0;
        while(num>0)
        {
            int ld=num%10;
            rev=(rev*10)+ld;
            num=num/10;
        }
        if(temp==rev)
        {
            System.out.println(temp+" is palindrome");
        }
        else
        {
            System.out.println(temp+" is not palindrome");
        }
    }
}
