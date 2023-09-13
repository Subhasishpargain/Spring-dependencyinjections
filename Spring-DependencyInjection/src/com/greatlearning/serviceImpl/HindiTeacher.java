package com.greatlearning.serviceImpl;

import com.greatlearning.service.ExamTip;
import com.greatlearning.service.Teacher;

public class HindiTeacher implements Teacher {

	//defining a private field for dependency
	ExamTip examTip;
	
	public HindiTeacher() {
		
	}
	
	// define a constructor for dependency injection
	public HindiTeacher(ExamTip theExamTip) {
		examTip = theExamTip;
	}
	
	@Override
	public String getHomeWork() {
	return "Do one page of hindi writing";
	}

	@Override
	public String getExamTip() {
		return examTip.getExamTip();
	}
	
}
