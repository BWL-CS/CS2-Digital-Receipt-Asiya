  public class Main {
  public static void main(String [] args) {
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
      int taxRate = (int)(Math.random()*)
   
   
   
   // RECEIPT PRINTOUT SECTION
     System.out.println("**************************************");
     System.out.println("*                                    *");
     System.out.println("*     " + highSchoolName + " Snack Bar          *");
     System.out.println("*                                    *");
     System.out.println("*     Drink ..........$ "+ drinkPrice +" *");                      
     System.out.println("*     Candy ..........$ "+ candyPrice +"          *");     
     System.out.println("*     Hot Dog ........$  "+ hotDogPrice + "          *");     
     System.out.println("*     Hamburger ......$ " + hamburgerPrice + "        *");     
     System.out.println("*                                    *");    
     System.out.println("**************************************");
  }
  }

