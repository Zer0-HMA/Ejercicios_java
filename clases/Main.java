public class Main {
  public static void main(String[] args) {
    Alumno a1 = new Alumno();
    a1.nombre = "humber";
    a1.calificacion = 8;

    Alumno a2 = new Alumno();
    a2.nombre = "Miguel";
    a2.calificacion = 8;

    System.out.println("Alumno 1: " + a1.nombre + " calificacion: " + a1.calificacion);

    System.out.println("Alumno 1: " + a2.nombre + " calificacion: " + a2.calificacion);

  }

}
