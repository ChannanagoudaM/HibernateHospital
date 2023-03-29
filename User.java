package dto;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {
private String name;
@Id
private int uid;
private String email;
private long Mno;
private long password;
private String role;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getUid() {
	return uid;
}
public void setUid(int uid) {
	this.uid = uid;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public long getMno() {
	return Mno;
}
public void setMno(long mno) {
	Mno = mno;
}
public long getPassword() {
	return password;
}
public void setPassword(long password) {
	this.password = password;
}
public String getRole() {
	return role;
}
public void setRole(String role) {
	this.role = role;
}
@Override
public String toString() {
	return "User [name=" + name + ", uid=" + uid + ", email=" + email + ", Mno=" + Mno + ", password=" + password
			+ ", role=" + role + "]";
}

}
