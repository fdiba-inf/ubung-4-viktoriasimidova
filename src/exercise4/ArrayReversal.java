package exercise4;

import java.util.Scanner;

public class ArrayReversal {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter size: ");
        int size = input.nextInt();

        char[] symbols = new char[size];

        System.out.println("Enter numbers: ");
        for (int index = 0; index < symbols.length; index++) {
            symbols[index] = input.next().charAt(0);

        }

       System.out.print("Reversed symbols: [");
        for (int index = symbols.length - 1; index >= 0; index--) {
          System.out.print(symbols[index]);
          if (index != 0) {
            System.out.print(", ");
          }
        }

       System.out.println("]");

        }
        
    }