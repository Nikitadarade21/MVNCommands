package pac1;

import org.testng.annotations.Test;

public class ContactTest {
	@Test
	public void createContact() {
		String URL=System.getProperty("url");
		String browser=System.getProperty("browser");
		String username=System.getProperty("username");
		String password=System.getProperty("password");
		System.out.println("Executing Create Contact test");
		System.out.println(URL);
	}
	@Test
public void modifyContact() {
		
		System.out.println("Executing modifyContactt test");
	}
}
