package stringInterviewQuestion;

public class StringMutable {

	public static void main(String[] args) {
		String a = "hello"; // This is immutable
		String b = "hello"; // This is immutable
		//both above two variable only taking one memory 
		a.concat("world");
		System.out.println(a);//So we can see that we tried to concat
		//a with world but as a object is created with String class so
		// it can not be changed or edited so that's why no changes happened
		// with a
		String c = a.concat("world");
		System.out.println(c); 
		
		
		

	}

}
