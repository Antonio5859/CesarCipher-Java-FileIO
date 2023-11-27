import java.util.Scanner;

public class CifradoCesarProyecto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        //  El menu se veria asi:
//   |------------------------------------------|
//   |      Elije una opción:                   |
//   |          1. Cifrar                       |
//   |          2. Descifrar                    |
//   |          3. Descifrar por fuerza bruta   |
//   |          4. Descifrar por estadística    |
//   |          5. Salir                        |
//   |------------------------------------------|

        //                <<< Procedimiento >>>
        // Primero se recibe una entrada de teclado para la opcion
        // En una variable guardo la opcion elegida por el usuario.
        // Capturar la eleccion de la opcion
        // Crear los metodos para cifrar, descifrar y todo lo que necesitemos.
        // Si la opcion es invalida el default muestra un mensaje de orientacion/ayuda/sugerencias al usuario.
        //
// ---  ---  ---  ---  ---  ---  ---  ---  ---  ---  ---  ---  ---  ---  ---  ---  ---  ---  ---  ---  


        int eligeOpcion;

        while (true) {
            // Mostrar el menú de opciones
            System.out.println("Elije una opción:");
            System.out.println("1. Cifrar");
            System.out.println("2. Descifrar");
            System.out.println("3. Descifrar por fuerza bruta");
            System.out.println("4. Descifrar por estadística");
            System.out.println("5. Salir");


            System.out.print("Ingrese el número de opción: ");

            if (scanner.hasNextInt()) {
                eligeOpcion = scanner.nextInt();

                // Limpiar el búfer de entrada
                scanner.nextLine();

                // Procesar la opción del usuario
                switch (opcion) {
                    case 1:
                        cifrarArchivo(scanner);
                        break;
                    case 2:
                        descifrarArchivo(scanner);
                        break;
                    case 3:
                        descifrarFuerzaBruta(scanner);
                        break;
                    case 4:
                        descifrarPorEstadistica(scanner);
                        break;
                    case 5:
                        System.exit(0);      // Usando lo que nos recomendo Ivan para salir
                    default:
                        System.out.println("Tu opción es invalida elije entre: 1, 2, 3, 4, 5.");
                }
            } else {
                System.out.println("Opción inválida. Por favor, ingrese un número válido.");
            }
        }
    }

    private static void cifrarArchivo(Scanner scanner) {
        //   <<pendiente>>
    }

    private static void descifrarArchivo(Scanner scanner) {
        //   <<pendiente>>
    }

    private static void descifrarFuerzaBruta(Scanner scanner) {
        //   <<pendiente>>
    }

    private static void descifrarPorEstadistica(Scanner scanner) {
        //   <<pendiente>>
    }
}
