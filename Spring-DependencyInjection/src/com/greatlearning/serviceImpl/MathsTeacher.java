package com.greatlearning.serviceImpl;

import com.greatlearning.service.ExamTip;
import com.greatlearning.service.Teacher;

public class MathsTeacher implements Teacher {

	// define a private field for the dependency
	ExamTip examTip;

	public MathsTeacher() {
		
	}
	
	//define a constructor for dependency injection
	MathsTeacher(ExamTip theExamTip){
		examTip = theExamTip; 
	}
	
	@Override
	public String getHomeWork() {
    return "Practice any ten maths problem";
	}

	@Override
	public String getExamTip() {
		return examTip.getExamTip();
	}
	    
}
