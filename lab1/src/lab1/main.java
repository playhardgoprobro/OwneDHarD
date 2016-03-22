package lab1;
import java.io.*;
import java.util.*;

public class main {

	public static void main(String[] args) 
	{
		int firstString=Integer.valueOf(args[1]);
		int countStrings=Integer.valueOf(args[2]);;
		try(Scanner in = new Scanner(new File(args[0])))
		{
			int i=0;
			while(in.hasNext() && i<firstString)
			{
				in.nextLine();
				i++;
			}
			while(in.hasNext() && i>=firstString && i<firstString+countStrings)
			{
				System.out.println(in.nextLine());
				i++;
			}
			
		}
		catch (IOException ex)
		{
			System.out.println(ex.getMessage());
		}
		
		

	}

}
