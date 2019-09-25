package com.sample.springboot.bean;

import org.springframework.stereotype.Component;

@Component("bar")
public class PrinterBar implements Printer {

	@Override
	public void print(String massage) {
		System.out.println("Printer Bar : " + massage);
	}

}
