import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class HelloWorldTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void test() {
		//fail("Not yet implemented");
		System.out.println("This is the testcase for HelloWorld");
        String str1="This is the testcase for HelloWorld";
        String str2="This is the testcase for HelloWorld";
        assertEquals(str1, str2);

	}

}
