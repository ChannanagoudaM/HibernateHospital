package controll;

import java.util.Scanner;


import dao.Insert;
import dao.Remove;
import dao.Retrieve;
import service.Transaction;

public class Main {

	public static void main(String[] args) {
		System.out.println("1:insert the data // 2:retrieve the data // 3:remove the data ");
		Scanner sc=new Scanner(System.in);
		while(true)
		{
			System.out.println("enter choice");
			int choice=sc.nextInt();
			switch(choice)
			{
			case 1:Insert i=new Insert();
			i.insertion();
			break;
			case 2:Retrieve r=new Retrieve();
			r.traverse();
			break;
			case 3:Remove re=new Remove();
			re.delete();
			case 4:
				Transaction t=new Transaction();
				t.totalBill();
			case 5:System.out.println("Thank You, Takecare");
			System.exit(0);
			default:System.out.println("invalid choice");

			}
		}

	}

}
//pom=project object module
