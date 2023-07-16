public class GuessingGame {

    public static void main(String[] args) {

        int secretNumber = 15;
        int guess = 30;

        if (secretNumber == guess) {
            System.out.println("You guessed the secret number!");
        } else if (secretNumber > guess) {
            System.out.println("Your guess is too low!");
        } else
            System.out.println("Your guess is too high!");
    }
}
