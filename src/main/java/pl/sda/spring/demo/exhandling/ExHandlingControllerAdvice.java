package pl.sda.spring.demo.exhandling;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.time.Instant;

@RestControllerAdvice(assignableTypes = ExHandlingController.class)
public class ExHandlingControllerAdvice {

    @ExceptionHandler(RuntimeException.class)
    @ResponseStatus(HttpStatus.NOT_IMPLEMENTED)
    public ErrorResponse handleRuntimeException(RuntimeException exception){
        return new ErrorResponse(Instant.now().toString(), exception.getMessage());
    }

    @ExceptionHandler(MyServiceBusinessException.class)
    @ResponseStatus(HttpStatus.NOT_IMPLEMENTED)
    public ErrorResponse handleMyServiceBusinessException(MyServiceBusinessException exception){
        return new ErrorResponse(Instant.now().toString(), exception.getMessage() + "business");
    }

    @ExceptionHandler(Exception.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public ErrorResponse handleException(Exception exception){
        return new ErrorResponse(Instant.now().toString(), exception.getMessage());
    }
}
