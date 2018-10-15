package CW;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class PolicingData {

	static Scanner Input = new Scanner(System.in);
	
	public static void main(String[] args) throws FileNotFoundException {

		BufferedReader br = null;
		String selectionStation = "";
		String selectionDate = "";
		String selectionFilter = "";
		
		System.out.println("Please Choose An Station Below: ");
		System.out.println("C = Cheshire");
		System.out.println("M = Merseyside");
		System.out.println("");
		
		selectionStation = Input.nextLine().toLowerCase();
		System.out.println("");
		
		System.out.println("Please Choose An Date Below: ");
		System.out.println("02 = 2018-02");
		System.out.println("03 = 2018-03");
		System.out.println("04 = 2018-04");
		System.out.println("");
		
		selectionDate = Input.nextLine().toLowerCase();
		System.out.println();
		
		if (selectionStation == "m") {
			selectionStation = "merseyside";
		} else {

			selectionStation = "cheshire";
		}
		
		String fileName = "src/2018-" + selectionDate + "/2018-" + selectionDate + "-" + selectionStation + "-stop-and-search.csv" ;
		
		System.out.println("You have selected station: " + selectionStation + " with the date range of 2018-" + selectionDate + ".");
		System.out.println();
		System.out.println("Type Filter: ");
		selectionFilter = Input.nextLine();
		System.out.println();
		
		
		try {
			
			int Count = 0;
			
			br = new BufferedReader(new FileReader(fileName));
			br.readLine();
			
			while ((PDA.brCDLA = br.readLine()) != null) {
				
				Count++;
				
				PDA.data = PDA.brCDLA.split(PDA.csvSplit,-1);	
				
				if (PDA.data[0].contains(selectionFilter)) {
					 	System.out.print("A ");
						System.out.print(PDA.data[0] + " was done on ");
						
						String[] Date = new String[2];
						Date = PDA.data[1].split("T");
						
						System.out.print(Date[0] + " at ");
						
						String[] Time = new String[2];
						Time = Date[1].split("\\+");
						
						System.out.print(Time[0] + " ");
						System.out.println("+" + Time[1] + ".");
						
						if (PDA.data[2].equals("False") || PDA.data[2].isEmpty()) {
							
						} else {
							System.out.println("Part of policing Operation " + PDA.data[2]);
							System.out.println("policing operation " + PDA.data[3]);
						}
						
						if (PDA.data[4].isEmpty() && PDA.data [5].isEmpty()) {
							System.out.println("No Location was given.");
						} else {
							System.out.println("Longitude: " + PDA.data[4]);
							System.out.println("Latitude: " + PDA.data[5] + ".");
						}
						
						if (PDA.data[0].equals("Vehicle search")) {
							System.out.println("No Person Data was Provided. ");
						} else {
							System.out.print("The Person Searched was " + PDA.data[6]);
							System.out.print(" and is " + PDA.data[7]);
							System.out.println(" their ethnicity is " + PDA.data[8] + ".");
							System.out.println("Officers conclude their ethnicity is " + PDA.data[9] + ".");
						}
						
						if (PDA.data[10].isEmpty()) {
							System.out.println("No Legislation was Provided. ");
						} else {
							System.out.println("The Legislation used was " + PDA.data[10] + ".");
						}
						
						if (PDA.data[11].isEmpty()) {
							System.out.println("No Object of Search was Provided. ");
						} else {
							System.out.println("Object of the search was for " + PDA.data[11] + "."); 
						}
						
						System.out.println("The outcome of this search was " + PDA.data[12] + ".");
						
						if (PDA.data[13].equals("False") || PDA.data[13].isEmpty()) {
							System.out.println("The Outcome related to search was False.");
						} else {
							System.out.println("The Outcome related to search was " + PDA.data[13] + ".");
						}
						
						if (PDA.data[14].equals("False") || PDA.data[14].isEmpty()) {
							System.out.printf("Removel of more than just outter clothing was not needed. \n");
							System.out.println();
						} else {
							System.out.printf("Removel of more than just outter clothing was performed. \n");
							System.out.println();
						}
						
						
				} else {
					
				}
				
				
				/* System.out.print(Count + " : ");
				System.out.print(data[0] + " : ");
				System.out.print(data[1] + " : ");
				System.out.print(data[2] + " : ");
				System.out.print(data[3] + " : ");
				System.out.print(data[4] + " : ");
				System.out.print(data[5] + " : ");
				System.out.print(data[6] + " : ");
				System.out.print(data[7] + " : ");
				System.out.print(data[8] + " : ");
				System.out.print(data[9] + " : ");
				System.out.print(data[10] + " : ");
				System.out.print(data[11] + " : ");
				System.out.print(data[12] + " : ");
				System.out.print(data[13] + " : ");
				System.out.printf(data[14] + " \n"); */
				
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
	
	
}
