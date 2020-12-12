package pl.sda.spring.demo.ex8;

import lombok.Value;

@Value
public class ErrorResponse {
    String message;
    String timestamp;
}
