package work.tomosse.api;

import java.util.HashMap;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import work.tomosse.exception.GarageHouseBadRequestException;
import work.tomosse.exception.GarageHouseNotFoundException;

@RestControllerAdvice
public class ApiControllerAdvice extends ResponseEntityExceptionHandler {

    @ExceptionHandler(GarageHouseBadRequestException.class)
    public ResponseEntity<Object> handler(final GarageHouseBadRequestException e) {
        final var body = new HashMap<String, Object>();
        body.put("message",e.getErrorCode().getMessage());
        body.put("code", e.getErrorCode().getMinorCode());
        return new ResponseEntity<Object>(body, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(GarageHouseNotFoundException.class)
    public ResponseEntity<Object> handler(final GarageHouseNotFoundException e) {
        final var body = new HashMap<String, Object>();
        body.put("message",e.getErrorCode().getMessage());
        body.put("code", e.getErrorCode().getMinorCode());
        return new ResponseEntity<Object>(body, HttpStatus.NOT_FOUND);
    }

}
