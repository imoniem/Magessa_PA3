import java.security.SecureRandom;
import java.util.Scanner;
import java.util.Random;
public class Magessa_P1 {
        public static double mult( int lev ) {
            double counterCor = 0;
            double ans = 0;
            SecureRandom rnd = new SecureRandom();
            if (lev == 1) {
                double rndNum1 = rnd.nextInt(10);
                double rndNum2 = rnd.nextInt(10);
                System.out.println("How much is " + rndNum1 + " times " + rndNum2 + "?");
                ans = rndNum1 * rndNum2;
                Scanner scr = new Scanner(System.in);
                double userAns = scr.nextInt();
                counterCor = randomCalc(ans,userAns);
            } else if (lev == 2) {
                double rndNum1 = rnd.nextInt(90) + 10;
                double rndNum2 = rnd.nextInt(90) + 10;
                System.out.println("How much is " + rndNum1 + " times " + rndNum2 + "?");
                ans = rndNum1 * rndNum2;
                Scanner scr = new Scanner(System.in);
                double userAns = scr.nextInt();
                counterCor = randomCalc(ans,userAns);
            } else if (lev == 3) {
                double rndNum1 = rnd.nextInt(900) + 100;
                double rndNum2 = rnd.nextInt(900) + 100;
                System.out.println("How much is " + rndNum1 + " times " + rndNum2 + "?");
                ans = rndNum1 * rndNum2;
                Scanner scr = new Scanner(System.in);
                double userAns = scr.nextInt();
                counterCor = randomCalc(ans,userAns);
            } else if (lev == 4) {
                double rndNum1 = rnd.nextInt(9000) + 1000;
                double rndNum2 = rnd.nextInt(9000) + 1000;
                System.out.println("How much is " + rndNum1 + " times " + rndNum2 + "?");
                ans = rndNum1 * rndNum2;
                Scanner scr = new Scanner(System.in);
                double userAns = scr.nextInt();
                counterCor = randomCalc(ans,userAns);
            }
            return ans;
        }
        static double add (int lev) {
            double ans = 0;
            double counterCor = 0;
            SecureRandom rnd = new SecureRandom();
            if (lev == 1) {
                double rndNum1 = rnd.nextInt(10);
                double rndNum2 = rnd.nextInt(10);
                System.out.println("How much is " + rndNum1 + " plus " + rndNum2 + "?");
                ans = rndNum1 + rndNum2;
                Scanner scr = new Scanner(System.in);
                double userAns = scr.nextInt();
                counterCor = randomCalc(ans,userAns);
            } else if (lev == 2) {
                double rndNum1 = rnd.nextInt(90) + 10;
                double rndNum2 = rnd.nextInt(90) + 10;
                System.out.println("How much is " + rndNum1 + " plus " + rndNum2 + "?");
                ans = rndNum1 + rndNum2;
                Scanner scr = new Scanner(System.in);
                double userAns = scr.nextInt();
                counterCor = randomCalc(ans,userAns);
            } else if (lev == 3) {
                double rndNum1 = rnd.nextInt(900) + 100;
                double rndNum2 = rnd.nextInt(900) + 100;
                System.out.println("How much is " + rndNum1 + " plus " + rndNum2 + "?");
                ans = rndNum1 + rndNum2;
                Scanner scr = new Scanner(System.in);
                double userAns = scr.nextInt();
                counterCor = randomCalc(ans,userAns);
            } else if (lev == 4) {
                double rndNum1 = rnd.nextInt(9000) + 1000;
                double rndNum2 = rnd.nextInt(9000) + 1000;
                System.out.println("How much is " + rndNum1 + " plus " + rndNum2 + "?");
                ans = rndNum1 + rndNum2;
                Scanner scr = new Scanner(System.in);
                double userAns = scr.nextInt();
                counterCor = randomCalc(ans,userAns);
            }
            return ans;
        }
        static double sub( int lev ) {
            double counterCor = 0;
            double ans = 0;
            SecureRandom rnd = new SecureRandom();
            if (lev == 1) {
                double rndNum1 = rnd.nextInt(10);
                double rndNum2 = rnd.nextInt(10);
                System.out.println("How much is " + rndNum1 + " minus " + rndNum2 + "?");
                ans = rndNum1 - rndNum2;
                Scanner scr = new Scanner(System.in);
                double userAns = scr.nextInt();
                counterCor = randomCalc(ans,userAns);
            } else if (lev == 2) {
                double rndNum1 = rnd.nextInt(90) + 10;
                double rndNum2 = rnd.nextInt(90) + 10;
                System.out.println("How much is " + rndNum1 + " minus " + rndNum2 + "?");
                ans = rndNum1 - rndNum2;
                Scanner scr = new Scanner(System.in);
                double userAns = scr.nextInt();
                counterCor = randomCalc(ans,userAns);
            } else if (lev == 3) {
                double rndNum1 = rnd.nextInt(900) + 100;
                double rndNum2 = rnd.nextInt(900) + 100;
                System.out.println("How much is " + rndNum1 + " minus " + rndNum2 + "?");
                ans = rndNum1 - rndNum2;
                Scanner scr = new Scanner(System.in);
                double userAns = scr.nextInt();
                counterCor = randomCalc(ans,userAns);
            } else if (lev == 4) {
                double rndNum1 = rnd.nextInt(9000) + 1000;
                double rndNum2 = rnd.nextInt(9000) + 1000;
                System.out.println("How much is " + rndNum1 + " minus " + rndNum2 + "?");
                ans = rndNum1 - rndNum2;
                Scanner scr = new Scanner(System.in);
                double userAns = scr.nextInt();
                counterCor = randomCalc(ans,userAns);
            }
            return ans;
        }
        static double div( int lev ) {
            double counterCor = 0;
            double ans = 0;
            SecureRandom rnd = new SecureRandom();
            if (lev == 1) {
                double rndNum1 = rnd.nextInt(10);
                double rndNum2 = rnd.nextInt(10);
                System.out.println("How much is " + rndNum1 + " divided " + rndNum2 + "?");
                ans = rndNum1 / rndNum2;
                Scanner scr = new Scanner(System.in);
                double userAns = scr.nextInt();
                counterCor = randomCalc(ans,userAns);
            } else if (lev == 2) {
                double rndNum1 = rnd.nextInt(90) + 10;
                double rndNum2 = rnd.nextInt(90) + 10;
                System.out.println("How much is " + rndNum1 + " divided " + rndNum2 + "?");
                ans = rndNum1 / rndNum2;
                Scanner scr = new Scanner(System.in);
                double userAns = scr.nextInt();
                counterCor = randomCalc(ans,userAns);
            } else if (lev == 3) {
                double rndNum1 = rnd.nextInt(900) + 100;
                double rndNum2 = rnd.nextInt(900) + 100;
                System.out.println("How much is " + rndNum1 + " divided " + rndNum2 + "?");
                ans = rndNum1 / rndNum2;
                Scanner scr = new Scanner(System.in);
                double userAns = scr.nextInt();
                counterCor = randomCalc(ans,userAns);
            } else if (lev == 4) {
                double rndNum1 = rnd.nextInt(9000) + 1000;
                double rndNum2 = rnd.nextInt(9000) + 1000;
                System.out.println("How much is " + rndNum1 + " divided " + rndNum2 + "?");
                ans = rndNum1 / rndNum2;
                Scanner scr = new Scanner(System.in);
                double userAns = scr.nextInt();
                counterCor = randomCalc(ans,userAns);
            }
            return ans;
        }
        public static void cai (int level, int arith) {
            double counterCorrect = 0;
            int ans = 0, userAns = 0;
            switch (arith) {
                case 1:
                    for(int a = 1; a <= 10; a++) {
                         add(level);
                    }
                    percentCalc(counterCorrect);
                    break;
                case 2:
                    for (int m = 1; m <= 10; m++) {
                        counterCorrect = mult(level);
                    }
                    percentCalc(counterCorrect);
                    break;
                case 3:
                    for (int s = 1; s <= 10; s++) {
                        counterCorrect = sub(level);
                    }
                    percentCalc(counterCorrect);
                    break;
                case 4:
                    for (int d = 1; d <= 10; d++) {
                        counterCorrect = div(level);
                    }
                    percentCalc(counterCorrect);
                    break;
                case 5:
                    for (int i = 1; i <= 10; i++) {
                        SecureRandom rand = new SecureRandom();
                        int ran = rand.nextInt(4) + 1;
                        if (ran == 1) {
                            counterCorrect = add(level);
                        }
                        if (ran == 2) {
                            counterCorrect = mult(level);
                        }
                        if (ran == 3) {
                            counterCorrect = sub(level);
                        }
                        if (ran == 4) {
                            counterCorrect = div(level);
                        }
                    }
                    percentCalc(counterCorrect);
                    break;

            }
        }
        public static void doAgain( int lvl, int arith){
            Scanner nr = new Scanner(System.in);
            System.out.println("Would you like to continue? (Y/N)");
            String userInp = nr.next();
            switch (userInp) {
                case "Y":
                    cai(lvl, arith);
                case "N":
                    break;
            }
        }
        public static int levelChoice() {
            System.out.println("Choose the difficulty level");
            System.out.println("Level-1");
            System.out.println("Level-2");
            System.out.println("Level-3");
            System.out.println("Level-4");
            Scanner sc = new Scanner(System.in);
            int level = sc.nextInt();
            return (level);
        }
        public static int arithChoice() {
            System.out.println("Choose type of Arithmetic");
            System.out.println("Addition-1");
            System.out.println("Multiplication-2");
            System.out.println("Subtraction-3");
            System.out.println("Division-4");
            System.out.println("All Types -5");
            Scanner sc = new Scanner(System.in);
            int typeArith = sc.nextInt();
            return (typeArith);
        }
        public static double randomCalc(double ans, double userAns){
            double counterCorrect=0;
            Random rand = new Random();
            int randNum = rand.nextInt(4) + 1;
            if (userAns == ans) {
                switch (randNum) {
                    case 1:
                        System.out.println("Very good!");
                        break;
                    case 2:
                        System.out.println("Excellent!");
                        break;
                    case 3:
                        System.out.println("Nice work!");
                        break;
                    case 4:
                        System.out.println("Keep up the good work!");
                        break;
                }
                counterCorrect ++;
            }
            else
            {
                switch (randNum)
                {
                    case 1:
                        System.out.println("No. Please try again.");
                        break;
                    case 2:
                        System.out.println("Wrong. Try once more.");
                        break;
                    case 3:
                        System.out.println("Don't give up!");
                        break;
                    case 4:
                        System.out.println("No. Keep trying.");
                        break;
                }
            }
            return counterCorrect;
        }
        public static void percentCalc( double counterCorrect){
            double percent = (counterCorrect / 10)* 100;
            if (percent >= 75 )
            {
                System.out.println("You got " + counterCorrect + " right. Your Percentage is "+percent);
                System.out.println("Congratulations, you are ready to go to the next level!");
            }
            else
            {
                System.out.println("You got " + counterCorrect + " right. Your Percentage is "+percent);
                System.out.println("Please ask your teacher for extra help");
            }

        }
    public static void main(String[] args)
    {
        int lvl, arith;
        lvl = levelChoice();
        arith = arithChoice();
        cai(lvl, arith);
        doAgain(lvl, arith);
    }
}