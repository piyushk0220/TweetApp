package com.demo.main;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import com.demo.tweet.Registration;

public class Main {

	 public static void main(String[] args) throws FileNotFoundException{
	     
	        try {
	             
	              File obj = new File("Registration.txt");
	               
	              if (obj.createNewFile()) 
	              {
	                System.out.println("File is created");
	              } 
	               
	            } 
	            catch (IOException e) 
	            {
	              System.out.println("An error occurred.");
	              e.printStackTrace();
	               
	            }
	         
	        int choice;
	        Scanner sc=new Scanner(System.in);
	        System.out.println("1. Registration ");
	        System.out.println("2. Login. ");
	        System.out.println("3. Forgot Password"); 
	        
	        System.out.println("Enter your Choice");
	        choice=sc.nextInt();
	        sc.nextLine();
	        
	     
	         
	        if(choice==1)
	        {
	            Registration user = new Registration();
	            user.register();
	        }
	        else if(choice==2)
	        {
	            Registration user = new Registration();
	            user.login();
	        }
	        else
	        {
	            System.out.println("Please follow the steps to change password ");
	            //user.forgotPassword();
	        }
	        sc.close();
	        
	    }
}
