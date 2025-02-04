public class Promedio {
    public static void main(String[] args) {
        int nota1, nota2, nota3;
        double promedio;
        
        System.out.println("Ingrese nota 1: ");
        nota1 = Integer.parseInt(System.console().readLine());
        System.out.println("Ingrese nota 2: ");
        nota2 = Integer.parseInt(System.console().readLine());
        System.out.println("Ingrese nota 3: ");
        nota3 = Integer.parseInt(System.console().readLine());

        promedio = (double)(nota1+nota2+nota3) / 3;

        if (promedio >= 11) {
            System.out.println(promedio + " APROBADO");
        } else {
            if (promedio > 8 && promedio < 11) {
                System.out.println(promedio + " DESAPROBADO");
            } else {
                System.out.println(promedio + " REPROBADO");
            }
        }
    }
}
