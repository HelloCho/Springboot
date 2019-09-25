package com.sample.springboot.bean;

public class PrinterBar implements Printer {

	@Override
	public void print(String massage) {
		System.out.println("Printer Bar : " + massage);
	}

}
