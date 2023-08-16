package hello.com;
import java.util.Random;
import java.util.Scanner;

class Game1{
    public int number;
    public int inputNumber;
    public int noofGusses;

    public int getNoofGusses() {
        return noofGusses;
    }

    public void setNoofGusses(int noofGusses) {
        this.noofGusses = noofGusses;
    }


    Game1(){
        Random ran = new Random();
        this.number = ran.nextInt(100);
    }
    void takeUserInput(){
        System.out.println("Guess the number");
        Scanner sc = new Scanner(System.in);
        inputNumber = sc.nextInt();
    }
    boolean iscorrectnumber() {
        if (inputNumber == number) {
            System.out.println("yes you guessed the number");
            return true;
        } else if (inputNumber<number) {
            System.out.println("The number is to less....");
            
        }
        else if (inputNumber>number) {
            System.out.println("The number is to Greater....");

        }
        return false;
    }
}
public class Lec_50_Excercise_3_Solve {
    public static void main(String[] args) {
        Game1 g = new Game1();
        boolean b = false;
        while (!b){
        g.takeUserInput();
         b = g.iscorrectnumber();
        System.out.println(b);
    }}
}
