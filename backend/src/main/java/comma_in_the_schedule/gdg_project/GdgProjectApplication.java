package comma_in_the_schedule.gdg_project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
public class GdgProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(GdgProjectApplication.class, args);
	}

}
