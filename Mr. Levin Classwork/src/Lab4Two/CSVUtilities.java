package Lab4Two;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
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
		Path pathToFile = Paths.get(CSV.getAbsolutePath());
		this.CSVData = new ArrayList<String>();
		this.numColumns = 0;
		
		try(BufferedReader br = Files.newBufferedReader(pathToFile))
		{
			String line = br.readLine();
			String[] attributes2 = line.split(",");
			this.numColumns = attributes2.length;
			
			while(line != null)
			{
				String[] attributes = line.split(",");
				
				if(attributes.length == this.numColumns)
				{
					for(String x : attributes)
					{
						CSVData.add(x);
					}
				}
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
		
		for(int i=0; i<this.numColumns; i++)
		{
			columnHeaders.add(this.CSVData.get(i));
		}
		return columnHeaders;
	}
	//Return an ArrayList with the data in a String
	public List<String> getColumnData(int column)
	{
		ArrayList<String> columnData = new ArrayList<String>();
		
		for(int i=column; i<this.CSVData.size(); i = i + numColumns)
		{
			columnData.add(this.CSVData.get(i));
		}
		return columnData;
	}
	//Return an ArrayList with the data converted to Integer
	public List<Integer> getIntegerData(int column)
	{
		ArrayList<Integer> columnDataInteger = new ArrayList<Integer>();
		
		for(int i=column; i<this.CSVData.size(); i = i + this.numColumns)
		{
			columnDataInteger.add(Integer.parseInt(this.CSVData.get(i)));
		}
		return columnDataInteger;
	}
	//Return an ArrayList with the data converted to Double
	public List<Double> getDoubleData(int column)
	{
		ArrayList<Double> columnDataDouble = new ArrayList<Double>();
		
		for(int i=column; i<this.CSVData.size(); i = i + this.numColumns)
		{
			columnDataDouble.add(Double.parseDouble(this.CSVData.get(i)));
		}
		return columnDataDouble;
	}
	public void writeToCSV(String name, String score)
	{
		PrintWriter pw = null;
		
		try
		{
			pw = new PrintWriter(new File("keepScore.csv"));
		}
		catch(FileNotFoundException e)
		{
			System.err.println(e);
		}
		StringBuilder sb = new StringBuilder();
		for(int i=1; i<this.CSVData.size()+1; i++)
		{
			if(i % this.numColumns == 0)
			{
				sb.append(this.CSVData.get(i-1) + "\n");
			}
			else
			{
				sb.append(this.CSVData.get(i-1) + ",");
			}
		}
		this.CSVData.add(name);
		this.CSVData.add(score);
		sb.append(name +","+ score +"\n");
		System.out.println(this.CSVData.size());
		System.out.println(this.CSVData);
		pw.write(sb.toString());
		pw.close();
	}
}
