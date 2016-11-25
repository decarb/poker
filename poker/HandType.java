package poker;

public enum HandType {
    HIGH_CARD(0),
    PAIR(1),
    TWO_PAIR(2),
    THREE_KIND(3),
    STRAIGHT(4),
    FLUSH(5),
    FULL_HOUSE(6),
    FOUR_KIND(7),
    STRAIGHT_FLUSH(8),
    ROYAL_FLUSH(9);

    private int strength;

    HandType(int strength) {
        this.strength = strength;
    }
}
