package uk.sky.bootcampProject.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND, reason = "User not found with that ID")
public class UserNotFoundException extends RuntimeException {
}
