package ex03;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
// import org.springframework.context.annotation.ComponentScan;

import ex03.component.MyComponent;


@SpringBootTest
// @ComponentScan 이게 MyApplication쪽으로 옮겨감
public class MyApplicationTest {
	@Autowired
	private MyComponent myComponent;
	
	@Test
	public void myComponetNotNull() {
		assertNotNull(myComponent);
	}
}
