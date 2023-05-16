import java.util.Scanner;

public class Main
{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String[] identificaciones = new String[50];
        String[] nombres = new String [50];
        String[] aerolineas = new String [50];
        double[] vLunes = new double [50];
        double[] vMartes = new double [50];
        double[] vMiercoles = new double [50];
        double[] vJueves = new double [50];
        double[] vViernes = new double [50];

        int numeroVendedores;
        String identificacion, nombre, aerolinea;
        double lunes, martes, miercoles, jueves, viernes;
        double promedio = 0;

        System.out.print("Digite la cantidad de vendedores: ");
        numeroVendedores = sc.nextInt();

        for(int i = 0; i < numeroVendedores; i++){
            System.out.print("Digite la identificacion del vendedores: ");
            identificacion = sc.next();
            System.out.print("Digite la nombre del vendedor: ");
            nombre = sc.next();
            System.out.print("Digite nombre de la aerolinea: ");
            aerolinea = sc.next();
            System.out.print("Digite las ventas del lunes de " + nombre + ": ");
            lunes = sc.nextDouble();
            System.out.print("Digite las ventas del martes de " + nombre + ": ");
            martes = sc.nextDouble();
            System.out.print("Digite las ventas del miercoles de " + nombre + ": ");
            miercoles = sc.nextDouble();
            System.out.print("Digite las ventas del jueves de " + nombre + ": ");
            jueves = sc.nextDouble();
            System.out.print("Digite las ventas del viernes de " + nombre + ": ");
            viernes = sc.nextDouble();

            identificaciones[i] = identificacion;
            nombres[i] = nombre;
            aerolineas[i] = aerolinea;
            vLunes[i] = lunes;
            vMartes[i] = martes;
            vMiercoles[i] = miercoles;
            vJueves[i] = jueves;
            vViernes[i] = viernes;

        }
        for(int i = 0; i < numeroVendedores; i++){
            promedio = promedio + ((vLunes[i] + vMartes[i] + vMiercoles[i] + vJueves[i] + vViernes[i]) / 5) / numeroVendedores;
        }

        System.out.println("El promedio de notas es: " + promedio);
    }
}
