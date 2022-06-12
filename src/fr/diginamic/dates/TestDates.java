package fr.diginamic.dates;

import java.util.Date;

public class TestDates {
	public Date date;
	
	// le constructeur
	public TestDates(Date date) {
		super();
		this.date = date;
	}
	
public static void main(String[] args) {
		
		TestDates date= new TestDates(new Date());
		System.out.println(date.date);

	}
	




	

}
