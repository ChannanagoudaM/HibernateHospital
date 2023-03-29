package dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
@Entity
public class Observation {
private String dname;
@Id
private int oid;
private String yoObservation;
@ManyToOne
private Encounter e;
public String getDname() {
	return dname;
}
public void setDname(String dname) {
	this.dname = dname;
}
public int getOid() {
	return oid;
}
public void setOid(int oid) {
	this.oid = oid;
}
public String getYoObservation() {
	return yoObservation;
}
public void setYoObservation(String yoObservation) {
	this.yoObservation = yoObservation;
}
public Encounter getE() {
	return e;
}
public void setE(Encounter e) {
	this.e = e;
}
@Override
public String toString() {
	return "Observation [dname=" + dname + ", oid=" + oid + ", yoObservation=" + yoObservation + ", e=" + e + "]";
}

}
