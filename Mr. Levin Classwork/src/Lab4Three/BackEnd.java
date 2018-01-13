package Lab4Three;

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

public class BackEnd
{
	private ArrayList<String> CSVData;
	private int numColumns;
	
	public BackEnd(File CSV)
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
	public void writeToCSV(String name, String score)
	{
		PrintWriter pw = null;
		
		try
		{
			pw = new PrintWriter(new File("FastClickerScoreSheet.csv"));
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
		pw.write(sb.toString());
		pw.close();
	}
	public List<Integer> getIntegerData(int column)
	{
		ArrayList<Integer> columnDataInteger = new ArrayList<Integer>();
		
		for(int i=column; i<this.CSVData.size(); i = i + this.numColumns)
		{
			columnDataInteger.add(Integer.parseInt(this.CSVData.get(i)));
		}
		return columnDataInteger;
	}
}
