package class_methods;

public class ClassException extends Exception{
	public ClassException() {
		super("Error!!");
	}
	
	public ClassException(String ss) {
		super(ss);
	}
}
