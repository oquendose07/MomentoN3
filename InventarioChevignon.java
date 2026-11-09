import java.util.Scanner;

public class InventarioChevignon {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String[] referencias = {"Chaqueta Cuero Icon", "Jean Slim Fit", "Camiseta Polo Leather", null, null};
        int opcionMenu = 0;

        do {
            System.out.println("\n--- INVENTARIO CHEVIGNON ---");
            System.out.println("1. Listar Referencias");
            System.out.println("2. Buscar Referencia");
            System.out.println("3. Agregar Referencia");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            
            opcionMenu = leer.nextInt();

            switch (opcionMenu) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    System.out.println("Cerrando aplicación...");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcionMenu != 4);
    }
}