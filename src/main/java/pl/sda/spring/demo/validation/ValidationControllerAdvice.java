package pl.sda.spring.demo.validation;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.Map;

@RestControllerAdvice(assignableTypes = ValidationController.class)
public class ValidationControllerAdvice {

    @ExceptionHandler(MethodArgumentNotValidException.class)
    @ResponseStatus(HttpStatus.UNPROCESSABLE_ENTITY)
    public Map<String, String> handleArgumentNotValidException(MethodArgumentNotValidException exception){
        Map<String,String> response = new HashMap<>();
        response.put("message", exception.getMessage());
        response.put("parameterName", exception.getParameter().getParameterName());
        response.put("errorCount", String.valueOf(exception.getErrorCount()));

        return response;
    }
}
