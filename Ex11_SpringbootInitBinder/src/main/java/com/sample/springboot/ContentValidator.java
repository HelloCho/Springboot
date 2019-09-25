package com.sample.springboot;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

public class ContentValidator implements Validator{

	@Override
	public boolean supports(Class<?> clazz) {
		return ContentDto.class.isAssignableFrom(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		ContentDto dto = (ContentDto) target;
		
//		String sWriter = dto.getWriter();
//		if(sWriter == null || sWriter.trim().isEmpty()) {
//			System.out.println("Writer is null or empty");
//			errors.rejectValue("writer", "troble");
//		}
		ValidationUtils.rejectIfEmpty(errors, "writer", "writer is empty.");
		int sWriter = dto.getWriter().length();
		if(sWriter < 3) errors.rejectValue("writer", "writer is too short.");
		
//		String sContent = dto.getContent();
//		if(sContent == null || sContent.trim().isEmpty()) {
//			System.out.println("Content is null or empty");
//			errors.rejectValue("content", "troble");
//		}
		ValidationUtils.rejectIfEmpty(errors, "content", "content is empty.");
	}

	
}
