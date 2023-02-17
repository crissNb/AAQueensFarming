package edu.kit.informatik.backend;

public class Player {
    private final String name;
    private int gold;

    /**
     * Creates a new {@code Player} object with specified name as identifier
     * and gold to represent their financial status (has direct impact on
     * winning condition).
     *
     * @param name that will be used to identify this object
     * @param gold that the {@code Player} starts with
     */
    public Player(String name, int gold) {
        this.name = name;
        this.gold = gold;
    }

    /**
     * Get current balance of the {@code Player}
     *
     * @return current gold amount
     */
    public int getGold() {
        return gold;
    }

    /**
     * Change specified amount to the current balance of this
     * {@code Player}
     *
     * @param amount to add to current balance
     * @throws NoGoldException if player will have less than 0 gold after changes
     * @return current gold amount
     */
    public int changeGold(int amount) throws NoGoldException {
        if (gold + amount < 0) {
            throw new NoGoldException();
        }

        gold += amount;

        return gold;
    }

    /**
     * Get the name of this {@code Player}
     *
     * @return identifier of this {@code Player}
     */
    public String getName() {
        return name;
    }
}
