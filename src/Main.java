
public class Main {
	//FTL = For The Layout
	public static void main(String[] args) {
		String lineup = "#-----COURSES------#";
		Courses course1 = new Courses(1,"Yaz�l�m Geli�tirici Yeti�tirme Kamp� C#",0,"Dont repeat ur self :)","Engin Demiro�");
		Courses course2 = new Courses(2,"Yaz�l�m Geli�tirici Yeti�tirme Kamp� JAVA",0,"SOL�D :)","Engin Demiro�");
		Courses course3 = new Courses(3,"Programlamaya giri� i�in temel kurs",0,"Dont give up :)","Engin Demiro�");
		
		Categories categories1 = new Categories("T�m�");
		Categories categories2 = new Categories("Programlama");
	
		String lineup2 = "/-----CATEGORIES------/";//FTL
		System.out.println(lineup2);//FTL
		
	Categories[] categories = {categories1,categories2};
		for(Categories categori : categories) {
			
			System.out.println(categori.name);
			
		}
			System.out.println(lineup2);//FTL

			
		System.out.println(lineup); //FTL
	Courses[] courses = {course1,course2,course3};
		
		for (Courses course : courses) {
			System.out.println(course.name);
		}
		
		System.out.println(lineup);//FTL
		System.out.println("Kurs Adedi :"+courses.length);
	}
}
