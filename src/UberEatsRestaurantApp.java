import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

import javax.swing.JOptionPane;

import java.util.*;





public class UberEatsRestaurantApp { 
    private static Scanner x;
    public static void main(String[] args) throws IOException {
    
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to UberEatsApp - signature dish edition FOR RESTAURANTS\n");

        System.out.println("Enter restaurant name\n");
        String Userinput = scan.nextLine();// takes user input
        String filepath ="C:/Users/sibon/Desktop/UberEats_model/bin/orders.csv";

        System.out.println("Loading all orders placed...\n");
        // load list of orders

        ReadOrder(Userinput, filepath);
        /**
         * 1. Zinger burger & Chips from rondebosch 2. Wings & Chips from rondebosch 3.
         * Zinger burger & Chips from rondebosch
         */
        }
        public static void ReadOrder(String Userinput,String filepath){
            boolean found = false;
            String Name="";
            String itemsOrdered="";
            String location="";
            try {
                x= new Scanner(new File(filepath));
                x.useDelimiter("[,\n]");
                int lineNum=0;

                while(x.hasNext()&& !found)
                {
                    if (lineNum == 0) {
                        lineNum++;
                        continue;
                    }
                    Name=x.next();
                    itemsOrdered= x.next();
                    location=x.next();
                    if(Name.equals(Userinput))
                    {
                        found = true;
                    }
                }
                if(found){
                    String[] order1 = itemsOrdered.split(";");

                    for(int y=0;y<order1.length;y++)
                    {
                        System.out.println(1+y+". "+order1[y]+" "+location);
                    }
                }
                else
                {
                    System.out.println("Order not found");
                }

                
            } catch (Exception e) {
                System.out.println("Error");
            }

        }
    
}