package javaOop;

import java.util.Objects;

public class SimpleModel {

	String firstName;
	String lastName;
	String id;
	int phoneNumber;
	
	SimpleModel(String fn, String ln, String id, int pn){
		this.firstName = fn;
		this.lastName = ln;
		this.id = id;
		this.phoneNumber = pn;
	}
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	@Override
	public boolean equals(Object o) {
		if (o == this) return true;
        if (!(o instanceof SimpleModel)) {
            return false;
        }
        SimpleModel user = (SimpleModel) o;
        return  id == user.id &&
                Objects.equals(firstName, user.firstName) &&
                Objects.equals(lastName, user.lastName);
	}
	
	@Override
    public int hashCode() {
        return Objects.hash(id, firstName, lastName);
    }
	
}


class Verify{
	
	public static void main(String[] args) {
		SimpleModel sm = new SimpleModel("Dhru", "Pat", "1", 459);
		SimpleModel sm2 = new SimpleModel("Dhru", "Pat", "1", 459);
		System.out.println(sm.equals(sm2));
		System.out.println(sm.hashCode());
		System.out.println(sm2.hashCode());
	}
}
