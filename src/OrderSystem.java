import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.HashSet;



public class OrderSystem{
    //private Menu[] menuItems; // menu items 
    private String filePathToCSV = "C:/Users/sibon/Desktop/UberEats_model/bin/restos.csv";    
    private Order[] order;


    OrderSystem() {}
    public int countLinesInCSV(String filename)
    {
        int i = 0;
        try 
        {
            BufferedReader csvReader = new BufferedReader(new FileReader(filePathToCSV));
            String row = null;
            while((row = csvReader.readLine()) != null)
            {
                i++;
            }
            csvReader.close();
        }
        catch(Exception e) 
        {
            System.out.println("Error: " + e.toString());
        }

        //System.out.println("Number of Profiles in the file: " +i);
        return i;
    }

    
    // Basket stores all orders
    public Order[] getBasket()
    { 
        try
        {
            BufferedReader csvReader = new BufferedReader(new FileReader(filePathToCSV));
            String row = null;
            int i=0; 
            this.order = new Order[countLinesInCSV(filePathToCSV)-1];
            while((row = csvReader.readLine()) != null)
            {
                if(i > 0)
                {
                    String[] data = row.split(",");
                    Restaurant restaurant = new Restaurant(data[0].trim(), data[7].trim());
                    Menuselect franchise =new Menuselect(data[0].trim());
                    Order order = new Order(restaurant, franchise);
                    this.order[i-1] = order ;
                    //System.out.println(restaurant.getName());
                    
                }   
                i++;
            }
            csvReader.close();
        }
        
        catch(Exception e)
		{
            System.out.println("Error: " + e.toString());
        }
        return this.order;
        
    }
        
    public static int Getcost(Integer... numbers) {
        int result = 0;
        for (Integer number: numbers){
            result += number;
        }
        // System.out.println("The total cost = R" + result);
        return result;

    }
    // public static int Getcost(Integer... numbers) {
    //     Integer [] nums ={1,2,3,5,1,8,6,900};
    //     numbers= nums;
    //     int result = 0;
    //     for (Integer number: numbers){
    //         result += number;
    //     }
    //     System.out.println(result);
    //     return result; 
        

    // }



    public void RecordOrders(String orders) throws IOException
    {
        try
        (        	//creates new files
        			// creates a file write object without overiding previously stored data
            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(
                                    new FileOutputStream("C:/Users/sibon/Desktop/UberEats_model/bin/orders.csv", true), "UTF-8"))) {
                                 writer.write(orders);
                                 writer.newLine();
			
            
		}
		catch(IOException e)
		{
			System.out.println(e);
		}
    }










} 