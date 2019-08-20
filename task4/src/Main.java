import java.io.FileReader;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.BufferedReader;
import java.time.LocalTime;

public class Main {
	public static void main(String[] args) throws FileNotFoundException, IOException {   
    PoiskIntervala();   
    }
    
	public static void PoiskIntervala()  {
        try { 
          BufferedReader br = new BufferedReader(new FileReader("Task4.txt")); 
          String line;
             while ((line = br.readLine()) != null) {   
                         String[] time = line.split(" ");
                         LocalTime first = LocalTime.parse(time[0]);
                         LocalTime second = LocalTime.parse(time[1]);
                         
                         // доделать операции по их сравнению и нахождению максимального интервала
                         //................................................................
             } 
        }catch (Exception e) {
               e.printStackTrace();
         }
    }		
}