package example;

import org.junit.Test;

public class GreeterTest {
    Greeter greeter = new Greeter();

    @Test
    public void greet() {
        greeter.sayHello();
    }
}
