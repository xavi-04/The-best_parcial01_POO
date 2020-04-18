package com.XAQC.x00048219;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<Documento> documento = new ArrayList<>();
        ArrayList<Empleado> empleado = new ArrayList<>();
        Empresa unaEmpresa = new Empresa();
    byte op = 0;
    byte op1 = 0;
        do {
            menu();
            op =in.nextByte();in.hasNextLine();

            switch (op){
                case 1:
                    do {
                        subMenu();
                        op1 = in.nextByte(); in.nextLine();

                        switch (op1) {
                            case 1:
                                break;
                            case 2:
                                break;
                            case 3:
                                break;
                            default:
                                System.out.println("Opción incorecta");
                                break;
                        }
                    }while(op1 != 3);
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    return;
                default:
                    System.out.println("Opción incorrecta");
                    break;
            }

        }while(op != 0);
    }
    static void menu(){
        System.out.println("\t\n\n~Bienvenidos~");
        System.out.println("1) Agregar empleado");
        System.out.println("2) Despedir empleado");
        System.out.println("3) Ver lista de empleado");
        System.out.println("4) Calcular sueldo");
        System.out.println("5) Mostar totales");
        System.out.println("6) Salir");
        System.out.print("   Opción: ");
    }
    static void subMenu(){
        System.out.println("\t\n\nTipo de empleado");
        System.out.println("1) Servicio Profesional");
        System.out.println("2) Plaza fija");
        System.out.println("3) Atrás");
        System.out.print("   Opción: ");
    }
}
