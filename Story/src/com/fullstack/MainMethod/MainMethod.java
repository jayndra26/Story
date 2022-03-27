package com.fullstack.MainMethod;
import com.fullstack.story.*;

public class MainMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rupa rupa = new Rupa();
		rupa.fullName="RupaP";
		
	
			Student studentObj = new Student(rupa.fullName,123 );
			System.out.println(studentObj.getStudentName());
			
	}

}
