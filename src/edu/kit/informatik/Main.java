package edu.kit.informatik;

import java.util.Scanner;

/**
 * Main program to play Queens Farming game
 *
 * @author ufzwe
 * @version 1.0
 */

public final class Main {
    private static final String COMMAND_QUIT = "quit";

    private Main() {
    }

    /**
     * Starting point of the game.
     * Read user input as commands and perform appropriate actions
     *
     * @param args an array of command line arguments
     */
    public static void main(String[] args) {
        // Initialize IO
        final Scanner scanner = new Scanner(System.in);
        String input;

        final CommandHandler commandHandler = new CommandHandler();

        do {
            input = scanner.nextLine();
        } while (!input.equals(COMMAND_QUIT));

        scanner.close();
    }
}
