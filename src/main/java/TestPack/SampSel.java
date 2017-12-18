package TestPack;

import org.openqa.selenium.chrome.ChromeDriver;

public class SampSel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello World!");
		System.setProperty("webdriver.chrome.driver", "C:\\testingselenium\\chromedriver.exe");
 		ChromeDriver cd = new ChromeDriver();
		cd.get("http://rediff.com");
		System.out.println(cd.getTitle());
		

	}

}
