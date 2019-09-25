package com.sample.springboot.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
	@Bean
	public Member member1() {
		Member member1 = new Member();
		member1.setName("홍길동");
		member1.setNickName("도사");
		member1.setPrinter(new PrinterFoo());
		return member1;
	}
	
	@Bean(name="hello")
	public Member member2() {
		return new Member("전우치", "도사", new PrinterFoo());
	}
	
	@Bean
	public PrinterFoo printFoo() {
		return new PrinterFoo();
	}
	
	@Bean
	public PrinterBar printBar() {
		return new PrinterBar();
	}
}
