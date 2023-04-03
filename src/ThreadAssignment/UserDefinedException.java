package ThreadAssignment;

public class UserDefinedException extends RuntimeException{
	public String toString () {
		return "Invalid Data. Please enter correct values.";
	}
}
