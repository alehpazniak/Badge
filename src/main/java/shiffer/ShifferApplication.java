package shiffer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class ShifferApplication{

	public static void main(String[] args) {
		SpringApplication.run(ShifferApplication.class, args);
	}
}
