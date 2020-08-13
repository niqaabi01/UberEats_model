import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;


public class OrderSystem{
    private Array[] MenuItems; // menu items 
    private String Name; // instaniate class name
    private String filePathToCSV = "orders.csv";
    private static Integer[] nums = { 1, 2, 3, 5, 1, 8, 6, 900 };
    private ArrayList<String> SignatureDish1 = new ArrayList<String>();
    private ArrayList<String> SignatureDish2 = new ArrayList<String>();
    private ArrayList<String> SignatureDish3 = new ArrayList<String>();
    



    OrderSystem() {}
    // Basket stores all orders
    public Menu[] getBasket()
    { 
        try
        {
            BufferedReader csvReader = new BufferedReader(new FileReader(filePathToCSV));
            String row = null;
            int i=0; 
            this.profile = new Profile[countLinesInCSV(filePathToCSV)-1];
            while((row = csvReader.readLine()) != null)
            {
                if(i > 0)
                {
                    String[] data = row.split(",");
                    // Intalise the menus and the items
                    restaurant = new Restaurant(data[0].trim(),data[7].trim());
//// check other classes to finish this
                    menu = new Menu( data[5].trim(), data[6].trim(), data[7].trim());
                    // order + price
                    // need to create the orders the use the values in orders to create an Integer Array to get the total cost
                    this.MenuItems[i-1] = Items;
                }
                i++;
    
            }
            csvReader.close();
        }
        
        catch(Exception e)
		{
            System.out.println("Error: " + e.toString());
        }
        return this.Items;

    }
        
    public static int Getcost(Integer... numbers) {
        numbers = nums;
        int result = 0;
        for (Integer number: numbers){
            result += number;
        }
        System.out.println("The total cost = R" + result);
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



    public void Order(ArrayList orders) throws IOException
    {
        try
		{
        	//creates new files
			File file = new File("Orders.csv");
			
			file.createNewFile();
			//PrintWriter output = new PrintWriter(file);
			// creates a file write object without overiding previously stored data
			Writer writer = new FileWriter(file, true);

			writer.write(profile+"\n");
			writer.flush();
			writer.close();
		}
		catch(IOException e)
		{
			System.out.println(e);
		}
    }










} 