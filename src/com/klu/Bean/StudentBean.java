package com.klu.Bean;

public class StudentBean {
	private static int regno;
	private static String name;
	public static int getRegno() {
		return regno;
	}
	public void setRegno(int regno) {
		StudentBean.regno=regno;
	}
	public static String getName() {
		return name;
	}
	public void setName(String name) {
		StudentBean.name=name;
	}

}
