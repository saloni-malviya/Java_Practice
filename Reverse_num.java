/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//...........Program to find reverse number of given number..........
package practice_question_java;

public class Reverse_num {
    public static void main(String[]args)
    {
        int rev=0;
        int num=8788;
        while(num>0)
        {
            int rem=num%10;
            rev=(rev*10)+rem;
            num=num/10;
        }
        System.out.println("The reverse of given number is:"+rev);
    }
}
