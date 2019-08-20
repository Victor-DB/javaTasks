import java.io.FileReader;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;



public class Main {
	static int stroki = 4;
	static int stolbcy = 2;
	static int[][] arr = new int[stroki][stolbcy];
	
	public static void main(String[] args) throws FileNotFoundException, IOException {
     ReadFile();
     Point p1 = new Point(); //доделать
     Point p2 = new Point();  //доделать
     Point p3 = new Point();  //доделать
     Point p4= new Point();    //доделать
     Quadrangle quad = new Quadrangle(p1, p2, p3, p4);
    }
	
    public static void ReadFile() {
    	Scanner sc;
    	ArrayList<Double> list = new ArrayList<Double>();
       try {
	        sc = new Scanner(new FileReader("Task2_quad.txt")); 
	        for (int i = 1; i < stroki; i++) {
	     	   for (int j = 1; j < stolbcy; j++) {
	     		   Double n = sc.nextDouble();
	     		   list.add(n);
	     	   }
	        } sc.close();
       }catch (Exception e) {
    	  e.printStackTrace(); 
       }        
    }
    
    //доделать.....
    
    public static void getPoint1 (double x1, double y1) {
 	    x1 = list.get(0);
 	    y1 = list.get(1);	    
    }
    
    public void getPoint2 (double x2, double y2) {
    	x2 = list.get(2);
 	    y2 = list.get(3);
    }
    
    public void getPoint3 (double x3, double y3) {
    	x3 = list.get(4);
 	    y3 = list.get(5);
    }
    public void getPoint4 (double x4, double y4) {
    	x4 = list.get(6);
 	    y4 = list.get(7);
    }	
}

