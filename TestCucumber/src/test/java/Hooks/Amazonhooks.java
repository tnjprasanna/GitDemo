package Hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Amazonhooks {
	
	@Before
	public void setup() {
		System.out.println("launch amazon application");
		
	}
	
	@After
	public void tearDown() {
		System.out.println("close browser");
	}
	

}
