import java.io.*;
import java.util.*;

public class SampleThree
{
	static Scanner console = new Scanner(System.in);

    public static void main(String[] args)
    {
        int hours;
        int minutes;
        int seconds;

        String str;

        hours = getHours();
        minutes = getMinutes();
        seconds = getSeconds();

        System.out.print("Enter AM or PM: ");
        str = console.next();
        System.out.println();

        System.out.print("24 hour clock time: ");
        print24HourTime(hours, minutes, seconds, str);
    }

    public static int getHours()
    {
        boolean done = false;
        int hr = 0;

        do
	    {
	        try
	        {
	            System.out.print("Enter hours: ");
	            hr = console.nextInt();
	            System.out.println();

	            if (hr < 0 || hr > 12)
	                throw new InvalidHrExcep();

	            done = true;
	        }
	        catch (InvalidHrExcep hrObj)
	        {
	            System.out.println(hrObj);
	        }

	    }
	    while (!done);

	    return hr;
	}

	public static int getMinutes()
	{
	    boolean done = false;
	    int min = 0;

	    do
	    {
	        try
	        {
	            System.out.print("Enter minutes: ");
	            min = console.nextInt();
	            System.out.println();

	            if (min < 0 || min > 59)
	                throw new InvalidMinExcep();

	            done = true;
	        }
	        catch (InvalidMinExcep minObj)
	        {
	            System.out.println(minObj);
	        }

	    }
	    while (!done);

	    return min;
	}

	public static int getSeconds()
	{
	    boolean done = false;
	    int sec = 0;

	    do
	    {
	        try
	        {
	            System.out.print("Enter seconds: ");
	            sec = console.nextInt();
	            System.out.println();

	            if (sec < 0 || sec > 59)
	                throw new InvalidSecExcep();

	            done = true;
	        }
	        catch (InvalidSecExcep secObj)
	        {
	            System.out.println(secObj);
	        }

	    }
	    while (!done);

	    return sec;
	}

	public static void print24HourTime(int hr, int min, int sec, String str)
	{
	    if (str.equals("AM"))
	    {
	        if (hr == 12)
	            System.out.print(0);
	        else
	            System.out.print(hr);

	        System.out.println(":" + min + ":" + sec);
	    }
	    else if (str.equals("PM"))
	    {
	        if (hr == 12)
	            System.out.print(hr);
	        else
	            System.out.print(hr + 12);

	        System.out.println(":" + min + ":" + sec);
	    }
    }
}
