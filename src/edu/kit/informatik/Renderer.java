package edu.kit.informatik;

/**
 * {@code Renderer} is responsible to render the game by
 * outputting text.
 *
 * Number of {@code Renderer} instance is strictly one (singleton);
 * doing this prevents more than one {@code Renderer} to attempt
 * printing.
 *
 * @author ufzwe
 * @version 1.0
 */
public final class Renderer {
    private static Renderer instance;

    private static final String MOTD = """
                                               _.-^-._    .--.
                                            .-'   _   '-. |__|
                                           /     |_|     \\|  |
                                          /               \\  |
                                         /|     _____     |\\ |
                                          |    |==|==|    |  |
                      |---|---|---|---|---|    |--|--|    |  |
                      |---|---|---|---|---|    |==|==|    |  |
                    ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
                    ^^^^^^^^^^^^^^^ QUEENS FARMING ^^^^^^^^^^^^^^^
                    ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
            """;

    private Renderer() {
        draw(MOTD);
    }

    /**
     * Fetches the {@code Renderer} instance to perform
     * various actions. Make sure only one instance of {@code Renderer} exists.
     *
     * @return instance of {@code Renderer}
     */
    public static Renderer getInstance() {
        if (instance == null) {
            instance = new Renderer();
        }

        return instance;
    }

    private void draw(String string) {
        System.out.println(string);
    }
}
