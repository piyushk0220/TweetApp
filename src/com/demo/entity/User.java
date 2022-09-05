package com.demo.entity;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class User {
	
	public void loggedUser(String username) throws IOException {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
		System.out.println("1. Post Tweet");
		System.out.println("2. View My Tweets");
		System.out.println("3. View all Users and their respective tweets");
		System.out.println("4. Exit");
		int input= sc.nextInt();
		if(input==1) {
			this.PostTweets(username);
		}
		else if(input==2) {
			this.ViewMyTweets(username);
		}
		else if(input==3) {
			this.ViewRegisteredUsers();
			
		}
		else if(input==4) {
			System.out.println("Exiting from tweet app");
			break;
		}
		else {
			System.out.println("wrong input, please select correct option");
		}
		}
	}
	
	public void PostTweets(String username) throws IOException {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your tweet");
		String tweet=sc.nextLine();
		File f = new File(username+".txt");
		BufferedWriter out = new BufferedWriter(new FileWriter(username+".txt", true)); 
        out.write(tweet+ "\n");
        out.close();
		
		
	}
	
	public void ViewMyTweets(String username) {
		System.out.println("Tweets of this user");
		
		  File f = new File(username+".txt");
          try (Scanner content = new Scanner(f)) {
			while (content.hasNextLine()) {
			    String data = content.nextLine();
			  System.out.println(data);
			        
			       
			    
			  }
		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	public void ViewRegisteredUsers() {
		
		File f = new File("Registration.txt");
        try (Scanner content = new Scanner(f)) {
			while (content.hasNextLine()) {
			    String data = content.nextLine();
			  System.out.println(data.split(" ")[0]);
			  this.ViewMyTweets(data);
			  System.out.println("------------------");
			 }
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
	

}
