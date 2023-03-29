package dto;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
@Entity
public class Person {
private String name;
@Id
private int pid;
private String addres;
private long mNumber;
private int age;
private String gender;
@OneToMany
private List<Encounter> e=new ArrayList<Encounter>();
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getPid() {
	return pid;
}
public void setPid(int pid) {
	this.pid = pid;
}
public String getAddres() {
	return addres;
}
public void setAddres(String addres) {
	this.addres = addres;
}
public long getmNumber() {
	return mNumber;
}
public void setmNumber(long mNumber) {
	this.mNumber = mNumber;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
public List<Encounter> getE() {
	return e;
}
public void setE(List<Encounter> e) {
	this.e = e;
}
@Override
public String toString() {
	return "Person [name=" + name + ", pid=" + pid + ", addres=" + addres + ", mNumber=" + mNumber + ", age=" + age
			+ ", gender=" + gender + ", e=" + e + "]";
}

}
