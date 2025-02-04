public class Multiplo {
    public static void main(String[] args) {
        int numero;
        System.out.println("Ingrese un número entero: ");
        numero = Integer.parseInt(System.console().readLine());

        if ((numero % 3 == 0) && (numero % 5 == 0)) {
            System.out.println("Si cumple");
        } else {
            System.out.println("No cumple");
        }
    }
}