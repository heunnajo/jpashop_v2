package jpabook_v2.jpashop_v2;

import com.fasterxml.jackson.datatype.hibernate5.Hibernate5Module;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class JpashopV2Application {

	public static void main(String[] args) {
		SpringApplication.run(JpashopV2Application.class, args);
	}
	@Bean
	Hibernate5Module hibernate5Module() {
		return new Hibernate5Module();
	}

}
