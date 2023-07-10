package com.advanced.arrayfunctions;

import java.util.Arrays;

public class ArrayFunctionsApp {
    public static void main(String[] args) {
        int[] gamerPoints = new int[12];
        System.out.println(Arrays.toString(gamerPoints));

        System.out.println("All players starts with 200 points");
        Arrays.fill(gamerPoints, 200);
        System.out.println(Arrays.toString(gamerPoints));

        System.out.println("The first ten players lost 20 points.");
        Arrays.fill(gamerPoints, 0, 10,180 );
        System.out.println(Arrays.toString(gamerPoints));

        System.out.println("The 10th player gained 50 points");
        gamerPoints[9] += 50;
        System.out.println(Arrays.toString(gamerPoints));

        System.out.println("The gamer points in order ");
        Arrays.sort(gamerPoints);
        System.out.println(Arrays.toString(gamerPoints));

        System.out.println("The last five points");
        int [] lastFivePoints = Arrays.copyOf(gamerPoints, 5);
        System.out.println(Arrays.toString(lastFivePoints));

        System.out.println("The top five points");
        int [] topFivePoints = Arrays.copyOfRange(gamerPoints, 7, gamerPoints.length);
        System.out.println(Arrays.toString(topFivePoints));

        if(Arrays.equals(lastFivePoints, topFivePoints)) {
            System.out.println("The top five players have the same points as the last 5");
        } else {
            System.out.println("The top five players don't have the same points as the last 5");
        }

        gamerPoints[4] = 300;
        Arrays.sort(gamerPoints);
        if(Arrays.binarySearch(gamerPoints, 300) >=0) {
            System.out.println("Someone reached 300 points. The game is over!");
        } else {
            System.out.println("There is nobody who reached 300 points yet.");
        }


    }
}
