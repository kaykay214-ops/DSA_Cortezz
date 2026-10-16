/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.program_cortez;
import java.util.Scanner;
/**
 *
 * @author CL2-PC
 */
public class Program_cortez {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Kylene Cortez");
        System.out.println("Enter a number:");
        int x = input.nextInt();
        System.out.println("Enter a number:");
        int y = input.nextInt();
        int sum,diff,prod,div;
        
        sum = x+y;
        diff = x-y;
        prod = x*y;
        div = x/y;
        System.out.println("sum is:"+sum);
        System.out.println("diff is:"+diff);
        System.out.println("prod is:"+prod);
        System.out.println("div is:"+div);
        
        
        
    }
}
