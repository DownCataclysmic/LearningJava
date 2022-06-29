package com.qa.customertask;

public class Customers {
	private String firstName;
	private String surname;
	private String email;
	private int age;
	private static int numberOfPeople = 0;
	
	public Customers(String firstName, String surname, String email, int age) { 
		this.firstName = firstName;
		this.surname = surname;
		this.email = email;
		this.age = age;
		numberOfPeople++;
	}
	public static int getNumberOfPeople() {
        return numberOfPeople;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
	
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
	public class Main {
	    public static void main(String[] args) {
	        var firstCustomer = new Customers("Arnold","Rimmer", "arnold.rimmer@gmail.com",27); //Produce the first customer
	        var secondCustomer = new Customers("David","Lister", "david.lister@gmail.com",43);  //Produce the second customer
	        var thirdCustomer = new Customers("Claire", "Holt","claire.holt@gmail.com",107);    //Produce the third customer
	        
	        System.out.println("There are " + Customers.getNumberOfPeople() + " customers:");
	        System.out.println(firstCustomer.firstName + " " + firstCustomer.surname + ", " + firstCustomer.email + ", " + firstCustomer.age );
	        System.out.println(secondCustomer.firstName + " " + secondCustomer.surname+ ", " + secondCustomer.email + ", " + secondCustomer.age);
	        System.out.println(thirdCustomer.firstName + " " + thirdCustomer.surname+ ", " + thirdCustomer.email + ", " + thirdCustomer.age);
	    }
	}
}

