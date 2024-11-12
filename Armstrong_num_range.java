/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

//........Program to Find Armstrong number in given range......................
package practice_question_java;

public class Armstrong_num_range {
public static void main(String[]args)
    {
        int num=1000;
        for(int i=1;i<=num;i++)
        if(isArm(i))
        {
            System.out.print(i+" ");
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
