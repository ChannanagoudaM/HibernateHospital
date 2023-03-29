package exceptions;

public class Valid extends Exception
{
String message;

public Valid(String message) {
	super();
	this.message = message;
}

public String getMessage()
{
	return message;
}


}
