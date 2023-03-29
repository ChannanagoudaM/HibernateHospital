package dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
@Entity
public class Addres {
	@Id
private int aid;
private String street;
private String state;
private String country;
@OneToOne
private Branches b;
public int getAid() {
	return aid;
}
public void setAid(int aid) {
	this.aid = aid;
}
public String getStreet() {
	return street;
}
public void setStreet(String street) {
	this.street = street;
}
public String getState() {
	return state;
}
public void setState(String state) {
	this.state = state;
}
public String getCountry() {
	return country;
}
public void setCountry(String country) {
	this.country = country;
}
public Branches getB() {
	return b;
}
public void setB(Branches b) {
	this.b = b;
}
@Override
public String toString() {
	return "Addres [aid=" + aid + ", street=" + street + ", state=" + state + ", country=" + country + ", b=" + b + "]";
}

}
