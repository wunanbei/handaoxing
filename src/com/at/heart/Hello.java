package com.at.heart;

public class Hello {
	public static void main(String[] args) {
		Student student = new Student();
		
		System.out.println(student);
		Class class1  = new Class();
		class1.point();
		
		
	}

}
class Class{
	private Student student=new Student();
	private int i;
	private Integer j;
	private String string ;
	public void point(){
		System.out.println(student);
		System.out.println(i);
		System.out.println(j);
		System.out.println(string);
	}
}



class Student{
	private String name;
	private String gender;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "student [name=" + name + ", gender=" + gender + "]";
	}
}