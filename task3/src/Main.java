import java.io.FileReader;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.BufferedReader;

public class Main {
	public static void main(String[] args) throws FileNotFoundException, IOException {
    ReadFile();  
    }
    
    public static void ReadFile() {
		try {
			BufferedReader br1 = new BufferedReader(new FileReader("Cash1.txt"));  
			BufferedReader br2 = new BufferedReader(new FileReader("Cash2.txt")); 
			BufferedReader br3 = new BufferedReader(new FileReader("Cash3.txt")); 
			BufferedReader br4 = new BufferedReader(new FileReader("Cash4.txt")); 
			BufferedReader br5 = new BufferedReader(new FileReader("Cash5.txt")); 
		    String line1;
		    String line2;
		    String line3;
		    String line4;
		    String line5;
		    
		    Double maxN1 = 0.0;		   
		    int count = 0;
		    int interval = 0;
		    while ((line1 = br1.readLine()) != null && (line2 = br2.readLine()) != null && 
		    (line3 = br3.readLine()) != null && (line4 = br4.readLine()) != null && (line5 = br5.readLine()) != null) {
		       
		    	   count++;
		    	   if (Double.parseDouble(line1) + Double.parseDouble(line2) + Double.parseDouble(line3) + 
		    	   Double.parseDouble(line4) + Double.parseDouble(line5) > maxN1) {
		               maxN1 = Double.parseDouble(line1) + Double.parseDouble(line2) + Double.parseDouble(line3) + 
		    		    	   Double.parseDouble(line4) + Double.parseDouble(line5);
		               interval = count;
		           }		    	  
		    }   
		    System.out.println(interval);  //вывод номера интервала
		    //System.out.println(maxN1);   //максимальное кол-во людей на кассах
		    br1.close();
		} catch (Exception ex) {
			ex.printStackTrace();
		}	
	}
}