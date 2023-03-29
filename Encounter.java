package dto;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
@Entity
public class Encounter {
	@Id
private int eid;
private String reason;
private String DofJoin;
private String DofDischarge;
@OneToMany
private List<Observation> o=new ArrayList<Observation>();
@ManyToOne
private Person p;
@OneToMany
private List<MetOrder> m=new ArrayList<MetOrder>();
public int getEid() {
	return eid;
}
public void setEid(int eid) {
	this.eid = eid;
}
public String getReason() {
	return reason;
}
public void setReason(String reason) {
	this.reason = reason;
}
public String getDofJoin() {
	return DofJoin;
}
public void setDofJoin(String dofJoin) {
	DofJoin = dofJoin;
}
public String getDofDischarge() {
	return DofDischarge;
}
public void setDofDischarge(String dofDischarge) {
	DofDischarge = dofDischarge;
}
public List<Observation> getO() {
	return o;
}
public void setO(List<Observation> o) {
	this.o = o;
}
public Person getP() {
	return p;
}
public void setP(Person p) {
	this.p = p;
}
public List<MetOrder> getM() {
	return m;
}
public void setM(List<MetOrder> m) {
	this.m = m;
}
@Override
public String toString() {
	return "Encounter [eid=" + eid + ", reason=" + reason + ", DofJoin=" + DofJoin + ", DofDischarge=" + DofDischarge
			+ ", o=" + o + ", p=" + p + ", m=" + m + "]";
}

}
