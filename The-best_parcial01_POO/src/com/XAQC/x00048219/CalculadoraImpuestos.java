package com.XAQC.x00048219;

 public final class CalculadoraImpuestos {

    private static double totalRenta, totalISSS, totalAFP;

    private CalculadoraImpuestos(){

    }
    public static double calcularPago(Empleado){

        if (){
            totalRenta = (0.1 * Salario);

            pagoEmpleado = (Salario - totalRenta);
        }else {
            totalAFP = (0.0625 * Salario);
            totalISSS = (0.03 * Salario);

            restante = (Salario - totalISSS- totalAFP);

            totalRenta = 0;
            totalRenta = (0.1 * (restante - 472) + 17.67);
            totalRenta = (0.2 * (restante - 895.24) + 60);
            totalRenta = (0.3 * (restante- 2038.10) + 288.57);


            pagoEmpleado = (restante - totalRenta);
        }



   }

    public static String mostrarTotales() {

    }

 }

        //Rango A: [$ 0.01, $ 472.00]
        //Rango B: [$ 472.00, $ 895.24]
        //Rango C: [$ 895.24, $ 2,038.11]
        //Rango D: [$ 2,038.11 o más]