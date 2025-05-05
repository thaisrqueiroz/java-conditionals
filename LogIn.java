import java.util.Scanner;

public class LogIn {
    public static void main(String[] args) {
        //Escribe un programa que pida al usuario ingresar un nombre de usuario y una constraseña, si son iguales a los datos dados imprimirá en terminal: Acceso concedido, si no son iguales imprimirá en terminal: Nombre de usuario o contraseña incorrecta.
        //Averigua como hacer para poder ingresar el dato justo al lado de lo que termine la pregunta, es decir, que no haga un salto de línea.

        String userData = "usuario.ejemplo";
        String passwordData = "71NSDHsdf53&7#@d";
        
        Scanner login = new Scanner(System.in);

        System.out.print("Usuario: ");
        String user = login.nextLine();

        System.out.print("Contraseña: ");
        String password = login.nextLine();

        if (user.equals(userData) && password.equals(passwordData)) {
            System.out.println("Acceso concedido");
        } else {
            System.out.println("Nombre de usuario o contraseña incorrecta");
        }

        login.close();
    }
}