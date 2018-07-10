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
public class GCD2 
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter First number :");
        int a = scan.nextInt();
        System.out.println("Enter Second number :");
        int b = scan.nextInt();
        
        int minm = (a<b)? a:b;
        int maxm = (a>b)? a:b;
        
        int gcd = 1;
        
        while(minm != 0)
        {
            gcd = minm;
            minm = maxm % minm;           
        }
        
        System.out.println("Gcd of "+a+" and "+b+" is "+gcd);
    }    
}
