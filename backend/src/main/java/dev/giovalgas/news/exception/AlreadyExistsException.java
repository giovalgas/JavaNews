package dev.giovalgas.news.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.BAD_REQUEST)
public class AlreadyExistsException extends RuntimeException {
  public AlreadyExistsException() {
    super();
  }
  public AlreadyExistsException(String message, Throwable cause) {
    super(message, cause);
  }
  public AlreadyExistsException(String message) {
    super(message);
  }
  public AlreadyExistsException(Throwable cause) {
    super(cause);
  }

}