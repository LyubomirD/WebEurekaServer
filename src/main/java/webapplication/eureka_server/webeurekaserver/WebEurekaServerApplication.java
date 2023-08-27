package webapplication.eureka_server.webeurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class WebEurekaServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(WebEurekaServerApplication.class, args);
    }

}
