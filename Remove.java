package dao;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import dto.Person;
import exceptions.Valid;

public class Remove {

	public void delete() {
EntityManagerFactory emf=Persistence.createEntityManagerFactory("Channanagouda");
EntityManager em=emf.createEntityManager();
EntityTransaction et=em.getTransaction();
Scanner sc=new Scanner(System.in);
System.out.println("enter person id");
int pid=sc.nextInt();
Person p=em.find(Person.class, pid);
et.begin();
if(p!=null)
{
	em.remove(p);
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
et.commit();
	}

}
