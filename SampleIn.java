import java.io.FileInputStream;  

public class SampleIn {
	{
	try
    {    
      FileInputStream fin=new FileInputStream("D:\\testout.txt");    
      int i=fin.read();  
      System.out.print((char)i);    

      fin.close();    
    }catch(Exception e){System.out.println(e);}    
 }    

}
