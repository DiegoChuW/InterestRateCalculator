import java.util.Scanner;
import java.text.NumberFormat; 

class InterestRate{
  public static void main(String[] args) {
     
    //declaring variables
    double StartAmount,percent, interest, total, TotalCompound, CompoundInterest, InterestRate;
    int time;
    NumberFormat money = NumberFormat.getCurrencyInstance(); 
    Scanner myObj = new Scanner(System.in);
    
    //user input
    System.out.println("Starting Amount:");
    StartAmount = myObj.nextDouble();
    System.out.print("Amount of years:");
    time = myObj.nextInt();
    System.out.print("Interest in percent:");
    percent = myObj.nextDouble();
    
    //calculations & totals4
    InterestRate = 1+percent/100*time;
    total = StartAmount * InterestRate;
    interest = 1+percent/100;
    CompoundInterest = Math.pow(interest,time);
    TotalCompound = StartAmount * CompoundInterest;
    
    System.out.println("Total regular interest after " + time + " years: ");
    System.out.println(money.format(total));
    System.out.print("Total compound interest after " + time + " years: ");
    System.out.println(money.format(TotalCompound));
    }
    
}