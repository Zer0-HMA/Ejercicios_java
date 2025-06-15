import java.util.Scanner;

public class menus1 {
  public static void main(String[] args) {
    Scanner wr = new Scanner(System.in);
    int op = 0;
    while (op != 4) {
      System.out.println("\n =====Menu principal ====");
      System.out.println("Opciones del menu: ");
      System.out.println("1. Mostrar tu nombre");
      System.out.println("2. Calcular el doble de un numero");
      System.out.println("3. Mostrar si un numero es par o impar");
      System.out.println("4. salir");
      System.out.println("Escoje una opcion");

      op = wr.nextInt();
      switch (op) {
        case 1:
          System.out.println("Ingresa tu nombre: ");
          String n = wr.next();
          System.out.println("Hola " + n);

          break;
        case 2:
          System.out.println("Dame tu numero que quieres doblar: ");
          int a = wr.nextInt();
          System.out.println("Tu numero al doble es: " + a * 2);
        case 3:
          System.out.println("Ingresa el numero para saber si es par o impar: ");
          int b = wr.nextInt();
          if (b % 2 == 0) {
            System.out.println("Tu numero es par");
          } else
            System.out.println("Tu numero es impar");

      }

    }
  }

}
