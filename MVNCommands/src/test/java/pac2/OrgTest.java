package pac2;

import org.testng.annotations.Test;

public class OrgTest {

	@Test
	public void createOrg() {
		String URL=System.getProperty("url");
		String browser=System.getProperty("browser");
		String username=System.getProperty("username");
		String password=System.getProperty("password");
		System.out.println("Executing createOrg test");
		System.out.println(URL);
		System.out.println(browser);
		System.out.println(username);
		System.out.println(password);

		System.out.println("hie");
	}
	@Test
	public void modifyOrg() {

		System.out.println("Executing modifyOrg test");
	}
}
