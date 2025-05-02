import java.util.Scanner;

public class TrafficLights {
    public static void main(String[] args) {

        //Escribe un programa que basado en el color del semáforo verde, amarillo o rojo determine las acciones de un conductor 
        
        //Si es verde imprime en la terminal: Puedes seguir
        //Si es amarillo imprime en la terminal: Ten cuidado
        //Si es rojo imprime en la terminal: ¡¡¡Para!!!
        //Si es otro color imprime en la terminal: El semáforo está dañado

        //Cambia el valor de la variable, corre el programa y mira el resultado 

        System.out.println("Escriba el color del semáforo:");

        Scanner trafficLights = new Scanner(System.in);
        String trafficColour = trafficLights.nextLine();

        switch (trafficColour) {
            case "verde", "green":
                System.out.println("Puedes seguir");
                break;
            case "amarillo", "yellow":
                System.out.println("Ten cuidado");
                break;
            case "rojo", "red":
                System.out.println("¡¡¡Para!!!");
                break;
            default:
            System.out.println("El semáforo está dañado");
        }
    }
}