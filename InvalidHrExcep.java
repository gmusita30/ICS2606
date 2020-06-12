public class InvalidHrExcep extends Exception
{
	private String message;

    public InvalidHrExcep()
	{
		message = "The value of hours must be between 0 and 12.";
	}

	public InvalidHrExcep(String str)
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