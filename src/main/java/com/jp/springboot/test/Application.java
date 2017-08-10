package com.jp.springboot.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**     
 *
 * @author jiangpan 
 * @title Application.java
 * @date 2017年8月8日 
 *     
 */
@RestController
@SpringBootApplication
public class Application {

	@RequestMapping("/")
	public String toIndex(){
		return "HELLO WORLD";
	}
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
