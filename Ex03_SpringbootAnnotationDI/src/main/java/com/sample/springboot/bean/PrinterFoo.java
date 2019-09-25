package com.sample.springboot.bean;

import org.springframework.stereotype.Component;

@Component("foo")
public class PrinterFoo implements Printer {

	@Override
	public void print(String message) {
		System.out.println("Printer Foo : " + message);
	}

}
