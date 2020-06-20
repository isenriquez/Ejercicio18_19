/*
Implemente un algoritmo de entenamiento que permita ingresar el objeto y tambien
permita ingresarel tipo de variable que conlleva cada atributo que se le asigne.
 */
package ejercicio18_19;

import java.util.Scanner;

/**
 *
 * @author ISRAEL ENRIQUEZ
 */
public class Ejercicio18_19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner objeto=new Scanner(System.in);//new rerva espacio de memoria
        System.out.println("UNIVERSIDAD DE LAS FUERZAS ARMADAS ESPE");
        System.out.println("MOODELAMIENTO DE CLASES Y OBJETOS");
        System.out.println("Objetos y declaracion de variables");
        System.out.println("Ingrese el Objeto");
        String obj=objeto.nextLine();
        System.out.println("Ingrese los objetos a reacionar:");
        String o1=objeto.nextLine();
        String o2=objeto.nextLine();
        String o3=objeto.nextLine();
        System.out.println("Seleccione el objeto a tratar:");
        String ob1=objeto.nextLine();
        System.out.println("Ingrese los atributos:");
        String at1=objeto.nextLine();
        String at2=objeto.nextLine();
        String at3=objeto.nextLine();
        String at4=objeto.nextLine();
        System.out.println("Ingrese la funcionalidad:");
        String fun1=objeto.nextLine();
        String fun2=objeto.nextLine();
        String fun3=objeto.nextLine();
        String fun4=objeto.nextLine();
        System.out.println("Ingrese el tipo de variable :");
        String tip1=objeto.nextLine();
        String tip2=objeto.nextLine();
        String tip3=objeto.nextLine();
        String tip4=objeto.nextLine();
    }

}
