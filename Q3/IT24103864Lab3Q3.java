import java.util.Scanner;


public class IT24103864Lab3Q3  {

    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);


      System.out.print("Enter the rupee amount: ");
      int amount = scanner.nextInt();

      int[] denominations = { 5000, 1000, 500, 200, 100, 50, 20, 10, 5, 2, 1 };
      int[] count = new int[denominations.length];

      for (int i = 0; i < denominations.length; i++) {
          NoteCount[i] = amount / denominations[i];
          amount %= denominations[i];
      }

      System.out.println("5000 Notes - " +noteCount[0]);
      System.out.println("1000 Notes - " +noteCount[1]);
      System.out.println("500 Notes - " +noteCount[2]);
      System.out.println("200 Notes - " +noteCount[3]);
      System.out.println("100 Notes - " +noteCount[4]);
      System.out.println("50 Notes - " +noteCount[5]);
      System.out.println("20 Notes - " +noteCount[6]);
      System.out.println("10 Notes - " +noteCount[7]);
      System.out.println("5 Notes - " +noteCount[8]);
      System.out.println("2 Notes - " +noteCount[9]);
      System.out.println("1 Notes - " +noteCount[10]);

      scanner.close();
  }
}

