package dao;

import java.util.*;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import dto.Addres;
import dto.Branches;
import dto.Encounter;
import dto.Hospital;
import dto.Items;
import dto.MetOrder;
import dto.Observation;
import dto.Person;
import dto.User;

public class Insert {
	public void insertion()
	{
		
		EntityManagerFactory emf= Persistence.createEntityManagerFactory("Channanagouda");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		et.begin();
		Scanner sc=new Scanner(System.in);
		
		
		
			Addres a=new Addres();
			Branches b=new Branches();
			Encounter e=new Encounter();
			Hospital h=new Hospital();
			Items i=new Items();
			MetOrder m=new MetOrder();
			Observation o=new Observation();
			Person p=new Person();
			User u=new User();
			
			
			
			
			System.out.println("enter hospital id");
			int hid=sc.nextInt();
			h.setHid(hid);
			System.out.println("enter hospital name");
			String Hname=sc.next();
			h.setName(Hname);
		    System.out.println("enter hospital website ");
		    String website=sc.next();
			h.setWebsite(website);
			
			
			
			System.out.println("enter branch id");
			int bid=sc.nextInt();
			b.setBid(bid);
			System.out.println("enter branch email ");
			String bemail=sc.next();
			b.setEmail(bemail);
			System.out.println("enter branch mobnumber");
			long mobnumber=sc.nextLong();
			b.setMobNo(mobnumber);
			System.out.println("enter branch name");
			String bname=sc.next();
			b.setName(bname);
			
			
			
			System.out.println("enter id of addres");
			int aid=sc.nextInt();
			a.setAid(aid);
			System.out.println("enter country name");
			String country=sc.next();
			a.setCountry(country);
			System.out.println("enter satte name");
			String state=sc.next();
			a.setState(state);
			System.out.println("enter street name");
			String street=sc.next();
			a.setStreet(street);
			
			
			
			System.out.println("enter encounter id");
			int eid=sc.nextInt();
			e.setEid(eid);
			System.out.println("enter admitted date");
			String adate=sc.next();
			e.setDofJoin(adate);
			System.out.println("enter dscharge date");
			String ddate=sc.next();
			e.setDofDischarge(ddate);
			System.out.println("enter reason");
			String reason=sc.next();
			e.setReason(reason);
			
			
			
			System.out.println("enter items id");
			int iid=sc.nextInt();
			i.setIid(iid);
			System.out.println("total cost of items");
			double cost=sc.nextDouble();
			i.setCost(cost);
			System.out.println("enter items name");
			String itemsname=sc.next();
			i.setName(itemsname);
			
			
			
			System.out.println("enter materials ordered id");
			int mid=sc.nextInt();
			m.setMid(mid);
			System.out.println("enter materials name");
			String mname=sc.next();
			m.setDname(mname);
			System.out.println("enter orderd date ");
			String mdate=sc.next();
			m.setoDate(mdate);
			
			
			
			
			System.out.println("enter observation id");
			int oid=sc.nextInt();
			o.setOid(oid);
			System.out.println("enter observator name");
			String oname=sc.next();
			o.setDname(oname);
			System.out.println("enter duration of observation");
			String odate=sc.next();
			o.setYoObservation(odate);
			
			
			System.out.println("enter person id");
			int pid=sc.nextInt();
			p.setPid(pid);
			System.out.println("enter person name");
			String pname=sc.next();
			p.setName(pname);
		    System.out.println("enter person mobnumber");
		    long pno=sc.nextLong();
			p.setmNumber(pno);
			System.out.println("enter person gender");
			String gender=sc.next();
			p.setGender(gender);
			System.out.println("enter person age");
			int age=sc.nextInt();
			p.setAge(age);
			System.out.println("enter person addres");
			String paddres=sc.next();
			p.setAddres(paddres);
			
			
			System.out.println("enter user id");
			int uid=sc.nextInt();
			u.setUid(uid);
			System.out.println("enter user mail");
			String mail=sc.next();
			u.setEmail(mail);
			System.out.println("enter user mobnumber");
			long mno=sc.nextLong();
			u.setMno(mno);
			System.out.println("enter user name");
			String uname=sc.next();
			u.setName(uname);
			System.out.println("enter user password");
			int password=sc.nextInt();
			u.setPassword(password);
			System.out.println("enter user role");
			String role=sc.next();
			u.setRole(role);
			
			
			a.setB(b);
			
			b.setA(a);
			b.setH(h);
			b.getE().add(e);
			
			e.getO().add(o);
			e.getM().add(m);
			e.setP(p);
			
			i.setM(m);
			
			
			h.getB().add(b);
		
			
			m.setE(e);
			m.getI().add(i);
			
			
			o.setE(e);
			
			p.getE().add(e);
			
			
			em.persist(i);
			em.persist(p);
			em.persist(h);
			em.persist(o);
			em.persist(b);
			em.persist(m);
			em.persist(a);
			em.persist(u);
			em.persist(e);
			
			et.commit();
			
			
			
			
		
		

		}
	}
//null is an literal
//53 reserved words
//keywords:a words with some functionality ex:if()
//50 keywords
//3:literal words
// reserved literal words
//1:true 2:false 3:null

