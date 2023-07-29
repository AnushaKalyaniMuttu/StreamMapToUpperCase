package com.biconsumer;

import java.util.List;
import java.util.stream.Collectors;

public class StreamMapToUpperCase {

	public static List<String> namesList(){
		return StudentDatabase.getAllStudents().stream().map(Student::getName).map(String::toUpperCase).collect(Collectors.toList());
	}
	public static void main(String[] args) {
		System.out.println(namesList());
	}
}
