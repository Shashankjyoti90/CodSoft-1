package shashank;
import java.util.Scanner;
public class CURRENCY_CONVERTER {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("select the given option for currency converter");
        System.out.println("1=USD to rupees");
        System.out.println("2=rupees to USD");
        System.out.println("3=Euro to rupees");
        System.out.println("4=rupees to Euro");
        

        System.out.print("enter the option:");

        int choice =sc.nextInt();

        if(choice==1){
            System.out.println("enter the amount in USD:");
            double USD=sc.nextDouble();
            double Rupees=usdtoRupees(USD);
            System.out.println("Converter amount in Rupees:"+Rupees);
        }
        else if (choice==2){
            System.out.println("enter the amount in Rupees:");
            double Rupees=sc.nextDouble();
            double USD =RupeestoUSD(Rupees);
            System.out.println("Converter amount in USD:"+USD);
        }
        else if (choice==3){
            System.out.println("enter the amount in Euro:");
            double Euro=sc.nextDouble();
            double Rupees=EurotoRupees(Euro);
            System.out.println("Converter amount in USD:"+Rupees);

        }
        else if(choice==4){
            System.out.println("enter the amount in Rupees:");
            double Rupees=sc.nextDouble();
            double Euro=RupeestoEuro(Rupees);
            System.out.println("Converter amount in USD:"+Euro);
        }
        else{
            System.out.println("invalid choice.please enter correct option");
        }
        sc.close();
    }
    public static double usdtoRupees(double USD){
        return USD*84.08;   
    }
    public static double RupeestoUSD(double Rupees){
       return Rupees*0.012;
}
    public static double EurotoRupees(double Euro){
        return Euro*91.10;
    }
    public static double RupeestoEuro(double Rupees){
        return Rupees*0.011;
    }
    }


