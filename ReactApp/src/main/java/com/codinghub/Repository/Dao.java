package com.codinghub.Repository;

import org.springframework.stereotype.Repository;

@Repository
public class Dao {
	
	public int add(int num1, int num2) {
		// TODO Auto-generated method stub
		return num1+num2;
	}

	public String m1() {
		// TODO Auto-generated method stub
		return "HELLO ALL";
	}
}
