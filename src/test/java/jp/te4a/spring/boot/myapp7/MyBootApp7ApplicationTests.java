package java.jp.te4a.spring.boot.myapp7;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MyBootApp7ApplicationTests {

	@Test
	void contextLoads() {
		HelloController helloController = new HelloController();
		String expect  ="books/list"";
		String actual = helloController.index();
		assertEquals(expect, actual);
	}

}
