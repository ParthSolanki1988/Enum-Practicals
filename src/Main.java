import com.beveragemachine.BeverageType;

import java.util.Objects;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

  //ordinal() print index
    //BeverageType.values() print Enum object value

    for (BeverageType beverages : BeverageType.values()) {
      System.out.println("Index : " + beverages.ordinal() + "  | Beverage : " +beverages);
    }


  }
}