import java.util.Scanner;

public class Juego_ahorcado {
    public static void main(String[] args) throws Exception {

        // Clase Scanner para que el usuario pueda escribir desde teclado
        Scanner scanner = new Scanner(System.in);

        // Variables a utilizar
        String palabra_secreta = "comfortable";
        int max_intentos = 10;
        int intentos = 0;
        boolean palabra_descubierta = false;

        // Array
        char[] letra_descubierta = new char[palabra_secreta.length()];

        // Estructura de control para imprimir guion bajo segun la longitud de la
        // palabra
        for (int i = 0; i < letra_descubierta.length; i++) {
            letra_descubierta[i] = '_';
        }

        // Estructura de control iterativa
        while (!palabra_descubierta && intentos < max_intentos) {

            System.out.println("Palabra a adivinar: " + String.valueOf(letra_descubierta) + " ("
                    + palabra_secreta.length() + " letras)");

            System.out.println("Usuario, introduzca una letra, por favor");

            char letra = Character.toLowerCase(scanner.next().charAt(0));

            boolean letraCorrecta = false;

            // Estructura de control iterativa
            for (int i = 0; i < palabra_secreta.length(); i++) {

                // Estructurad de control condicional
                if (palabra_secreta.charAt(i) == letra) {
                    letra_descubierta[i] = letra;
                    letraCorrecta = true;

                }

            }

            if (!letraCorrecta) {
                intentos++;
                System.out.println("Mala suerte, te quedan " + (max_intentos - intentos) + " intentos");

            }

            if (String.valueOf(letra_descubierta).equals(palabra_secreta)) {
                palabra_descubierta = true;
                System.out.println("En hora buena, has adivinado la palabra secreta: " + palabra_secreta);

            }

        }
        if (!palabra_descubierta) {
            System.out.println("Te quedaste sin intentos");

        }
        scanner.close();

    }
}
