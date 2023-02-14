import java.util.Random;

public class SnakeAndLadder {

    public static void main(String[] args) {
        int position = 0;
        Random random = new Random();

        while (position < 100) {
            int roll = random.nextInt(6) + 1;
            System.out.println("You rolled a " + roll);
            position += roll;

            if (position == 54) {
                position = 19;
                System.out.println("You hit a snake and went down to 19");
            } else if (position == 90) {
                position = 48;
                System.out.println("You hit a snake and went down to 48");
            } else if (position == 99) {
                position = 77;
                System.out.println("You hit a snake and went down to 77");
            } else if (position == 9) {
                position = 34;
                System.out.println("You climbed a ladder and went up to 34");
            } else if (position == 40) {
                position = 64;
                System.out.println("You climbed a ladder and went up to 64");
            } else if (position == 67) {
                position = 86;
                System.out.println("You climbed a ladder and went up to 86");
            }
            System.out.println("You are now at " + position);
        }
        System.out.println("You won the game!");
    }
}
