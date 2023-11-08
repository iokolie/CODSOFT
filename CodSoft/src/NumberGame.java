import java.util.Scanner;

public class NumberGame {
    public void GuessNumber(){
        Scanner sc = new Scanner(System.in);

        int number = 1+(int) (100* Math.random());

        int k = 5;
        int i, guess;

        System.out.println("A random number has been chosen between 1 and 100" +
                "guess the number within 5 trials");
        for (i=0; i<k; i++){
            System.out.println("Guess the Number: ");
            guess = sc.nextInt();

            if (guess == number){
                System.out.println("Congratulations you guessed the right number!!!");
                break;
            }else if(guess > number && i != k - 1){
                System.out.println("The number is lower than " + guess);

            } else if (guess < number && i != k - 1) {
                System.out.println("The number is Higher than " + guess);

            }
        }

        if (i==k){
            System.out.println("You've exhausted your trials");
            System.out.println("The right number was " + number);
        }
    }


}
