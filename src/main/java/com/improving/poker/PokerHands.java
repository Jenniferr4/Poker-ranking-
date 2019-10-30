package com.improving.poker;

public enum PokerHands {
    HighCard(10),
    Pair(9),
    TwoPair(8),
    ThreeOfAKind(7),
    Straight(6),
    Flush(5),
    FullHouse(4),
    FourOfAKind(3),
    StraightFlush(2),
    RoyalFlush(1);

    private final int rank;

    PokerHands(int rank) {
        this.rank = rank;
    }

    public int getRank() {
        return rank;
    }

}
