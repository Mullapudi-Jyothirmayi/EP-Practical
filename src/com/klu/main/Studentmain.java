package com.klu.main;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import com.klu.Bean.StudentBean;
import com.klu.insert.StudentInsertion;

public class Studentmain {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		StudentBean sb=new StudentBean();
		sb.setRegno(102);
		sb.setName("Arjun");
		sb.setRegno(103);
		sb.setName("Bhargav");
		/*sb.setRegno(104);
		sb.setName("Chinna");
		sb.setRegno(105);
		sb.setName("Dinesh");
		sb.setRegno(106);
		sb.setName("Satya");*/
		//switch case
		while(true) {
			System.out.println("1.Insertion \n2.Deletion \n3.Updation \n4.Display \nEnter your Choice");
			int a = sc.nextInt();
			switch(a) 
			{
			case 1 :
				@SuppressWarnings("unused") StudentInsertion si=new StudentInsertion();
				int i = StudentInsertion.StudentInsert(sb);
				if(i>0)
				{
					System.out.println("Insertion is successfull");
				}
				else
				{
					System.out.println("Insertion-Fail");
				}
				break;
			case 2:
				@SuppressWarnings("unused") StudentInsertion si1=new StudentInsertion();
				int j = StudentInsertion.StudentDelete(sb);
				if(j>0)
				{
					System.out.println("Deletion is successfull");
				}
				else
				{
					System.out.println("Deletion-Fail");
				}
				break;
			case 3:
				@SuppressWarnings("unused") StudentInsertion si2=new StudentInsertion();
				int k = StudentInsertion.StudentUpdate(sb);
				if(k>0)
				{
					System.out.println("Updation is successfull");
				}
				else
				{
					System.out.println("Updation-Fail");
				}
				break;
			case 4:
				@SuppressWarnings("unused") StudentInsertion si3=new StudentInsertion();
				@SuppressWarnings("unused") ResultSet m = StudentInsertion.StudentDisplay(sb);
				break;
			default: System.exit(0);				
			}
			
		}
		
	}

}
