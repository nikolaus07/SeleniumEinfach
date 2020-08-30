package TestLabor.Test_jUnit;

import org.junit.*;

@RunWith(MeinjUnitRunnerRunner.class)
public class MeinTestB {
    @Test
    public void test1() { System.out.println("TestB - dies ist @Test 1");   }

    @Test
    public void test2() {
        System.out.println("TestB - dies ist @Test 2");
    }
}
