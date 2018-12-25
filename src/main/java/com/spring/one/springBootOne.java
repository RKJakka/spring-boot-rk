package com.spring.one;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class springBootOne 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello Spring Boot One!" );
        SpringApplication.run(springBootOne.class, args);
    }
}
