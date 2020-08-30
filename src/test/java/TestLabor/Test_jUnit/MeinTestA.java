package TestLabor.Test_jUnit;

import org.junit.*;

@RunWith(MeinjUnitRunnerRunner.class)
public class MeinTestA {

    @Test
    public void test1() { System.out.println("TestA - dies ist @Test 1");   }

    @Test
    public void test2() {
        System.out.println("TestA - dies ist @Test 2");
    }

    @BeforeClass
    public static void beforeClass() { System.out.println("TestA - in @BeforeClass method");   }

    @AfterClass
    public static void afterClass() {
        System.out.println("TestA - in @AfterClass method");
    }

    @Before
    public void before() {
        System.out.println("TestA - in @Before methode");
    }

    @After
    public void after() {
        System.out.println("TestA - in @After methode");
    }

}
