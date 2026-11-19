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
     
     System.out.print("Enter Number of Drinks: ");
     int numDrinks = input.nextInt();
     
     System.out.print("Enter Number of Candies: ");
     int numCandies = input.nextInt(); 

     System.out.print("Enter Number of Hotdogs: "); 
     int numHotdogs = input.nextInt();

     System.out.print("Enter Number of Hamburgers: ");
     int numHamburgers = input.nextInt();
     
     input.nextLine(); 

     System.out.print("Enter High School Name: ");
     String nameOfSchool = input.nextLine(); 

     String firstLetter = nameOfSchool.substring(0,1); 

     int firstSpace = nameOfSchool.indexOf(" ");
     String secondLetter = nameOfSchool.substring(firstSpace + 1, firstSpace +2); 

    int secondSpace = nameOfSchool.indexOf(" ", firstSpace +1);
    String thirdLetter = nameOfSchool.substring(secondSpace +1, secondSpace +2);
    
     String intials = firstLetter + secondLetter + thirdLetter; 

     
     //Variables + recipe print out
       
       double drinkTotal = numDrinks * drinkPrice; 
       double candyTotal = numCandies * candyPrice; 
       double hotdogTotal = numHotdogs * hotDogPrice; 
       double hamburgerTotal = numHamburgers * hamburgerPrice; 
       
       double subtotal = drinkTotal + candyTotal + hotdogTotal + hamburgerTotal;
       double taxRate = 0.08; //8% tax
       double totalTax = subtotal * taxRate;
       double total = subtotal + totalTax;
      
       subtotal = ((int) (subtotal * 100))/100.0;
       totalTax = ((int)(totalTax * 100))/100.0; 
       total = ((int)(total * 100))/100.0;
       //print prompt
       // read input with scanner
       // repeat
      
  // RECEIPT PRINTOUT SECTION
    System.out.println("**************************************");
    System.out.println("*                                    *");
    System.out.println("*     " + intials + " Snack Bar          *" + orderNumber);
    System.out.println("*                                    *");
    System.out.println("*     Drink ..........$ " + (numDrinks * drinkPrice)+"*");                     
    System.out.println("*     Candy ..........$ "+  (numCandies * candyPrice)+"*");    
    System.out.println("*     Hot Dog ........$ " + (numHotdogs * hotDogPrice) + "*");   
    System.out.println("*     Hamburger ......$ "+(numHamburgers * hamburgerPrice)+"*");    
    System.out.println("*                                      *");
    System.out.println("*     Subtotal: $" + subtotal);
    System.out.println("*     Tax:      $" + totalTax);
    System.out.println("*     Total:    $" + total);
    System.out.println("**************************************");  
    System.out.println("**************************************");
 }
 }


