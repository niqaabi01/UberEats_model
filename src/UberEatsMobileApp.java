public class UberEatsMobileApp {

    /**
     * This is the main function that runs when I run the file after compiling.
     */
    public static void main(String[] args) {
        System.out.println("Welcome to UberEatsApp - signature dish edition\n");

        System.out.println("Select location to load restaruants. Options are rondebosch, kenilworth, seapoint or all\n");
        //takes user input

        System.out.println("Loading restaurants in your area...\n");
        //load list of restaruants // Restaruants class
        // UberEatsResturantApp()
        /**
         * 1. KFC
         * 2. McDonalds
         * 3. Burger King
         * ....from CSV file
         */

        System.out.println("Select restaurant number (eg '1' for KFC)...\n");
        //takes user input

        
        System.out.println("Loading dishes from your selected restaurant...\n");
        //can add as many dishes until user types c to checkout to payment
        //load dishes of restaruant
        /**
         * 1. signaturedish1 worth R400
         * 2. signaturedish2 worth R400
         * 3. signaturedish3 worth R400
         * ....from CSV file
         */

        System.out.println("Your cart is currently empty\n");
        System.out.println("Press 'a dishNumber' to add, and dishnumber is index+1 from the arraylist that its being printed from...\n");

         //add items to cart    //suggestion: user arraylist to store cart items 
         //when item is added to cart, cart is displayed as an arraylist showing items added to cart

         System.out.println("Press 'd index' to delete item from cart...\n");
         //user can click on d+(index) to delete a dish from the cart
         //when item is deleted from cart, cart is displayed as an arraylist showing items in the cart
        
        

        System.out.println("Please confirm your order by pressing y for yes\n");
        //when y is pressed, Order gets added to CSV
        //load items from cart
        /**
         * 1. signaturedish1
         * 2. signaturedish1
         * 3. signaturedish1
         * 4. signaturedish2
         * 5. signaturedish1
         * 6. signaturedish3
         */

        System.out.println("Cost of Order: R" + "");

         
        System.out.println("Order has been placed! Thank you for your time. Restaurant will process your order soon!\n");


         

         


         

    }
}