package com.sample.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.sample.springboot.bean.Config;
import com.sample.springboot.bean.Member;
import com.sample.springboot.bean.Printer;

// @SpringBootApplication
public class Ex02SpringbootDiApplication {

	public static void main(String[] args) {
		// SpringApplication.run(Ex02SpringbootDiApplication.class, args);
		// 1. IoC 컨테이너 직접 생성
		ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		
		// 2. Member Bean 가져오기
		Member member1 = (Member) context.getBean("member1");
		member1.overridePrint();
		
		// 3. Member Bean 가져오기
		Member member2 = context.getBean("hello", Member.class);
		member2.overridePrint();
		
		// 4. PrintFoo 가져오기
		Printer bar = context.getBean("printBar", Printer.class);
		member1.setPrinter(bar);
		member1.overridePrint();
		
		// 같은 Singleton 확인
		if(member1 == member2) {
			System.out.println("같은 객체");
		} else {
			System.out.println("다른 객체");
		}
	}

}
