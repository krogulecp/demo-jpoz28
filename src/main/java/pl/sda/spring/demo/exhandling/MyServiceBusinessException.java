package pl.sda.spring.demo.exhandling;

public class MyServiceBusinessException extends RuntimeException {
    public MyServiceBusinessException(String message) {
        super(message);
    }
}
