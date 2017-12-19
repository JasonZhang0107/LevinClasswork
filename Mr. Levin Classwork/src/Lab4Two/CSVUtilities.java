package Lab4Two;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import Lab4One.Cards;

public class CSVUtilities
{
	private ArrayList<String> CSVData;
	private int numColumns;
	
	public static void main(String args[])
	{
		
	}
	public CSVUtilities(File CSV)
	{
		Path pathToFile = Paths.get(File);
		this.CSVData = new ArrayList<String>();
		this.numColumns = 0;
		
		try(BufferedReader br = Files.newBufferedReader(pathToFile, StandardCharsets.US_ASCII))
		{
			String line = br.readLine();
			
			while(line != null)
			{
				String[] attributes = line.split(" , ");
				this.numColumns = attributes.length;
				
				CSVData.add(line);
				
				line = br.readLine();
			}
		}
		catch(IOException ioe)
		{
			ioe.printStackTrace();
		}
	}
	public List<String> getColumnHeaders()
	{
		ArrayList
	}

}
