import java.util.Scanner;

class C1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = "";

    int n = sc.nextInt();

    if (n >= 0 && n <= 1000) {
      if (n % 2 == 0) {
        s = "ODD";
      } else {
        s = "EVEN";
      }
    }
    System.out.println(s);
  }
}