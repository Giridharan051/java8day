package com.bct.java8methods;
interface Constructorinterface{
	Hello display(String say);
}
class Hello{
	Hello(String say) {
		System.out.println("Good morning guys  "+say);
	}
}
public class Constructormethodreference {
	public static void main(String[] args) {
		Constructorinterface ref=Hello::new;
	 ref.display("how are you");
	}
}
