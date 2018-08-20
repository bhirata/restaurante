package br.com.restaurante.app.conf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@EnableWebMvc
@EnableAutoConfiguration
@Configuration
@ComponentScan(basePackages = {"br.com.restaurante.app"})
@SpringBootApplication
@EnableJpaRepositories(basePackages = {"br.com.restaurante.app"})
public class AppWebConfiguration extends SpringBootServletInitializer{

	@Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(AppWebConfiguration.class);
    }


	public static void main(String[] args) {
		SpringApplication.run(AppWebConfiguration.class, args);
	}
}
