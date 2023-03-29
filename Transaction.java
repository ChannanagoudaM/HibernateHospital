package service;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import dto.Encounter;
import dto.Items;
import dto.Person;
import exceptions.Valid;

public class Transaction {
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("Channanagouda");
	EntityManager em=emf.createEntityManager();
	EntityTransaction et=em.getTransaction();

	Scanner sc=new Scanner(System.in);

	double totalBill=0;
	double maintenance=1000;
	public void totalBill()
	{
		System.out.println("enter patient id");
		int pid=sc.nextInt();
		Person p=em.find(Person.class,pid);
		System.out.println("enter items id");
		int iid=sc.nextInt();
		Items i=em.find(Items.class,iid);
		System.out.println("enter encounter id");
		int eid=sc.nextInt();
		Encounter e=em.find(Encounter.class,eid );
		if(e!=null && p!=null && i!=null)
		{
			char []c=e.getDofJoin().toCharArray();
			char[]c1=e.getDofDischarge().toCharArray();
			int a=(c1[0]-48)*10+(c1[1]-48);
			int b=(c[0]-48)*10+(c[1]-48);
			int t=a-b;
			double totalBill=t*maintenance+i.getCost();
			System.out.println("Total bill of patient "+p.getName()+" is "+totalBill);
		}
		else
		{
			try
			{
				throw new Valid("invalid id exception");
			}
			catch(Exception e1)
			{
				System.out.println(e1.getMessage());
			}
		}



	}
}
