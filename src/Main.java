
public class Main {
	//FTL = For The Layout
	public static void main(String[] args) {
		String lineup = "#-----COURSES------#";
		Courses course1 = new Courses(1,"Yazilim Gelistirici Yetistirme Kampi C#",0,"Dont repeat ur self :)","Engin Demirog");
		Courses course2 = new Courses(2,"Yazilim Gelistirici Yetistirme Kampi JAVA",0,"SOLÝD :)","Engin Demirog");
		Courses course3 = new Courses(3,"Programlamaya giris için temel kurs",0,"Dont give up :)","Engin Demirog");
		
		Categories categories1 = new Categories("Tümü");
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
