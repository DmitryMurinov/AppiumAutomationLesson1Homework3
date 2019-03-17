import org.junit.Test;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;

public class MainClassTest {

    @Test
    public void testGetClassString() {
        MainClass mainClass = new MainClass(); //not sure should I make it field of the class, so incapsulated it here.
        assertThat("String doesn't match expected value: ", mainClass.getClassString(),
                                    anyOf(containsString("hello"), containsString("Hello")));
    }

}
