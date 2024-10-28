package shashank;
import java.util.Scanner; 
public class GRADE_CALCULATOR {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the total no. of subject:");
        int numofsubject =sc.nextInt();

        int totalmarks=0;

        for(int i=1;i<=numofsubject;i++){
            System.out.println("enter marks of subject-" +i +"(out of 100)");
            int marks=sc.nextInt();

            while (marks < 0 ||marks>100) {
            System.out.println("invalid marks. please enter marks between o &100 ");
            System.out.println("enter marks of subject"+i+"(out of 100)");
             marks=sc.nextInt();
              
            }
         totalmarks +=marks;
        }
    System.out.println("total marks obtain in all subject:"+totalmarks);
   System.out.println("Student Result:");

      double AveragePercentage =(double) totalmarks/ numofsubject;
      System.out.println("Avearge Percentage:"+AveragePercentage);

      if(AveragePercentage>=90){
      System.out.println("your grade is: A+");
      }
      if(AveragePercentage>=80){
        System.out.println("your grade is: A");
      }
      else if(AveragePercentage>=70){
            System.out.println("your grade is: B+");
            }
      else if(AveragePercentage>=60){
            System.out.println("your grade is: B");
                }
      else if(AveragePercentage>=50){
           System.out.println("your grade is: C+");
                }
      else if(AveragePercentage>=40){
            System.out.println("your grade is: C");
                }        
      else if(AveragePercentage>=30){
             System.out.println("your grade is: D");
                }
        else{
            System.out.println("fail(better luck for next time)");
        }    
        
    }
    
}
