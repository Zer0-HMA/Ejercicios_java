import java.util.Scanner;

public class day2coma1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Ingresa tu edad: ");
    int edad = sc.nextInt();

    if (edad == 18) {
      System.out.println("Ya eres legal");
    } else if (edad >= 18) {
      System.out.println("Ya estas mayorcito capibara");
    } else if (edad <= 30) {
      System.out.println("Ya eres adulto bro");
    } else if (edad >= 64) {
      System.out.println("Ya estas anciano ya ve por tu pension");
    } else {
      System.out.println("Sigues como los que traigo, todo mocoso");
    }
  }
}
