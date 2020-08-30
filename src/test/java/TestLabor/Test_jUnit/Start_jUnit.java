package TestLabor.Test_jUnit;

import org.junit.runner.Runner;
import java.lang.annotation.*;

@Target(ElementType.TYPE)
@Inherited
@interface RunWith {
    Class<? extends Runner> value();
}

public class Start_jUnit {
}
