package Lab4Two;

import java.io.BufferedReader;
import java.io.File;
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
	
	public CSVUtilities(File CSV)
	{
		Path pathToFile = Paths.get(CSV);
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
	//Return an ArrayList with the headers for each column
	public List<String> getColumnHeaders()
	{
		ArrayList<String> columnHeaders = new ArrayList<String>();
		
		for(int i=0; i<this.CSVData.size(); i++)
		{
			columnHeaders.add(this.CSVData.get(i));
		}
		return columnHeaders;
	}
	//Return an ArrayList with the data for a column specified
	public List<String> getColumnData(int column)
	{
		ArrayList<String> columnData = new ArrayList<String>();
		
		for(int i=0; i<this.CSVData.size(); i = i + numColumns)
		{
			columnData.add(this.CSVData.get(i));
		}
		return columnData;
	}
	//Return an ArrayList with the data converted to Integer
	public List<Integer> getIntegerData(int column)
	{
		ArrayList<String> columnData = new ArrayList<String>();
		
		for(int i=0; i<this.CSVData. )
	}
}
