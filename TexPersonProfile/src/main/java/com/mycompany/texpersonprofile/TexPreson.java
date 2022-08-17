/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.texpersonprofile;
import java.util.Scanner;
/**
 *
 * @author Emarwalker
 */
public class TexPreson {
    String name,lastname;
    double salary,income,Tex;
    
    public void GetDataProfile(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name :");
        name = sc.nextLine();
        System.out.print("Enter last name :");
        lastname = sc.nextLine();
        System.out.print("Enter Salary :");
        salary = sc.nextDouble();        
    }
    public void  CalDataTexProfile(){
            income = salary * 12;
            
            if(income <= 150000){
                Tex = 0;
            }
            else if (income <=300000){
                Tex = 0.05;
            }
            else if (income <=500000){
                Tex = 0.10;
            }
            else if (income <=750000){
                Tex = 0.15;
            }
            else if (income <=1000000){
                Tex = 0.20;
            }
            else if (income <=2000000){
                Tex = 0.25;
            }
            else if (income <=5000000){
                Tex = 0.30;
            }
            else if (income >=5000001){
                Tex = 0.35;
            } 
    }
    
    public void ShowData(){
        System.out.println("==========================================================");
        System.out.println("Your pecentage tex calulatting is"+Tex+"income is "+income);
        System.out.println("==========================================================");
    }
    
}
