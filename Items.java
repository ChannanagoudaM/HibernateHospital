package dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
@Entity
public class Items {
private String name;
@Id
private int iid;
private double cost;
@ManyToOne
private MetOrder m;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getIid() {
	return iid;
}
public void setIid(int iid) {
	this.iid = iid;
}
public double getCost() {
	return cost;
}
public void setCost(double cost) {
	this.cost = cost;
}
public MetOrder getM() {
	return m;
}
public void setM(MetOrder m) {
	this.m = m;
}
@Override
public String toString() {
	return "Items [name=" + name + ", iid=" + iid + ", cost=" + cost + ", m=" + m + "]";
}

}
