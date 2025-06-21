public class bucles1 {
  public static void main(String[] args) {
    System.out.println("Con ciclo for");
    int menos = 10;
    for (menos = 10; menos >= 1; menos--)
      System.out.println(menos);
    menos--;

    System.out.println("Con el ciclo while");
    int pares = 2;
    while (pares <= 20) {
      System.out.println(pares);
      pares += 2;
    }

  }

}
