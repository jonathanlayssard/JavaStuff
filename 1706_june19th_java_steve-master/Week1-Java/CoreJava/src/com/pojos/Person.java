package com.pojos;

import com.ex.exceptionhandling.WithdrawTooBigException;

/*
 * Useful class
 */
public abstract class Person {
	private String name;
	private int age;
	
	
//	public Person(String name, int age) {
//		super();
//		this.name = name;
//		this.age = age;
//	}

	abstract void people();
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) throws WithdrawTooBigException {
		this.age = age;
		/*
		 * if something
		 * 	then throw WithdrawTooBigException
		 * 
		 */
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
//	
//	public static void main(String[] args) {
//		new Person();
//		
//		int[] x = {1,2,3};
//		String[] y = {"h","e","l"};
//		String[] z = new String[5];
//		System.out.println(x.length);
//	}
}
