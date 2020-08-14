import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;



public class UberEatsMobileApp {
    private static ArrayList<Integer> Costs = new ArrayList<>();
    private static ArrayList<String> mList =new ArrayList<>();
    private static Scanner sc = new Scanner(System.in);
    private static OrderSystem orderSystem = new OrderSystem();
    private static Order[] allOrders = orderSystem.getBasket();
    private static ArrayList<String> inputsUserArrayList = new ArrayList<>();
    

    /**
     * This is the main function that runs when I run the file after compiling.
     */
    public static void main(String[] args) throws IOException{
        System.out.println("Welcome to UberEatsApp - signature dish edition\n");

        System.out.println("Select location to load restaruants. Options are rondebosch, kenilworth, seapoint or all\n");
        String Userinput = sc.nextLine().toLowerCase(); // gets user input to select area
        if (Userinput.contains("rondebosch")){
            System.out.println(Userinput);
            inputsUserArrayList.add(Userinput);
        }else if (Userinput.contains("kenilworth")){
            inputsUserArrayList.add(Userinput);     
        }else if (Userinput.contains("seapoint")){
            inputsUserArrayList.add(Userinput);
        }else if (Userinput.contains("all")){
            String t = "rondebosch, kenilworth, seapoint";
            inputsUserArrayList.add(t);
        }

        System.out.println("Loading restaurants in your area...\n");
        //load list of restaruants //
        /**
         * 1. KFC
         * 2. McDonalds
         * 3. Burger King
         * ....from CSV file
         */
        System.out.println("1. "+allOrders[1].getMenuselect().getFranchise());
        System.out.println("2. "+allOrders[4].getMenuselect().getFranchise());
        System.out.println("3. "+allOrders[7].getMenuselect().getFranchise());
            
        
        orderSystem.getBasket();
        System.out.println("Please Select restaurant number (eg '1' for KFC)...\n");
        Menu menu = new Menu();
        int Userinput1=sc.nextInt();
        if(Userinput1==1){
            inputsUserArrayList.add("KFC");
        }else if (Userinput1==2) {
            inputsUserArrayList.add("McDonalds");
        }else if (Userinput1==3) {
            inputsUserArrayList.add("Burger King");
        }
        
        
        System.out.println("Loading dishes from your selected restaurant...\n");
        //can add as many dishes until user types c to checkout to payment
        //load dishes of restaruant
        /**
         * 1. signaturedish1 worth R400
         * 2. signaturedish2 worth R400
         * 3. signaturedish3 worth R400
         * ....from CSV file
         */
        if (Userinput1 == 1){
            System.out.println("Menu");
            System.out.println(Menu.getKFC());

        }else if(Userinput1==2){
            System.out.println("Menu");
            System.out.println(Menu.getMcDonalds());
        }else if(Userinput1==3){
            System.out.println("Menu");
            System.out.println(Menu.getBurgerKing());
        }else{
            System.out.println();
        }
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Your cart is currently empty\n"+ "Would you like to proceed? (Y/N)");
        String wString =scan.nextLine().toUpperCase();
        if(wString.contains("Y")) {
            boolean Flag = true;
            do{  
                System.out.println("Please select your item using the index(1,2,3) & 0 to end Selections");
                 //add items to cart    //suggestion: user arraylist to store cart items 
                 //when item is added to cart, cart is displayed as an arraylist showing items added to cart
                 
                int Userselect = scan.nextInt();
                if (Userinput1==1){
                    if(Userselect== 1){
                        System.out.println(Menu.KFCMenu.get(0));
                        mList.add(Menu.KFCMenu.get(0));
                        Costs.add(Menu.KFCMPrice.get(0));
                    }else if (Userselect==2) {
                    System.out.println(Menu.KFCMenu.get(1));
                        mList.add(Menu.KFCMenu.get(1));
                        Costs.add(Menu.KFCMPrice.get(1));
                    }else if (Userselect==3) {
                        System.out.println(Menu.KFCMenu.get(2));
    
                        mList.add(Menu.KFCMenu.get(2));
                        Costs.add(Menu.KFCMPrice.get(2));
                    }else if (Userselect==0) {
                        Flag=false;     
                    }
    
                }else if (Userinput1==2) {
                    
                    if(Userselect== 1){
                    System.out.println(Menu.MCdMenu.get(0));
                        mList.add(Menu. MCdMenu.get(0));
                        Costs.add(Menu.McDPrice.get(0));
                    }else if (Userselect==2) {
                        System.out.println(Menu.MCdMenu.get(1));
                        mList.add(Menu.MCdMenu.get(1));
                        Costs.add(Menu.McDPrice.get(1));
                    }else if (Userselect==3) {
                        System.out.println(Menu.MCdMenu.get(2));
                        mList.add(Menu.MCdMenu.get(2));
                        Costs.add(Menu.McDPrice.get(2));
                    }else if (Userselect==0) {
                        Flag=false;   
                    }
                    
                }else if (Userinput1==3) {
                    
                    if(Userselect== 1){
                        System.out.println(Menu.BKMenu.get(0));
                            mList.add(Menu. BKMenu.get(0));
                            Costs.add(Menu.BKPrice.get(0));
                        }else if (Userselect==2) {
                            System.out.println(Menu.BKMenu.get(1));
                            mList.add(Menu.BKMenu.get(1));
                            Costs.add(Menu.BKPrice.get(1));
                        }else if (Userselect==3) {
                            System.out.println(Menu.BKMenu.get(2));
                            mList.add(Menu.BKMenu.get(2));
                            Costs.add(Menu.BKPrice.get(2));
                        }else if (Userselect==0) {
                            Flag=false;
                            
                        }
                }
                   
            }while(Flag==true);
        

        }else if (wString.contains("N")) {
            System.out.println("Thank you for using our App"+"\n"+"GoodBye");
            return;
        }

        
        Scanner tn =new Scanner(System.in);
        boolean hasnum =true;
        while (hasnum==true) {
            System.out.println("Enter Item Number to delete item from cart...\n"+" Select (0) to continue");
            Userinput1 = tn.nextInt();
            if (Userinput1==0) {
            hasnum = false;
            }else{
            mList.remove(Userinput1-1);
            System.out.println(mList.toString().replace("[", "").replace("]", ""));
            } 

        } 
        

        System.out.println("Please confirm your order by pressing y for yes\n");
        Scanner nScanner =new Scanner(System.in);
        String Confirm = nScanner.nextLine().toUpperCase();
        System.out.println(inputsUserArrayList.get(0));
        if (Confirm.contains("Y")){
        //when y is pressed, Order gets added to CSV
            String list = inputsUserArrayList.get(1)+","+mList.toString().replace(",", ";").replace("[", "").replace("]", "")+","+ inputsUserArrayList.get(0);
            orderSystem.RecordOrders(list);
            //load items from cart
            for(int i =0 ; i<mList.size();i++){
                int j =1;
                System.out.println(j+". "+mList.get(i));
                j++;
            }
        /**
         * 1. signaturedish1
         * 2. signaturedish1
         * 3. signaturedish1
         * 4. signaturedish2
         * 5. signaturedish1
         * 6. signaturedish3
         */

        Integer[] array =Costs.toArray(new Integer[0]);
        
        System.out.println("Cost of Order: R" + OrderSystem.Getcost(array)); 
        }
        System.out.println("Order has been placed! Thank you for your time. Restaurant will process your order soon!\n");
        
    }
}