package com.kitri.hello2;

public class HelloMain {
	public static void main(String[] args) {
//		HelloServiceKor helloServiceKor = new HelloServiceKor();
//		String msg = helloServiceKor.helloKor("박소현");
		
		HelloServiceEng helloServiceEng = new HelloServiceEng();
		String msg = helloServiceEng.hello("박소현");
		System.out.println(msg);
	}
}
