package maven.junit.demo;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ AddTest.class, ConcatTest.class, LaunchBrowserTest.class })
public class AllTests {

}
