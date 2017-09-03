import java.io.Serializable;


public class StudentBeans implements Serializable{
	private static final long serialVersionUID = -8798834666486704574L;
String name;
String email;
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
}
