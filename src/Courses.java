
public class Courses {
	
	public Courses() {
		System.out.println("Kursa Katýlýyorsun :) " );
	}
	
	public Courses(int id,String name,double unitPrice,String detail,String teacher) {
		this();
		this.id = id;
		this.name = name;
		this.unitPrice = unitPrice;
		this.detail = detail;
		this.teacher = teacher ;
		
	}

	


int id ;
double unitPrice ;
String name;
String detail;
String teacher;

}