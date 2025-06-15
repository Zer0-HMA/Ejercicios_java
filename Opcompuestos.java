import java.util.Scanner; // importado para el ejercicio 4 

public class Opcompuestos {
  public static void main(String[] args) {
    System.out.println("Primer ejercicio");
    int n = 1;
    while (n <= 1000) {
      n *= 2;
      System.out.println(n);
    }
    System.out.println("Segundo ejercicio");
    int c = 100;
    while (c >= 0) {
      c -= 7;
      System.out.println(c);
    }
    System.out.println("tercer ejercicio");
    int g = 50;
    while (g >= 1) {
      System.out.println(g);
      g /= 2;
    }

    System.out.println("Cuarto ejercicio");
    int total = 0;
    Scanner sc = new Scanner(System.in);
    int cont = 1;
    while (cont <= 5) {
      System.out.println("Dame 5 numeros separados por un espaciio ( " + cont + " ) de 5");
      int numuser1 = sc.nextInt();

      total += numuser1;
      System.out.println("Suma parcial: " + total);
      cont++;
      System.out.println("El numero que escojiste mas la suma del total es " + total);

    }
    sc.close();
  }
}
