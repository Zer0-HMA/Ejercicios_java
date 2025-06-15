import java.util.Scanner;

public class day3 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Sistema de calificaciones1");
    System.out.println("Ingresa tu nombre: ");
    String nombre = sc.nextLine();
    System.out.println("Ingresa tu calificaion: ");
    int calf = sc.nextInt();
    if (calf == 10) {
      System.out.println("Felcicidades " + nombre + " calificacion perfecta");
    } else if (calf == 9 || calf == 8) {
      System.out.println("Muy bien " + nombre + " casi perfecto.");
    } else if (calf == 7) {
      System.out.println("Bien " + nombre + " pasaste apenas we");
    } else if (calf <= 6) {
      System.out.println("Lo siento " + nombre + " no aprobaste bro");
    } else {
      System.out.println("Numero no valido we, deja de andar jugando JAJJA");
    }

  }
}
