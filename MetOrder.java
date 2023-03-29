package dto;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
@Entity
public class MetOrder {
private String dname;
@Id
private int mid;
private String oDate;
@OneToMany
private List<Items> i=new ArrayList<Items>();
@ManyToOne
private Encounter e;
public String getDname() {
	return dname;
}
public void setDname(String dname) {
	this.dname = dname;
}
public int getMid() {
	return mid;
}
public void setMid(int mid) {
	this.mid = mid;
}
public String getoDate() {
	return oDate;
}
public void setoDate(String oDate) {
	this.oDate = oDate;
}
public List<Items> getI() {
	return i;
}
public void setI(List<Items> i) {
	this.i = i;
}
public Encounter getE() {
	return e;
}
public void setE(Encounter e) {
	this.e = e;
}
@Override
public String toString() {
	return "MetOrder [dname=" + dname + ", mid=" + mid + ", oDate=" + oDate + ", i=" + i + ", e=" + e + "]";
}

}
