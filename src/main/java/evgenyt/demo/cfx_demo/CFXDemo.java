package evgenyt.demo.cfx_demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

/**
 * CXF on SpringBoot demo
 */

@SpringBootApplication
@ImportResource({"classpath:spring/service.xml"}) // import endpoint definition from xml file
public class CFXDemo {
    public static void main(String[] args) {
        // Run spring boot app
        SpringApplication.run(CFXDemo.class, args);
    }
}
