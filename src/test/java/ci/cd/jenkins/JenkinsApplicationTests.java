package ci.cd.jenkins;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class JenkinsApplicationTests {

	@Test
	@DisplayName("테스트1")
	public void test1() {
		System.out.println("test");
	}

}
