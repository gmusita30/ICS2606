public class InvalidAMPMExcep extends Exception 
{
	private String message;

    public InvalidAMPMExcep()
	{
		message = "Input AM or PM only ";
	}

	public InvalidAMPMExcep(String str)
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

