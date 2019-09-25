package com.sample.springboot.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Member {
	@Value("이상혁")
	private String name;
	@Value("Faker")
	private String nickName;
	@Autowired
	@Qualifier("foo")
	private Printer printer;
	
	public Member() {}
	
	public Member(String name, String nickName, Printer printer) {
		this.name = name;
		this.nickName = nickName;
		this.printer = printer;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	public Printer getPrinter() {
		return printer;
	}
	public void setPrinter(Printer printer) {
		this.printer = printer;
	}
	
	public void overridePrint() {
		printer.print("Hello, " + this.name + " : " + this.nickName);
	}
	
}
