public class Ejemplo1 {
    public static void main(String[] args) {
        // Capturar las dimensiones de la piscina: Largo, ancho y profundidad 
        int largo, ancho, profundidad;

        System.out.println("Ingrese el largo de la piscina: ");
        largo = Integer.parseInt(System.console().readLine());
        System.out.println("Ingrese el ancho de la piscina: ");
        ancho = Integer.parseInt(System.console().readLine());
        System.out.println("Ingrese la profundidad de la piscina: ");
        profundidad = Integer.parseInt(System.console().readLine());

        // Calcular el volumen
        int volumen = largo * ancho * profundidad;

        //Mostrar el volumen calculado
        System.out.println("El volumen de la piscina es: "+volumen);


    }
}
