public class MayorEdad {
    public static void main(String[] args) {
        int edad;
        //Entrada
        edad = Integer.parseInt(System.console().readLine());
        //Proceso
        if (edad >= 18) {
            //Salida
            System.out.println("Mayor de edad");
        }
        else{
            System.out.println("Menor de edad");
        }
    }
}
