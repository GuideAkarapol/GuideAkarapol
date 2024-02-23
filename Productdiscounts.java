import java.util.Scanner;
public class Productdiscounts {

    public static void main(String[] args) {
        // TODO code application logic here
         Scanner input=new Scanner(System.in);
         System.out.print("Total price:");
         int a=input.nextInt();
         System.out.print("You have member type 1 & not member 2:");
         int b=input.nextInt();
         
         switch (b){
             case 1 :
                 System.out.println("you have member");
                 if(a<=50000)
                     System.out.println("you get 7%");
                 else System.out.println("you get 10%");
                 break;
             case 2 :
                 System.out.println("you not have member");
                 if(a<=30000)
                     System.out.println("you get 3%");
                 else System.out.println("you get 5%");
                 break;
           }
        }
      }