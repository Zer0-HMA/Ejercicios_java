public class day2 {
  public static void main(String[] args) {
    System.out.println("Ejercicio 1");
    int edad = 21;
    String nombre = "miguel";
    Boolean esmayor = true;
    System.out.println("Su nombre es " + nombre);
    System.out.println("La edad de " + nombre + " es " + edad);
    System.out.println(nombre + " ¿Es mayor? " + esmayor);

    System.out.println("Ejercicio 2");
    int nota = 7;
    if (nota >= 7) {
      System.out.println("Aprobado");
    } else {
      System.out.println("No aprobaste fidel jajaja");
    }

    System.out.println("Ejercicio 3 : Clasificacion de calificaciones");
    int notanew = 10;

    if (notanew == 10 || notanew == 9) { // En esta parte me acorde de la compuerta OR y vi que se podia hacer con el ||
                                         // y ya jaja que es un x es o puede ser xy (Algo asi me doy a entender jaja)
      System.out.println("Sacaste " + notanew + " felicidades");
    } else if (notanew >= 8) {
      System.out.println("Eres bueno sacaste = " + notanew);
    } else if (notanew == 7) {
      System.out.println("Hechale mas ganas chavo sacaste " + notanew);
    } else { // No lleva condicional ya que si no se cumple el if pues salta el mensaje de
             // abajo o lo que haya
      System.out.println("Estas reprobado amigo");
    }
  }
}
