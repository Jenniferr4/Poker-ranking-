package com.improving.poker;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        var deck = new Deck();
        var poker = new PokerEvaluator();
        for (int i = 0; i < 7; i++) {
            System.out.println(deck.draw().toString());
        }
        System.out.println("Done");
    }
}
