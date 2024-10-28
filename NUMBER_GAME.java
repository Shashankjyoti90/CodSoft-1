package shashank;
import java.util.Random;
import java.util.Scanner;

public class NUMBER_GAME {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int chances=3;
    
        int finalscore=0;
        boolean playagain=true;
        System.out.println("welcome buddy!");
        System.out.println("hey!you have about "+ chances +" chances to win the game.");

        while(playagain){
            int rand=getrandN(1,100);
          
            Boolean guess=false;
            for(int i=1;i<=chances;i++){
                System.out.println("chance " + i + " enter your guess:");
                int user=sc.nextInt();
                if(user==rand){
                    guess=true;
                    finalscore+=1;
                    System.out.println("you won it.");
                    break;
                }
                else if(user>rand){
                    System.out.println("Too High");

                }
                else{
                    System.out.println("Too Low");
                }
            }
            if(guess==false){
                System.out.println("Sorry buddy you lost the game:"+rand);
            }
            System.out.println("do you want to play again(yes/no)");
            String PA=sc.next();
            playagain=PA.equalsIgnoreCase("yes");

        }
        System.out.println("That's it buddy,hope you enjoy game");
        System.out.println("here is your score :"+finalscore);
    }
        public static int getrandN(int min,int max){
           return(int)(Math.random()*(max-min+1)+min);

        }


    }

