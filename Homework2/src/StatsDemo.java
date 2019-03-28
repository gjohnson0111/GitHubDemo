	import java.util.Scanner;        // For the Scanner class
	import java.io.*; 
	
	/*This class reads numbers from a file, calculates the
	mean and standard deviation, and writes the results
	to a file.
	*/
	public class StatsDemo
	{
	// TASK #3 Add the throws clause
			public static void main(String[] args) throws IOException
			{
			double sum = 0; // The sum of the numbers
			int count = 0; // The number of numbers added
			double mean = 0; // The average of the numbers
			double stdDev = 0; // The standard deviation
			String line; // To hold a line from the file
			double difference; // The value and mean difference
			// Create an object of type Scanner
			Scanner keyboard = new Scanner (System.in);
			String filename; // The user input file name
			// Prompt the user and read in the file name
			System.out.println("This program calculates " +
			"statistics on a file " +
			"containing a series of numbers");
			System.out.print("Enter the file name: ");
			filename = keyboard.nextLine();
			
			FileWriter fileW =new FileWriter(new File("Results.txt")); //opening file Results.txt
			PrintWriter pw=new PrintWriter(fileW); //Creating printer object
			pw.println("Mean : "+mean+"Standard Dev : "+stdDev); //printing result to file
			fileW.close(); //closing file
			
			FileReader Stats = new FileReader("Numbers.txt"); //open filename with File object and FileReader
			BufferedReader StatsR =new BufferedReader(Stats); //bufferedReader
			line = StatsR.readLine(); //reading first line
			
			while(line!=null) //repeat until end of file
			{
			sum+= Double.parseDouble(line); //convert line to double
			line = StatsR.readLine(); //read next line
			count++; //increment counter
			}
			
			Stats .close(); //closing input file
			mean=sum/count; //calculate mean
			}
	
	
	
	
	
	}	
	
	


