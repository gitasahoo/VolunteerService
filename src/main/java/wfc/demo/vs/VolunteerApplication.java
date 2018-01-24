package wfc.demo.vs;



import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.solr.SolrAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import wfc.demo.vs.domain.Volunteer;

@Configuration
//@PropertySource(value = "classpath:application.properties")
@EnableAutoConfiguration
@EntityScan(basePackages = {"com.vs.domain"})
@ComponentScan
@EnableDiscoveryClient

@SpringBootApplication
public class VolunteerApplication {

	
	public static void main(String[] args) {
		SpringApplication.run(VolunteerApplication.class, args);
	}
	
}
