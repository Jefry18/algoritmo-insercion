package com.company;
import java.util.Scanner;
import javax.swing.JOptionPane;
public class algoritmo {
    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);
        String nombre[], falla[], auxn;
        int arreglo[], nElemento, pos, aux;
        System.out.println("Ordenamiento por edad de mayor a menor!");
        nElemento = Integer.parseInt(JOptionPane.showInputDialog("Digite cantidad de personas a evaluar: "));

        arreglo = new int[nElemento];
        nombre = new String[nElemento];
        falla = new String[nElemento];

        System.out.println("Nombre & Edad ");
        for (int i = 0; i <nElemento; i++){
            System.out.println((i+1)+". Digite el nombre: ");
            nombre[i] = r.nextLine();
            System.out.println((i+1)+". Digite la edad: ");
            arreglo[i] = r.nextInt();
            falla[i] = r.nextLine();
        }

        for (int i = 0; i <nElemento; i++){
            pos = i;
            aux = arreglo[i];
            auxn = nombre[i];

            while((pos>0) && (arreglo[pos-1] < aux)){
                arreglo[pos] = arreglo[pos-1];
                nombre[pos] = nombre[pos-1];
                pos--;
            }
            arreglo[pos] = aux;
            nombre[pos] = auxn;
        }
        System.out.println("Personas mayores : ");
        for(int i=0;i<nElemento;i++){
            System.out.println(nombre[i]+" "+arreglo[i]+" anios ");
        }
        System.out.println("");
    }
}
