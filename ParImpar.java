public class ParImpar {
    public static void main(String[] args) {
        int numero;

        System.out.println("Ingrese un número entero: ");
        numero = Integer.parseInt(System.console().readLine());

        if (numero % 2 == 0) {
            System.out.println("El número es PAR");
        } else {
            System.out.println("El número es IMPAR");
        }
    }
}
