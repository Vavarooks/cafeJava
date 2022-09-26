public class CafeJava {
    public static void main(String[] args) {
        // APP VARIABLES
        // Lines of text that will appear in the app. 
        String generalGreeting = "Welcome to Cafe Java, ";
        String pendingMessage = ", your order will be ready shortly";
        String readyMessage = ", your order is ready";
        String displayTotalMessage = "Your total is $";
        
        // Menu variables (add yours below)
        double mochaPrice = 3.5;
        double dripCoffee = 4.5;
        double latte = 6.5;
        double cappuccino = 5.5;
    
        // Customer name variables (add yours below)
        String customer1 = "Cindhuri";
        String customer2 = "Noah";
        String customer3 = "Sam";
        String customer4 = "Jimmy";
    
        // Order completions (add yours below)
        boolean isReadyOrder1 = false;
        boolean isReadyOrder2 = true;
        boolean isReadyOrder3 = false;
        boolean isReadyOrder4 = true;
    
        // APP INTERACTION SIMULATION (Add your code for the challenges below)
        // Example:
        // System.out.println(generalGreeting + customer1);
         // Displays "Welcome to Cafe Java, Cindhuri"
    	// ** Your customer interaction print statements will go here ** //
        
        System.out.println(generalGreeting + customer1 + pendingMessage);

        System.out.println(generalGreeting + customer2);
            if(isReadyOrder2 == false) {
                System.out.println(pendingMessage);
                isReadyOrder2 = true;
            }
            System.out.println(customer2 + readyMessage);
            System.out.println(displayTotalMessage + cappuccino);

        System.out.println(generalGreeting + customer3);
            if(isReadyOrder3 == false){
                System.out.println(customer3 + pendingMessage);
                isReadyOrder3 = true;
            }
            System.out.println(customer3 + readyMessage);
            System.out.println(displayTotalMessage + latte);

        System.out.println(generalGreeting + customer4);
        if(isReadyOrder4 == false){
                System.out.println(pendingMessage);
                isReadyOrder4 = true;
            }
        System.out.println(customer4 + readyMessage);
        System.out.println(displayTotalMessage + dripCoffee);

        
    }
}