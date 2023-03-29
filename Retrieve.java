package dao;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import dto.Branches;
import dto.Encounter;
import dto.Hospital;
import dto.MetOrder;
import dto.Observation;
import dto.Person;
import dto.User;
import exceptions.Valid;

public class Retrieve {

	public void traverse(){
		EntityManagerFactory emf= Persistence.createEntityManagerFactory("Channanagouda");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		et.begin();
		System.out.println("1:patien // 2:encounter // 3:branches // 4:hospital // 5:metorder // 6:observation // 7:user");
		while(true)
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("enter choice");
			int choice=sc.nextInt();
			switch(choice)
			{
			case 1:System.out.println("enter id of patien");
			int pid=sc.nextInt();
			Person p=em.find(Person.class, pid);
			if(p!=null)
			{

				System.out.println(p.getName()+","+p.getAddres()+","+p.getAge()+","+p.getGender()+","+p.getmNumber()+",");
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
			break;
			case 2:System.out.println("enter encounter  id");
			int eid=sc.nextInt();
			Encounter e=em.find(Encounter.class, eid);
			if(e!=null)
			{
				System.out.println("discharge date "+e.getDofDischarge()+","+"admitted date "+e.getDofJoin()+","+e.getReason());
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
			case 3:System.out.println(" enter branches id");
			int bid=sc.nextInt();
			Branches b=em.find(Branches.class,bid);
			if(b!=null)
			{
				System.out.println("email is "+b.getEmail()+","+b.getMobNo()+","+b.getName());
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
			case 4:System.out.println("enter hospital id");
			int hid=sc.nextInt();
			Hospital h=em.find(Hospital.class,hid);
			if(h!=null)
			{
				System.out.println(h.getName()+","+h.getWebsite());
			}
			else
			{
				System.out.println("data not found");
			}
			break;

			case 5:System.out.println("enter metorder id");
			MetOrder m=new MetOrder();
			int mid=sc.nextInt();
			MetOrder m1=em.find(MetOrder.class, mid);
			if(m1!=null)
			{
				System.out.println(m1.getDname()+","+m1.getoDate());
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
			break;
			case 6:System.out.println("enter observation id");
			int oid=sc.nextInt();
			Observation o=em.find(Observation.class, oid);
			if(o!=null)
			{
				System.out.println(o.getDname()+","+o.getYoObservation());
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
			break;
			case 7:System.out.println("enter user id");
			int uid=sc.nextInt();
			User us=em.find(User.class, uid);
			if(us!=null)
			{
				System.out.println(us.getEmail()+","+us.getMno()+","+us.getName()+","+us.getRole()+","+us.getPassword());
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
			break;
			default:System.out.println("invalid choice");
			}

			et.commit();

		}

	}

}
