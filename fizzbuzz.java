import java.util.Arrays;
import java.util.ArrayList;
import java.util.Scanner;

public class fizzbuzz {

  public static void fizzBuzz() {
    ArrayList<String> fizzy = new ArrayList<String>();
    for (int i = 1; i <= 100; i++) {
      if (i % 3 == 0) {
        System.out.println("Fizz");
        fizzy.add("Fizz");
      }
      else if (i % 5 == 0) {
        System.out.println("Buzz");
        fizzy.add("Buzz");
      }
      else {
        System.out.println(i);
        fizzy.add("" + i);
      }
    }
   
  }

  public static void main(String[] args) {
    fizzBuzz();

    Scanner fetch = new Scanner(System.in);

    System.out.println("Try a number yourself!");

    int n = fetch.nextInt();

    if (n % 15 == 0) {
      System.out.println("FizzBuzz");
    }
    else if (n % 3 == 0) {
      System.out.println("Fizz");
    }
    else if (n% 5 == 0) {
      System.out.println("Buzz");
    }
    else if (n % 3 != 0 && n % 5 != 0 && n % 15 != 0) {
      System.out.println("Try another number!");
    }
  }

}