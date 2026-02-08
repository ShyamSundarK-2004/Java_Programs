package april.ExceptionHandling;

public class InvalidAgeException extends RuntimeException {

	InvalidAgeException(String str) {
		super(str);
	}

}
