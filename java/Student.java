package com.huey.entity;
import java.text.DateFormat;
import java.util.Date;

/**
*	编写Student实体
*	
*/
public class Student{
	private int number;
	private String name;
	private Date birthday;
	public int getNumber(){
		return number;
	}
	public void setNumber(int number){
		this.number = number;
	}
	public String getName(){
		return name;
	}
	public void setName(String name){
		this name = name;
	}
	public Date getBirthday(){
		return birthday;
	}
	public void setBirthday(Date birthday){
		this.birthday = birthday;
	}		
	public Student(){
	}
	public Student(int number,String name,Date birthday){
		setNumber(number);
		setName(name);
		setBirthday(birthday);
	}
	
}