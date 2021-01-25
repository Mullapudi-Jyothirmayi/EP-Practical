package com.supermarket.main;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import com.supermarket.Bean.SuperMarketBean;
import com.supermarket.crud.SuperMarketCRUD;

public class SuperMarketmain {
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		SuperMarketBean b = new SuperMarketBean();
		SuperMarketCRUD c = new SuperMarketCRUD();
		while(true) {
			System.out.println("1.INSERT");
			System.out.println("2.DISPLAY");
			System.out.println("3.TOTAL COST");
			System.out.println("4.EXIT");
			System.out.println("Enter your choice : ");
			int ch = sc.nextInt();
			switch(ch) {
			case 1 :
				System.out.println("Enter item-id item-name item-cost");
				int id=sc.nextInt();
				String name=sc.next();
				float cost=sc.nextFloat();
				b.setitemid(id);
				b.setitemname(name);
				b.setitemcost(cost);
				int insertion = c.Insert(b);
				if(insertion > 0)
				{
					System.out.println("Insertion successful");
				}
				else
					System.out.println("Insertion unsuccessful");	
				break;
			
			case 2 :
				c.Display();
				break;
				
			case 3 :
				c.Totalcost();
				break;
			
			case 4 :
				System.exit(0);
			
			default :
				System.out.println("Invaild information");
			}
		}
	}

}