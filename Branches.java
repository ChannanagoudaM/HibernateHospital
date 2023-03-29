package dto;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
@Entity
public class Branches {
	@Id
private int bid;
private String name;
private String email;
private long mobNo;
@ManyToOne
private Hospital h;
@OneToOne
private Addres a;
@OneToMany
private List<Encounter> e=new ArrayList<Encounter>();
public int getBid() {
	return bid;
}
public void setBid(int bid) {
	this.bid = bid;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public long getMobNo() {
	return mobNo;
}
public void setMobNo(long mobNo) {
	this.mobNo = mobNo;
}
public Hospital getH() {
	return h;
}
public void setH(Hospital h) {
	this.h = h;
}
public Addres getA() {
	return a;
}
public void setA(Addres a) {
	this.a = a;
}
public List<Encounter> getE() {
	return e;
}
public void setE(List<Encounter> e) {
	this.e = e;
}
@Override
public String toString() {
	return "Branches [bid=" + bid + ", name=" + name + ", email=" + email + ", mobNo=" + mobNo + ", h=" + h + ", a=" + a
			+ ", e=" + e + "]";
}

}
