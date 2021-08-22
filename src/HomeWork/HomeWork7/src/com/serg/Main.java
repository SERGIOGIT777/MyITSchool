package HomeWork.HomeWork7.src.com.serg;

import java.awt.*;

public class Main {

    public static final String ANSI_RESET = "\u001B[0m";
    //public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    //public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    //public static final String ANSI_PURPLE = "\u001B[35m";
    //public static final String ANSI_CYAN = "\u001B[36m";
    //public static final String ANSI_WHITE = "\u001B[37m";

    public static void main(String[] args) {
        var rubik = new Color[6][3][3];
        for (int i = 0; i < 6; i++) {
            if (i < 3) {
                for (int j = 0; j < 3; j++) {
                    for (int h = 0; h < 1; h++) {
                        System.out.print(ANSI_GREEN + rubik[i][j][h] + " " + ANSI_RESET);
                    }
                }
                for (int j = 0; j < 3; j++) {
                    for (int h = 1; h < 2; h++) {
                        System.out.print(ANSI_RED + rubik[i][j][h] + " " + ANSI_RESET);
                    }
                }
                for (int j = 0; j < 3; j++) {
                    for (int h = 2; h < 3; h++) {
                        System.out.print(ANSI_BLUE + rubik[i][j][h] + " " + ANSI_RESET);
                    }
                }
                System.out.println("\n");
            } else {
                for (int j = 0; j < 3; j++) {
                    for (int h = 0; h < 1; h++) {
                        System.out.print(ANSI_BLUE + rubik[i][j][h] + " " + ANSI_RESET);
                    }
                }
                for (int j = 0; j < 3; j++) {
                    for (int h = 1; h < 2; h++) {
                        System.out.print(ANSI_GREEN + rubik[i][j][h] + " " + ANSI_RESET);
                    }
                }
                for (int j = 0; j < 3; j++) {
                    for (int h = 2; h < 3; h++) {
                        System.out.print(ANSI_RED + rubik[i][j][h] + " " + ANSI_RESET);
                    }
                }
                System.out.println("\n");
            }
        }
    }
}

