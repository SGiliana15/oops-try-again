package org.example;

import java.util.Scanner;

public class App {
  public static int getInput() {
    System.out.println("Please enter a value");
    Scanner input = new Scanner(System.in);
    int num = input.nextInt();
    while (!inputIsValid(num)){
      System.out.println("Your value is invalid");
      System.out.println("Please enter a value");
      num = input.nextInt();
    }
    System.out.println("The value chosen by the user is " + num);
    input.close();
    return 0;
  }

  public static boolean inputIsValid(int num){
    if (num < 0 || num > 100){
      return false;
    }
    
    return true;
  }
  public static void main(String[] args) {
    // Test your function here in a driver program
    getInput();
  }
}
