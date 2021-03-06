package be.ordina.threesixty.person;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.IntegrationTest;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import be.ordina.threesixty.person.config.MongoTestConfiguration;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = {PersonServiceApplication.class, MongoTestConfiguration.class})
@WebAppConfiguration
@IntegrationTest("server.port=0")
@DirtiesContext
@ActiveProfiles("test")
public class ApplicationTests {

	@Test
	public void contextLoads() {
	}

}
