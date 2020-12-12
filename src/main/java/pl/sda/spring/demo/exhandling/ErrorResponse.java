package pl.sda.spring.demo.exhandling;

import lombok.Value;

@Value
public class ErrorResponse {
    String timestamp;
    String message;
}
