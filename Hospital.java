package dto;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
@Entity
public class Hospital {
private String name;
@Id
private int hid;
private String website;
@OneToMany
private List<Branches> b=new ArrayList<Branches>();
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getHid() {
	return hid;
}
public void setHid(int hid) {
	this.hid = hid;
}
public String getWebsite() {
	return website;
}
public void setWebsite(String website) {
	this.website = website;
}
public List<Branches> getB() {
	return b;
}
public void setB(List<Branches> b) {
	this.b = b;
}
@Override
public String toString() {
	return "Hospital [name=" + name + ", hid=" + hid + ", website=" + website + ", b=" + b + "]";
}

}
