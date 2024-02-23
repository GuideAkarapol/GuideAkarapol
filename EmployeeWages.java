import java.util.Scanner;
public class EmployeeWages {

    public static void main(String[] args) {
         Scanner input=new Scanner(System.in);
         System.out.print("Distance:");
         int s=input.nextInt();
         double ShippingCost;
         double GasplineCost;
         
                 if(s>=5&&s<=20){
                     ShippingCost = 20;
                     GasplineCost = 10;
                 }else if(s>=21&&s<=30){
                     ShippingCost = 25;
                     GasplineCost = 20;
                 }else{
                     System.out.println("Not in the Conditions");
                 return;
                 }
                 double TotalShippingCost=s*ShippingCost;
                 double TotalGasplineCost=s*GasplineCost;
                 double TotalExpense=TotalShippingCost+TotalGasplineCost;
                 
                 System.out.println("TotalShippingCost="  +Math.round(TotalShippingCost)+  "Baht");
                 System.out.println("TotalGasplineCost="  +Math.round(TotalGasplineCost)+  "Baht");
                 System.out.println("TotalExpense="  +Math.round(TotalExpense)+  "Baht");
         }
        }