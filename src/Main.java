import com.beveragemachine.BeverageType;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter name of beverage (like ==> Tea , Latte , Cappuccino , Mocha ) : ");
    String userInput = scanner.next();

    BeverageType beverageType = BeverageType.valueOf(userInput);
    int index = beverageType.ordinal();
    System.out.println("You have drunk "  + beverageType + " this morning!");
    System.out.println(beverageType +" index is : " + index);



  }
}