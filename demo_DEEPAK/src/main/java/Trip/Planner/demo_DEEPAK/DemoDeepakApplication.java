package Trip.Planner.demo_DEEPAK;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoDeepakApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoDeepakApplication.class, args);
	}

	private Integer id;
	private String title;
	private Integer price;
	private String description;
	private String category;
	private String image;

}
