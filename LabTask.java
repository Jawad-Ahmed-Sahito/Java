import java.util.Scanner;
public class LabTask{
        public static void main(String[] args) {
    int guess=0;
    int correctguess=1;
        while (guess != correctguess){
            System.out.println("Enter your number");
            Scanner sc = new Scanner (System.in);

            guess = sc.nextInt();

                if (guess == correctguess ){
                System.out.println("You are correct");}
                else if  (guess > 1 ){
                    System.out.println("Your guess number is  too high");}
                else if (guess < 1){
                        System.out.println("Your guess number is too low");
                    }
            }

        }
       }

