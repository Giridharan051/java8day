package com.bct.java8methods;

import java.util.Arrays;

public class Example {

	public static void main(String[] args) {
		//Create a collection
		String[] stringarr= {
				"giri","dharan","mm","bgy"
		};
       /*
        * method reference to an instance method of an arbitary object of a particular tyoe
        */
		Arrays.sort(stringarr,String::compareToIgnoreCase);
		for(String data:stringarr) {
			System.out.println(data);
		}
		
	}

}
