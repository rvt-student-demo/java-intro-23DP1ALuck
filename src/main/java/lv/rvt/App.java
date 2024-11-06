package lv.rvt;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


class App{
    public static void main(String[] args) {

        System.out.println("Part 1,2");

        PaymentCard card = new PaymentCard(50);
        System.out.println(card);

        card.eatAffordably();
        System.out.println(card);

        card.eatHeartily();
        card.eatAffordably();
        System.out.println(card);

        System.out.println("Part 3");
        PaymentCard card33 = new PaymentCard(5);
        System.out.println(card33);

        card33.eatHeartily();
        System.out.println(card33);

        card33.eatHeartily();
        System.out.println(card33);

        System.out.println("Part 4");

        PaymentCard card2 = new PaymentCard(10);
        System.out.println(card2);

        card2.addMoney(15);
        System.out.println(card2);

        card2.addMoney(10);
        System.out.println(card2);

        card2.addMoney(200);
        System.out.println(card2);

        System.out.println("Part 5");
        PaymentCard card3 = new PaymentCard(10);
        System.out.println("Paul: " + card3);
        card.addMoney(-15);
        System.out.println("Paul: " + card3);

        System.out.println("Part 6");

        PaymentCard paulsCard = new PaymentCard(20);
        PaymentCard mattsCard = new PaymentCard(30);

        paulsCard.eatHeartily();
        mattsCard.eatAffordably();
        
        System.out.println("Paul: " + paulsCard);
        System.out.println("Matt: " + mattsCard);

        paulsCard.addMoney(20);
        mattsCard.eatHeartily();

        System.out.println("Paul: " + paulsCard);
        System.out.println("Matt: " + mattsCard);

        paulsCard.eatAffordably();
        paulsCard.eatAffordably();
        mattsCard.addMoney(50);

        System.out.println("Paul: " + paulsCard);
        System.out.println("Matt: " + mattsCard);
    }    
}

