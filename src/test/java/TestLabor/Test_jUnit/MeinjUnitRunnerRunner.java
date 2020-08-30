package TestLabor.Test_jUnit;

import org.junit.Test;
import org.junit.runner.Description;
import org.junit.runner.Runner;
import org.junit.runner.notification.RunNotifier;

import java.lang.reflect.Method;

public class MeinjUnitRunnerRunner extends Runner {

    private Class testClass;
    public MeinjUnitRunnerRunner(Class testKlasse) {
        testClass = testKlasse;
    }

    @Override
    public Description getDescription() {
        return Description.createTestDescription(testClass, "in overwrite Description");
    }

    // @Override
    // public void run(RunNotifier notifier) {      }


    /****/
    @Override
    public void run(RunNotifier notifier) {
        System.out.println("running the tests from MyRunner. " + testClass);
        try {
            Object testObject = testClass.newInstance();
            for (Method method : testClass.getMethods()) {
                if (method.isAnnotationPresent(Test.class)) {
                    notifier.fireTestStarted(Description.EMPTY);
                    method.invoke(testObject);
                    notifier.fireTestFinished(Description.EMPTY);
                }
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    /**************/


}