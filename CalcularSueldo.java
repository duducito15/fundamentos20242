public class CalcularSueldo {
    public static void main(String[] args) {
        int horasTrabajadas;
        double costoHora, sueldo;
        // Entrada
        horasTrabajadas = Integer.parseInt(System.console().readLine());
        costoHora = Integer.parseInt(System.console().readLine());
        // Proceso
        sueldo = horasTrabajadas * costoHora;
        // Salida
        System.out.println(sueldo);
    }
}