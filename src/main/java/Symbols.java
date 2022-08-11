public enum Symbols {
    CHERRY(1, 10),
    BAR(2, 20),
    BELL(3, 30),
    LEMON(4, 40),
    SEVEN(5, 50);

    private final int value;
    private final int winnings;

    Symbols(int value, int winnings) {
        this.value = value;
        this.winnings = winnings;
    }

    public int getValue() {
        return value;
    }

    public int getWinnings() {
        return winnings;
    }
}
