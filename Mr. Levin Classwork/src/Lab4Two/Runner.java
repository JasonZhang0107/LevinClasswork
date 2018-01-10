package Lab4Two;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Runner
{
	public static void main(String[] args)
	{
		File CSV = new File("keepScore.csv");
		CSVUtilities info =  new CSVUtilities(CSV);
		
		info.writeToCSV("Levi","39");
		
		//getColumnHeaders test code
		/*
		ArrayList<String> data = new ArrayList<String>();
		data = (ArrayList<String>) info.getColumnHeaders();
		
		for(int i=0; i<data.size(); i++)
		{
			System.out.println("Header " + (i + 1)  + ": " + data.get(i));
		}
		*/
		
		//get column data test code
		/*
		ArrayList<String> data = new ArrayList<String>();
		data = (ArrayList<String>) info.getColumnData(1);
		
		for(int i=0; i<data.size(); i++)
		{
			System.out.println("Row " + (i + 1)  + ": " + data.get(i));
		}
		*/
	}

}
