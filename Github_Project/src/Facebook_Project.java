import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook_Project {

	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.getTitle();
		System.out.println("Facebook page is open");

	}

}
