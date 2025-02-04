public class OpeBasicas {
    public static void main(String[] args) {
        // Declarando las variables
        int numero1, numero2, suma, resta, producto;
        double division;
        // ENTRADA: Leyendo datos de entrada
        numero1 = Integer.parseInt(System.console().readLine());
        numero2 = Integer.parseInt(System.console().readLine());
        // PROCESO: Realizando las operaciones
        suma = numero1 + numero2;
        resta = numero1 - numero2;
        producto = numero1 * numero2;
        division = numero1 / numero2;
        //SALIDA: mostrando los resultados
        System.out.println(suma);
        System.out.println(resta);
        System.out.println(producto);
        System.out.println(division);
    }
}