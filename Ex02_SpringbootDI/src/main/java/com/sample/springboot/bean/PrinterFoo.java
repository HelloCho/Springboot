package com.sample.springboot.bean;

public class PrinterFoo implements Printer {

	@Override
	public void print(String message) {
		System.out.println("Printer Foo : " + message);
	}

}
