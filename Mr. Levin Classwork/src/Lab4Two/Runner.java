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
		File CSV = new File("LeadingCausesOfDeath.csv");
		CSVUtilities info =  new CSVUtilities(CSV); 
		
		ArrayList<String> data = new ArrayList<String>();
		data = (ArrayList<String>) info.getColumnHeaders();
		
		for(int i=0; i<data.size(); i++)
		{
			System.out.println("Header " + i + ": " + data.get(i));
		}
	}

}
