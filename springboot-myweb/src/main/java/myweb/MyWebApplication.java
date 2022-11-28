package myweb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
public class MyWebApplication {
	
	@Controller
	public class HelloController {
		@RequestMapping("/hello")
		public String hello() {
			return "hello";
		}
	}
	
	public static void main(String[] args) {
		// Web Application에서는 try~catch로 해버리면 마지막에 ac.close()가 작동되어 쓰면 안된다.
		// try(ConfigurableApplicationContext ac =  SpringApplication.run(MyWebApplication.class, args)){}
		
		SpringApplication.run(MyWebApplication.class, args);
	}
}
