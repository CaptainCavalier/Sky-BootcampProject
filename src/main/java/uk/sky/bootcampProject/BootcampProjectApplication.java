package uk.sky.bootcampProject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import uk.sky.bootcampProject.entities.User;
import uk.sky.bootcampProject.repository.ProjectRepo;

@SpringBootApplication
public class BootcampProjectApplication {

	private static final Logger logger = LoggerFactory.getLogger(BootcampProjectApplication.class);

	@Autowired
	private ProjectRepo project_repo;

	public static void main(String[] args) {
		SpringApplication.run(BootcampProjectApplication.class, args);
	}

	@Bean
	CommandLineRunner runner(){
		return args -> {
			// Save demo data to database

			project_repo.save(new User("TestA","admin",
					"$2a$10$LmptYa4uWhkO/OO.lpmahO14w0WKBzyKQOAXeSrYal04KKt.OTcRu",
					"ADMIN"));

			project_repo.save(new User("TestB","user",
					"$2a$10$6CJhx.freP/GXr56EItYJeVc2r9P3o/ns/adeKBAuf8d65Y8qz2qi",
					"USER"));
		};
	}
}
