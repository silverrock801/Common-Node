package com.revature;

import java.util.LinkedList;

public class Driver {

	public static void main(String[] args) {
		
		
		
	}
	
	private static int common(LinkedList<Integer> one, LinkedList<Integer> two) {
		
		int lone = one.size();
		int ltwo = two.size();
		int c;
		if (lone < ltwo) {
			c = lone;
		}
		else {
			c = ltwo;
		}
		
		for(int i = 0; i < c; i++) {
			
			if (one.get(i) == two.get(i)) {
				
				int ans = one.get(i);
				return ans;
			}
			
		}
		
		return -1;
	}

}
