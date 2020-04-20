package com.XAQC.x00048219;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        Empresa unaEmpresa = new Empresa("The best");
        ArrayList<Documento> documento = new ArrayList<>();
        ArrayList<Empleado> empleado = new ArrayList<>();

        int op = 0;
        String numero = null;
        double Salario = 0;
        int extension = 0, mesesContrato = 0;

        do {
            op = Integer.parseInt(JOptionPane.showInputDialog(null, menu()));

            switch (op){
                case 1:
                    String puesto = JOptionPane.showInputDialog(null,
                            "Puesto del empleado: ");

                    if (puesto.equals("Servicio profesional") || puesto.equals("servicio profesional")) {
                        String nombre = JOptionPane.showInputDialog(null,
                                "Nombre del empleado: ");
                        String documentox = JOptionPane.showInputDialog(null,
                                "Tipo de Documento (DUI/NIT):");
                        double salario = Integer.parseInt(JOptionPane.showInputDialog(null,
                                "Salario a pagar: "));
                        if (documentox.equals("DUI")||documentox.equals("dui")||documentox.equals("Dui")){
                            int numeroDocumento = Integer.parseInt(JOptionPane.showInputDialog(null,
                                    "Número de DUI del empleado: "));
                        }else{
                            JOptionPane.showInputDialog(null,
                                    "Número de NIT del empleado: ");

                            documento.add(new Documento(nombre, numero));

                        }
                        unaEmpresa.addEmpleado(new ServicioProfesional(nombre, puesto, Salario, mesesContrato));

                    }else{
                        String nombre = JOptionPane.showInputDialog(null,
                                "Nombre del empleado: ");
                        String documentox = JOptionPane.showInputDialog(null,
                                "Tipo de Documento (DUI/NIT):");
                        double salario = Integer.parseInt(JOptionPane.showInputDialog(null,
                                "Salario a pagar: "));
                        if (documentox.equals("DUI")||documentox.equals("dui")||documentox.equals("Dui")){
                            int numeroDocumento = Integer.parseInt(JOptionPane.showInputDialog(null,
                                    "Número de DUI del empleado: "));
                        }else{
                            JOptionPane.showInputDialog(null,
                                    "Número de NIT del empleado: ");
                            documento.add(new Documento(nombre, numero));

                        }
                        unaEmpresa.addEmpleado(new PlazaFija(nombre, puesto, Salario, extension));

                    }


                    break;
                case 2:
                    String eliminar = JOptionPane.showInputDialog(null, "Ingrese el nombre del empleado a eliminar: ");
                    if(eliminar.equals(unaEmpresa.getNombre())){
                        unaEmpresa.quitEmpleado(unaEmpresa.getNombre());
                    }
                    else{
                        JOptionPane.showMessageDialog(null, "No se encontro el nombre del empleado",
                                "                                        ¡ERROR!", JOptionPane.ERROR_MESSAGE);
                    }

                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, unaEmpresa.getPlanilla());
                    break;
                case 4:
                    break;
                case 5:

                    break;
                case 6:
                    return;
                default:
                    JOptionPane.showMessageDialog(null,
                            "Opción incorrecta, inténtelo nuevamente",
                            "                                        ¡ERROR!", JOptionPane.ERROR_MESSAGE);

                    break;
            }
        }while(op != 0);
    }

    static String menu() {
        return "                    ~Bienvenidos~" +
                "\n1) Agregar empleado" +
                "\n2) Despedir empleado" +
                "\n3) Ver lista de empleado" +
                "\n4) Calcular sueldo" +
                "\n5) Mostar totales" +
                "\n6) Salir";
    }

}
