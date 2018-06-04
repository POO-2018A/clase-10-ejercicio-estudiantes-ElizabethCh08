package estudiantes;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        Estudiantes[] estudiantes = new Estudiantes[5];

        for(int i = 0; i < estudiantes.length; i++) {
            System.out.println("Datos del estudiante " + (i+1));

            System.out.print("Nombre: ");
            String nombre = scan.nextLine();

            System.out.print("Apellido: ");
            String apellido = scan.nextLine();

            System.out.print("Cédula: ");
            String cedula = scan.nextLine();

            estudiantes[i] = new Estudiantes(nombre, apellido, cedula);

            System.out.println("Cuantas materias tiene el estudiante: " + (i+1));
            int numMaterias = scan.nextInt();
            String[] materias = new String[numMaterias];

            scan.nextLine();

            for(int j = 0; j < materias.length; j++){
                System.out.print("Nombre de materia " + (j + 1) + ": ");
                materias[j] = scan.nextLine();
            }

            estudiantes[i].setMaterias(materias);

            System.out.println("");
            System.out.println("");
        }


        System.out.println("\tINFORMACIÓN ESTUDIANTES ");

        for(int i = 0; i< estudiantes.length; i++){
            System.out.println("Estudiante " + (i+1) + ":");

            System.out.println("Nombre completo: " + estudiantes[i].getNombre() + " " + estudiantes[i].getApellido() +
                    " Cédula: " + estudiantes[i].getCedula() );


            System.out.println("\t MATERIAS");

            String[] materiasEst = estudiantes[i].getMaterias();
            for(int j = 0; j<materiasEst.length; j++) {
                System.out.println((j+1) + "- " + materiasEst[j]);
            }

            System.out.println(" ");
        }


    }
}