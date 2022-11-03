import java.util.Scanner;
import java.text.NumberFormat; 

public class InterestRate{
  public static void main(String[] args) {
     
    //declaring variables
    double StartAmount,percent, interest, total, TotalCompound, CompoundInterest, InterestRate, monthly, yearly, YearlyContribution, MonthlyContribution, DTotalCompound, DCompoundInterest, Dinterest, Minterest, MCompoundInterest, MTotalCompound;
    int time;
    NumberFormat money = NumberFormat.getCurrencyInstance(); 
    Scanner myObj = new Scanner(System.in);
    
    //user input
    System.out.print("Starting Amount:");
    StartAmount = myObj.nextDouble();
    System.out.print("Amount of years:");
    time = myObj.nextInt();
    System.out.print("Interest in percent:");
    percent = myObj.nextDouble(); 
    System.out.print("yearly contribution:");
    YearlyContribution = myObj.nextDouble();
    System.out.print("Monthly contribution:");
    MonthlyContribution = myObj.nextDouble();
      
    //calculations & totals
    InterestRate = 1+percent/100*time;
    yearly = YearlyContribution * time;
    monthly = MonthlyContribution * time * 12;
    total = StartAmount * InterestRate + yearly + monthly;
    interest = 1+percent/100;
    Minterest = 1+percent/1200;
    Dinterest = 1+percent/36500;
    CompoundInterest = Math.pow(interest,time);
    MCompoundInterest = Math.pow(Minterest,time*12);
    DCompoundInterest = Math.pow(Dinterest,time*365);
    TotalCompound = StartAmount * CompoundInterest + yearly + monthly;
    MTotalCompound = StartAmount * MCompoundInterest + yearly + monthly;
    DTotalCompound = StartAmount * DCompoundInterest + yearly + monthly;
    System.out.print("Total regular interest after " + time + " years: ");
    System.out.println(money.format(total));
    System.out.print("Total yearly compound interest after " + time + " years: ");
    System.out.println(money.format(TotalCompound));
    System.out.print("Total Monthly compound interest after " + time + " years: ");
    System.out.println(money.format(MTotalCompound));
    System.out.print("Total Daily compound interest after " + time + " years: ");
    System.out.println(money.format(DTotalCompound));
    
    
    }
    
}
