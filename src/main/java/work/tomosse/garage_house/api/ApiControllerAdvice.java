package work.tomosse.garage_house.api;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import work.tomosse.garage_house.exception.GarageHouseBadRequestException;
import work.tomosse.garage_house.exception.GarageHouseNotFoundException;
import work.tomosse.garage_house.util.MessageSourceUtils;

@RestControllerAdvice(basePackages = "work.tomosse.api")
public class ApiControllerAdvice extends ResponseEntityExceptionHandler {
    @Autowired
    MessageSourceUtils messageSource;

    @ExceptionHandler(GarageHouseBadRequestException.class)
    public ResponseEntity<Object> handler(final GarageHouseBadRequestException e) {
        final var body = new HashMap<String, Object>();
        final var errorCode = e.getErrorCode();
        final var args = e.getArgs();
        final var message = messageSource.getMessage(errorCode.getMessageProperty().getMessage(), args);
        final var code = errorCode.getMinorCode();
        body.put("message", message);
        body.put("code", code);
        return new ResponseEntity<Object>(body, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(GarageHouseNotFoundException.class)
    public ResponseEntity<Object> handler(final GarageHouseNotFoundException e) {
        final var body = new HashMap<String, Object>();
        final var errorCode = e.getErrorCode();
        final var args = e.getArgs();
        final var message = messageSource.getMessage(errorCode.getMessageProperty().getMessage(), args);
        final var code = errorCode.getMinorCode();
        body.put("message", message);
        body.put("code", code);
        return new ResponseEntity<Object>(body, HttpStatus.NOT_FOUND);
    }

}
