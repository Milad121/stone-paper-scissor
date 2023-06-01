import play.Paper;
import play.Scissor;
import play.Stone;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;


public class start {

    //    //   List<Paper> papers = new ArrayList<>();
////   List<Stone> stones = new ArrayList<>();
////   List<Scissor> scissors = new ArrayList<>();
//    static int  user;
//    static int sys;
//
//    public Void started() {
//        List<Scissor> scissors = new ArrayList<>();
//        List<Stone> stones = new ArrayList<>();
//        List<Paper> papers = new ArrayList<>();
//
//        for (Paper paper : papers) {
//
//            for (Stone stone : stones) {
//
//                for (Scissor scissor : scissors) {
//
//                    if (stone.getStone() == scissor.getScissor()) {
//                        user++;
//                    }
//                    if (paper.getPaper() == stone.getStone()) {
//                        user++;
//
//                    }
//                    if (paper.getPaper() == scissor.getScissor()) {
//                        user++;
//                    } else {
//                        sys++;
//                    }
//                    Random rn = new Random();
//                    int ran = rn.nextInt(1, 4);
//                    System.out.println(ran);
//
//                    if (ran == 1) {
//                        stone.getStone();
//                    }
//                    if (ran == 2) {
//                        scissor.getScissor();
//                    }
//                    if (ran == 3) {
//                        paper.getPaper();
//                    }
//
//                    Scanner scanner = new Scanner(System.in);
//
//
//
//                }
//            }
//
//        }
//        return null;
//    }
//
//
//
    // boolean result1 = true;
    // while(result1)
//
    // {
    //public static void result() {


    // }

    static int user;
    static int com;

    public static String User(Scanner scanner) {
        System.out.println("pls choice");
        String userChoice = scanner.nextLine();
        return userChoice;
    }

    public static String winner(String system1, String userChoice) {
String winner = "";

        if (system1.equals("stone") && userChoice.equals("scissor")) {
            winner = "computer";
        }
        if (system1.equals("stone") && userChoice.equals("paper")) {
            winner = "user";
        }
        if (system1.equals("stone") && userChoice.equals("stone")) {
            winner = "equals";
        }
        if (system1.equals("scissor") && userChoice.equals("scissor")) {
            winner = "equals";
        }
        if (system1.equals("scissor") && userChoice.equals("paper")) {
            winner = "computer";
        }
        if (system1.equals("scissor") && userChoice.equals("stone")) {
            winner = "user";
        }
        if (system1.equals("paper") && userChoice.equals("stone")) {
            winner = "computer";
        }
        if (system1.equals("paper") && userChoice.equals("scissor")) {
            winner = "computer";
        }

        if (system1.equals("paper") && userChoice.equals("paper")) {
            winner = "equals";
        }

        System.out.println("winner is "+winner);


return winner;

    }

    public static String randomi() {
        Random rn = new Random();
        int ran = rn.nextInt(1, 4);
        String Computer = "";

        if (ran == 1) {
            Computer = "stone";
        }
        if (ran == 2) {
            Computer = "paper";
        }
        if (ran == 3) {
            Computer = "scissor";
        }
        System.out.println("computer choice is  " + Computer);
        return Computer;


    }


    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);


        String userChoice = User(scanner);
        String computer = randomi();

        String result = winner(computer, userChoice);


    }
}




