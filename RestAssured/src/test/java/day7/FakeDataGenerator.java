package day7;

import org.testng.annotations.Test;

import com.github.javafaker.Faker;

public class FakeDataGenerator {
	
	@Test
	void testGenerateDummyData(){
		
		Faker faker = new Faker();
		
		String fullName = faker.name().fullName();
		String firstName = faker.name().firstName();
		String lastName = faker.name().lastName();
		String username = faker.name().username();
		String password = faker.internet().password();
		String cellPhone = faker.phoneNumber().cellPhone();
		String safeEmailAddress =faker.internet().safeEmailAddress();
		
	}

}
