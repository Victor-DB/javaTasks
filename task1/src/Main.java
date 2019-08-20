import java.io.FileReader;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.Collections;
import java.text.DecimalFormat;



public class Main {

    public static void main(String[] args) throws FileNotFoundException, IOException {
    	FindPercentle();
    	FindMediana();
    	FindMax();
        FindMin();
        FindAverage();     
    }

    public static void FindMax() {
        try {
            BufferedReader br = new BufferedReader(new FileReader("task1.txt"));
            String text;
            double max = Double.MIN_VALUE;
            while ((text = br.readLine()) != null) {
                if (Double.parseDouble(text) > max)
                    max = Double.parseDouble(text);
            }
            System.out.println("Max: " + max);
            br.close();
        }catch (IOException e) {
        }
    }

    public static void FindMin() {
        try {
            BufferedReader br = new BufferedReader(new FileReader("task1.txt"));
            String text;
            double min = Double.MAX_VALUE;
            while ((text = br.readLine()) != null) {
                if (Double.parseDouble(text) < min)
                    min = Double.parseDouble(text);
            }
            System.out.println("Min: " + min);
            br.close();
        }catch (IOException e) {
        }
    }
	
    	public static void FindPercentle() {
    		ArrayList<Double> list = new ArrayList<Double>();
    		try {
    			BufferedReader br = new BufferedReader(new FileReader("task1.txt"));  		    
    		    String line;
    		    while ((line = br.readLine()) != null) {    
    		       Double n = Double.parseDouble(line);                    
    		       list.add(n);
    		    }                                                            		                                                         		    
    		    br.close();
    		} catch (Exception ex) {
    			ex.printStackTrace();
    		}
    		
    		Collections.sort(list);
            double y = 0.9*list.size();
            int z = (int)Math.floor(y);
            System.out.println("Percentle:" + list.get(z)); 		
    	}

    	
    	
    	public static void FindMediana() {
    	   ArrayList<Double> list = new ArrayList<Double>();
    	   try {
    		   BufferedReader br = new BufferedReader(new FileReader("task1.txt"));
    		   String line;
    		   while((line = br.readLine()) != null) {
    			   Double n = Double.parseDouble(line);
    			   list.add(n);
    		   }
    		   br.close();
    	   } catch (Exception ex) {
    		   ex.printStackTrace();
    	   }
    	   
    	   Collections.sort(list);
    	   if (list.size() % 2 != 0) {
    		   int index = (list.size() - 1)/2 + 1;
    		   double medianaValue = list.get(index);
    		   DecimalFormat df = new DecimalFormat("#.##");
    		   System.out.println("Mediana: " + df.format(medianaValue)); 
    	   }
    	   
    	   else if (list.size() % 2 == 0) {
    		   int index1 = list.size()/2;
    		   int index2 = list.size()/2 + 1;
    		   double medianaValue = (list.get(index1) + list.get(index2))/2;   		   
    		   DecimalFormat df = new DecimalFormat("#.##");
    		   System.out.println("Mediana: " + df.format(medianaValue));   		     		   	   
    	   }
    	}
    	
    	
    	
    	public static void FindAverage() {
        	ArrayList<Double> list = new ArrayList<>();
        	try {
        		BufferedReader br = new BufferedReader(new FileReader("task1.txt"));
        		String line;
        		while ((line = br.readLine()) != null) {
        			Double n = Double.parseDouble(line);
        			list.add(n);
        		}
        		br.close();  		
        	} catch (Exception ex) {
        		ex.printStackTrace();
        	}
        	Double sum = 0.00;
        	for (int i = 0; i < list.size(); i++) {
        		sum += list.get(i);
        	}
        	double average = sum/list.size();      	
        	DecimalFormat df = new DecimalFormat ("#.##");
        	System.out.println("AverageValue: " + df.format(average));
    	}      
}

