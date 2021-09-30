package task9.Classes;

import java.util.ArrayList;
import java.util.Locale;

public class Basket {
    private ArrayList<Ball> ballsList;

    public Basket() {
        this.ballsList = new ArrayList<>();
    }

    public void addBall(Ball ball) {
        if (ball == null) return;
        this.ballsList.add(ball);
    }

    public void print() {
        for (Ball ball : ballsList) {
            System.out.println(ballsList.indexOf(ball) + ". Color: " + ball.getColor() + "; Weight: " + ball.getWeight());
        }
    }

    public int allBallsWeight() {
        return ballsList.stream()
                .mapToInt(Ball::getWeight)
                .sum();
    }


    public int concreteColorBallsQuantity(String color) {
        int quantity = 0;
        for (Ball ball : ballsList) {
            if (ball.getColor().equals(color.trim().toLowerCase(Locale.ROOT))) {
                quantity++;
            }
        }
        return quantity;
    }
}
