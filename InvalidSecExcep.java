public class InvalidSecExcep extends Exception
{
	private String message;

    public InvalidSecExcep()
	{
		message = "The value of seconds must be between 0 and 60.";
	}

	public InvalidSecExcep(String str)
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