package com.blz.addressbook.model;

import java.io.Serializable;
import java.util.Comparator;

public class Person implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String firstName, lastName, Address, city, state;
	private int zip;
	private long phone;

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

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getZip() {
		return zip;
	}

	public void setZip(int zip) {
		this.zip = zip;
	}

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

	public static Comparator<Person> sortEntriesName = new Comparator<Person>() {

		public int compare(Person s1, Person s2) {
			String FirstName1 = s1.getFirstName().toUpperCase();
			String FirstName2 = s2.getFirstName().toUpperCase();

			// ascending order
			return FirstName1.compareTo(FirstName2);

			// descending order
			// return StudentName2.compareTo(StudentName1);
		}
	};

	public static Comparator<Person> sortEntriesZip = new Comparator<Person>() {
		public int compare(Person s1, Person s2) {
			int Zip1 = s1.getZip();
			int Zip2 = s2.getZip();

			// ascending order
			return Zip1 - Zip2;

			// descending order
			// return StudentName2.compareTo(StudentName1);
		}
	};

	public String toString() {
		return firstName + " " + lastName + " " + Address + " " + city + " " + state + " " + zip + " " + phone;
	}

}
