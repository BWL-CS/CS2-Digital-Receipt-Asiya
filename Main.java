  public class Main {
  public static void main(String [] args) {
    // VARIABLES
        String highSchoolName = "Birch Wathen Lenox";
        double drinkPrice = 1.50;
        double candyPrice = 1.25;
        double hotDogPrice = 2.75;
        double hamburgerPrice = 3.50;
        //Variables + recipe print out 
        double subtotal = (numDrinks * drinkPrice) + (numCandies * candyPrice) + (numHotDogs * hotDogPrice) + (numHamburgers * hamburgerPrice);
        double totalTax = subtotal * taxRate;
        double total = subtotal + totalTax;
    //  PART C VARIABLS 
      int orderNumber =  (int)(Math.random()*100) + 1; 
      int numDrinks =  (int)(Math.random()*3) ;
      int numCandies = (int)(Math.random()*3) ; 
      int numHotDogs = (int)(Math.random()*3) ;
      int numHamburgers = (int)(Math.random()*3); 
      int taxRate = (int)(Math.random()*3);
      int subTotal = (int)(Math.random()*3);
      int totalTax = (int)(Math.random()*3);
      int Total = (int)(Math.random()*3); 

   
   // RECEIPT PRINTOUT SECTION
     System.out.println("**************************************");
     System.out.println("*                                    *");
     System.out.println("*     " + highSchoolName + " Snack Bar          *" + orderNumber);
     System.out.println("*                                    *");
     System.out.println("*     Drink ..........$ "+ drinkPrice +" + (numDrinks * drinkPrice);*");                      
     System.out.println("*     Candy ..........$ "+ candyPrice +" + (numCandies * candyPrice);         *");     
     System.out.println("*     Hot Dog ........$  "+ hotDogPrice + " + (numHotDogs * hotDogPrice);         *");     
     System.out.println("*     Hamburger ......$ " + hamburgerPrice + " + (numHamburgers * hamburgerPrice);        *");     
     System.out.println("*                                      *"); 
     System.out.println("*     Subtotal: $" + (subtotal);
     System.out.println("*     Tax:      $" + (totalTax);
     System.out.println("*     Total:    $" + (total);
     System.out.println("**************************************");   
     System.out.println("**************************************");
  }
  }

