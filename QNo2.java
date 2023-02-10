package com.aditi.lab2;

public class QNo2 {
	public static void main(String[] args) {
		String[] str1 = {"Hi ",null};
		String[] str2 = {"My ","name ","is "};
		String[] str3 = {"Aditi"};
		String[] str4 = {"BTech CSE ","student."};
		
		concat(str1);
		concat(str2);
		concat(str3);
		concat(str4);
	}
	
	static void concat(String[] str) {
		String val = " " ;
		for(int i=0;i<str.length;i++) {
			if(str[i]!=null)
				val=val.concat(str[i]);
		}
		System.out.print(val);
	}

}

