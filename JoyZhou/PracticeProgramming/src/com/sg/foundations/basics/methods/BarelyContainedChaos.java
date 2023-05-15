package com.sg.foundations.basics.methods;

import java.util.Random;

public class BarelyContainedChaos {

  public static void main(String[] args) {

        String color = randColor(); // call color method here
        String animal = randAnimal(); // call animal method again here
        String colorAgain = randColor(); // call color method again here
        int weight = randInt(5, 200); // call number method,
    // with a range between 5 - 200
        int distance = randInt(10, 20); // call number method,
    // with a range between 10 - 20
        int number = randInt(10000, 20000); // call number method,
    // with a range between 10000 - 20000
        int time = randInt(2, 6); // call number method,
    // with a range between 2 - 6

    System.out.println("Once, when I was very small...");

    System.out.println("I was chased by a " + color + ", "
            + weight + "lb " + " miniature " + animal
            + " for over " + distance + " miles!!");

    System.out.println("I had to hide in a field of over "
            + number + " " + colorAgain + " poppies for nearly "
            + time + " hours until it left me alone!");

    System.out.println("\nIt was QUITE the experience, "
            + "let me tell you!");
  }

  public static String randColor(){
    Random rng = new Random();

    String[] colors = new String[] { "red", "orange", "yellow", "green", "blue", "indigo", "violet"};
    int randomIndex = rng.nextInt( colors.length );
    return colors[randomIndex];
  }

  public static String randAnimal(){
    Random rng = new Random();

    String[] animals = new String[] { "dog", "cat", "mouse", "lion", "giraffe", "panda", "sheep", "horse"};
    int randomIndex = rng.nextInt( animals.length );
    return animals[randomIndex];
  }

  public static int randInt(int min, int max){
    Random rng = new Random();
    return rng.nextInt((max - min) + 1) + min;
  }
}
