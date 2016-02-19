package example;

public class Greeter {
    public void sayHello(String name) {
        System.out.println("Hello, "+name+"!");
    }

    public void sayHello() {
        sayHello("world");
    }
}
