
import java.util.Scanner;


public class Game1 {


    private Scanner scanner;

    public static int punch;
    private int block;
    private int health = 100;
    private String name;
    boolean gameover = false;

    public  void method() {
        scanner = new Scanner(System.in);

        System.out.println("Hello! What is your name?");
        name = scanner.nextLine();
        System.out.println("Hi " + name + " Welcome to WestWorld " + "!");
        System.out.println("Lets get ready to play !");
        Rules();

        while (health > 0) {
            System.out.println("You must punch the gobblin with all your might: now punch! ");
            punch = scanner.nextInt();
            System.out.println("block his attack:");
            block = scanner.nextInt();
            System.out.println("Your attack is " + punch + ". Your defense is " + block + "\n\n");

            System.out.println("Lets do better!!" + " and play harder " + "\n\n");


            encounter();
            playMore();

        }

        for (int i = 0; i < name.length() - 1; i++) {

            System.out.println("Make sure to attack back!");

        }
    }

    public static void playMore() {
        Scanner scanner = new Scanner(System.in);
        boolean notTrue = true;
        System.out.println("play again? (answer \"Y\" or \"N\")");
        String yesNo = scanner.next();
        while (notTrue) {
            if (!yesNo.equalsIgnoreCase("Y") && !yesNo.equalsIgnoreCase("N")) {
                System.out.println(" Type in correcnt entry: please follow the rules :");
                System.out.println(" Want to play again? (answer \"Y\" or \"N\")");
                yesNo = scanner.next();
            } else if (yesNo.equalsIgnoreCase("Y")) {

                break;
            } else {
                System.out.println("SEE YOU SOON");
                notTrue = false;
            }
        }
    }


    public void loops(int input) {
        for (int i = 1; i <= input; i++) {
            System.out.println("I want to fight the goblin again");
        }
    }
        public static void Rules() {

        Scanner scanner = new Scanner(System.in);
            boolean notCorrect = true;
            System.out.println("Rules? (answer \"Y\" or \"N\")");
            String yesOrNo = scanner.next();
            while (notCorrect) {
                if (!yesOrNo.equalsIgnoreCase("Y") && !yesOrNo.equalsIgnoreCase("N")) {
                    System.out.println("Nope! follow the rules !:");
                    System.out.println(" you should read the rules before you start? (answer \"Y\" or \"N\")");
                    yesOrNo = scanner.next();
                } else if (yesOrNo.equalsIgnoreCase("Y")) {
                    System.out.println("The rules are: KILL THE GOBLIN! The Goblin has X amount of health, so you must punch the Goblin till it has no more health left ");
                    punch++;
                    notCorrect = false;
                    System.out.println("\n let's play the game!");
                } else {
                    System.out.println(" let's play the game!");
                    notCorrect = false;
                }
            }
    }
    public void encounter() {

        int hostAttack = 5;
        int hostDefense = 3;
        int hostHealth = 20;

        System.out.println("The Goblin is here! it has a attack power of " + hostAttack + " and has a defence power of " + hostDefense + " so make sure to kill it with all your might " );

        if(punch >= (hostHealth + (2 * hostDefense))) {

            System.out.println("You killed the goblin!!!!!!! ");
            System.out.println("Do you want to play again? YES or NO?");
            Scanner newScanner = new Scanner(System.in);
            String answer = newScanner.nextLine();

            switch (answer){
                case "NO":
                    System.exit(0);
                    break;
            }


        } else if (punch < (hostHealth + (2 * hostDefense ))) {
            health = health - hostAttack;

            System.out.println("The goblin has attacked " + hostAttack +  " your  health " + health + " is reduced by five ");
        }
        {
            Scanner scanner = new Scanner(System.in);
            boolean playerValid = true;
            System.out.println("C'mon!");

            System.out.println("You didn't die, but keep playing till it dies. Want to keep playing?" + " (answer \"Y\" or \"N\")");
            String yesOR = scanner.next();
            while (playerValid) {
                if (!yesOR.equalsIgnoreCase("Y") && !yesOR.equalsIgnoreCase("N")) {
                    System.out.println("not a valid entry - follow rules:");
                    System.out.println("play again? (answer \"Y\" or \"N\")");
                    yesOR = scanner.next();
                } else if (yesOR.equalsIgnoreCase("Y")) {
                    method();
                    break;
                } else {
                    System.out.println("thanks for nothing!");
                    playerValid = false;
                }
            }
        }
    }
}


