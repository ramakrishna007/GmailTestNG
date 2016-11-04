package testcases;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class testclass {
	@Test
	public static void mains() throws IOException {
		WebDriver driver = null;
//		ChromeOptions options = new ChromeOptions();
		System.setProperty("webdriver.chrome.driver", "../Gmail/Lib/Drivers/chromedriver.exe");
//
//		DesiredCapabilities cap= DesiredCapabilities.chrome();
//
//		cap.setCapability(ChromeOptions.CAPABILITY,options);
			
//		DesiredCapabilities cap = DesiredCapabilities.firefox();
////		cap.setBrowserName("Firefox");
////		cap.setPlatform(Platform.WINDOWS);
////		cap.setCapability("marionette", true);
////		
//		driver = new ChromeDriver();
////		
////		
////		driver.get("http://www.google.com");
//		
//		File file = new File(System.getProperty("user.dir").replace("\\", "/")+"/../");
//		System.out.println(file.getName());
//		
//		System.err.println(System.getProperty("user.dir"));
//		System.out.println(System.getProperty("user.dir").replace("\\", "/")+"/Lib/Drivers");
//		System.err.println(file.getAbsolutePath());
//		String project_location = System.getProperty("user.dir");
//		File doc = new File(project_location+"/../gecko.exe");
//		
//		System.out.println(doc.getAbsolutePath());
//		System.out.println(doc.getCanonicalPath());
		
//		System.out.println(Calendar.getInstance().);
		
		
		SimpleDateFormat df = new SimpleDateFormat("dd-MM-yy");
		Date date = new Date();
		System.out.println(df.format(date));
	}
}
