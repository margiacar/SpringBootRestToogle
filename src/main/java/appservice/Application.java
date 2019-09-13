package appservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;

@SpringBootApplication
public class Application {

	@Bean
	@Primary
	@ConditionalOnProperty(prefix = "feature.toggle", name = "holidaySeason", havingValue="false")
	public GreetingHandler getStandardGreetingHandler() {
		return new StandardGreetingHandler();
	}
	
	@Bean
	@Primary
	@ConditionalOnProperty(prefix = "feature.toggle", name = "holidaySeason", havingValue="true")
	public GreetingHandler getGreetingHandler() {
		return new HolidayGreetingHandler();
	}
	
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}