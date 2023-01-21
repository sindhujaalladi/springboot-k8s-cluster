package com.springbootk8scluster;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringbootK8sClusterApplication {
	
	@GetMapping("/runImage")
	public String printmessage() {
		return "successfully in kubernates cluster and running the pod container";
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringbootK8sClusterApplication.class, args);
	}

}
