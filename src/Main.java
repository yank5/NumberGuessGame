import java.util.Scanner;
import java.lang.Math;
public class Main {
    public static void main(String[] args) {
        Scanner ab = new Scanner(System.in);
        boolean guessed = false;
        int count = 1;
        int tb = (int) Math.round(Math.random() * 100 + 1);
        System.out.println(tb);

        System.out.println("Guess the number between 1 and 100");

        do {
            System.out.println("Enter a guess:");
            int imp = ab.nextInt();
            count = count+1;




            if (imp > tb&&guessed==false) {
                System.out.println("Too high!");
            } else if (imp < tb&&guessed==false) {
                System.out.println("Too low!");
            }



            if (tb == imp) {
                guessed = true;
                System.out.println("You guessed the right number! it was " + tb);
            }



            if (count >= 4&&guessed==false) {
                if(tb-5<=imp&&imp<=tb+5){
                    System.out.println("You are within 5");
                } else {
                    System.out.println("You are not within 5");
                }
            }



        } while (guessed == false);










        }
    }