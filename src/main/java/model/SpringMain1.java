package model;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringMain1 {

	public static void main(String[] args) {
	
		
		//cretes Spring container
				ApplicationContext applicationContext=new ClassPathXmlApplicationContext("student.xml");
				
				//Asking container to give student bean with id student01
		
				Student student1=(Student)applicationContext.getBean("student01");
				
				System.out.println(student1);
		
				
				Student student2=(Student)applicationContext.getBean("student02");
				System.out.println(student2);
		
	

	}

}
