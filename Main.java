   //PART D
    import java.util.Scanner;
  
  public class Main {
  public static void main(String [] args) {
    Scanner input = new Scanner(System.in);
    // VARIABLES
        String highSchoolName = "Birch Wathen Lenox";
        double drinkPrice = 1.50;
        double candyPrice = 1.25;
        double hotDogPrice = 2.75;
        double hamburgerPrice = 3.50;
      //  PART C VARIABLS 
      int orderNumber =  (int)(Math.random()*100) + 1; 
      int numDrinks =  (int)(Math.random()*3) ;
      int numCandies = (int)(Math.random()*3) ; 
      int numHotDogs = (int)(Math.random()*3) ;
      int numHamburgers = (int)(Math.random()*3); 
      //Variables + recipe print out 
        double subtotal = (numDrinks * drinkPrice) + (numCandies * candyPrice) + (numHotDogs * hotDogPrice) + (numHamburgers * hamburgerPrice);
        double taxRate = 0.08; //8% tax
        double totalTax = subtotal * taxRate;
        double total = subtotal + totalTax;

        //print prompt 
        // read input with scanner 
        // repeat 
        
   // RECEIPT PRINTOUT SECTION
     System.out.println("**************************************");
     System.out.println("*                                    *");
     System.out.println("*     " + highSchoolName + " Snack Bar          *" + orderNumber);
     System.out.println("*                                    *");
     System.out.println("*     Drink ..........$ " + (numDrinks * drinkPrice)+"*");                      
     System.out.println("*     Candy ..........$ "+  (numCandies * candyPrice)+"*");     
     System.out.println("*     Hot Dog ........$ "+ (numHotDogs * hotDogPrice)+"*");     
     System.out.println("*     Hamburger ......$ "+(numHamburgers * hamburgerPrice)+"*");     
     System.out.println("*                                      *"); 
     System.out.println("*     Subtotal: $" + subtotal);
     System.out.println("*     Tax:      $" + totalTax);
     System.out.println("*     Total:    $" + total);
     System.out.println("**************************************");   
     System.out.println("**************************************");
  }
  }



