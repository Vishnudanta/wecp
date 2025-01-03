package com.wecp.progressive;

// import org.springframework.boot.SpringApplication;
// import org.springframework.boot.autoconfigure.SpringBootApplication;

// @SpringBootApplication
// public class SupplyLinkApplication {
//     public static void main(String[] args) {
//         // System.out.println("Welcome to SupplyLink Project!");
//         System.out.println("Hello SupplyLink");
//         SpringApplication.run(SupplyLinkApplication.class, args);
//     }
// }



import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.function.RouterFunction;
import org.springframework.web.servlet.function.ServerResponse;

import static org.springframework.web.servlet.function.RouterFunctions.route;

@SpringBootApplication
public class SupplylinkApplication {

    public static void main(String[] args) {
        SpringApplication.run(SupplylinkApplication.class, args);
    }

    @Bean
    public RouterFunction<ServerResponse> helloRoute() {
        return route()
                .GET("/hello", request -> ServerResponse.status(HttpStatus.OK).body("Hello SupplyLink"))
                .build();
    }
}