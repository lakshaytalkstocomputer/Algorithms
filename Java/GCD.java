/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algortihms;

import java.util.Scanner;

/**
 *
 * @author SilverPanda
 */
public class GCD 
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in); 
        
        System.out.println("Enter First number :");
        int a = scan.nextInt();
        System.out.println("Enter Second number :");
        int b = scan.nextInt();
        
        int gcd = 1;
        
        int cond = (a < b)? a :b;
        
        for(int i =1; i<=cond; i++)
        {
            if(a%i ==0 && b%1==0)
            {
                gcd = i;
            }
        }
        
        System.out.println("Gcd of "+a+" and "+b+" is "+gcd);
        
        
    }   
}
