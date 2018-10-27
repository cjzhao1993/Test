package helloworld;

import java.util.ArrayList;
import java.util.Random;

public class person {
	public static void main(String[] args) {
		ArrayList<callName> array = new ArrayList<callName>();
		addStudent(array);
		
		printStudent(array);
		
		randomStudent(array);
	}
	
	public static void printStudent(ArrayList<callName> array) {
		for(int i = 0; i<array.size(); i++) {
			callName s = array.get(i);
			System.out.println(s.getName()+"..."+s.getAge());
		}
	}
	
	
	public static void randomStudent(ArrayList<callName> array) {
		Random ran = new Random();
		int index = ran.nextInt(array.size());
		callName s = array.get(index);
		System.out.println(s.getName());
	}
	
	public static void addStudent(ArrayList<callName> array) {
		callName s1 = new callName();
		s1.setAge(15);
		s1.setName("aaa");
		
		callName s2 = new callName();
		s2.setAge(16);
		s2.setName("bbb");
		
		callName s3 = new callName();
		s3.setAge(17);
		s3.setName("ccc");
		
		callName s4 = new callName();
		s4.setAge(19);
		s4.setName("ddd");
		
		callName s5 = new callName();
		s5.setAge(18);
		s5.setName("eee");
		
		
		array.add(s1);
		array.add(s2);
		array.add(s3);
		array.add(s4);
		array.add(s5);
		
	}
}
