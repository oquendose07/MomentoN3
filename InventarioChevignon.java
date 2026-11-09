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
            leer.nextLine();

            switch (opcionMenu) {
                case 1:
                    System.out.println("\n--- Lista de Referencias ---");
                    for (String prenda : referencias) {
                        if (prenda != null) {
                            System.out.println("- " + prenda);
                        }
                    }
                    break;
                case 2:
                    break;
                case 3:
                    System.out.print("Ingrese el nombre de la nueva prenda: ");
                    String nuevaPrenda = leer.nextLine();
                    
                    for (int i = 0; i < referencias.length; i++) {
                        if (referencias[i] == null) {
                            referencias[i] = nuevaPrenda;
                            System.out.println("Prenda agregada exitosamente.");
                            break;
                        }
                    }
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