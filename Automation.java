package week5.day5;

public class Automation extends MultipleLangauage {

	public void Java() {
		System.out.println("JAVA IS A PROGRAMMING LANGUAGE");
		
	}

	public void Selenium() {
		System.out.println("SELENIUM IS NOT A TOOL IT IS A JAR FILE");
		
	}

	@Override
	public void ruby() {
		System.out.println("RUBY IS ALSO A PROGRAMMING LANGUAGE");
		
	}
	public static void main(String[] args) {
		Automation methods=new Automation();;
		methods.Java();
		methods.Selenium();
		methods.python();
		methods.ruby();
	}

}
