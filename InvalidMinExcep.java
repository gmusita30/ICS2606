public class InvalidMinExcep extends Exception
{
	private String message;

    public InvalidMinExcep()
	{
		message = "The value of minutes must be between 0 and 60.";
	}

	public InvalidMinExcep(String str)
	{
		message = str;
	}

	public String getmessage()
	{
		return message;
	}

	public String toString()
	{
		return message;
	}
}