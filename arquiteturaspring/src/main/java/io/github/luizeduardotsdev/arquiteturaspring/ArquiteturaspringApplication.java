package io.github.luizeduardotsdev.arquiteturaspring;

import org.springframework.boot.Banner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

@SpringBootApplication
public class ArquiteturaspringApplication {

	public static void main(String[] args) {
		// SpringApplication.run(ArquiteturaspringApplication.class, args);
        SpringApplicationBuilder builder = new SpringApplicationBuilder(ArquiteturaspringApplication.class);
        builder.bannerMode(Banner.Mode.OFF);
        builder.profiles("producao");
        builder.run(args);

        ConfigurableApplicationContext context = builder.context();

        ConfigurableEnvironment environment = context.getEnvironment();
        String appName = environment.getProperty("spring.application.name");
        System.out.println("Application Name: " + appName);
	}

}
