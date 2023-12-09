package rest_example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import rest_example.model.Client;

@SpringBootApplication
public class RestExampleApplicaation {
    public static void main( String[] args ) {

       // System.out.println( "Hello Spring Boot!" );
        SpringApplication.run(RestExampleApplicaation.class, args);
    }
}
