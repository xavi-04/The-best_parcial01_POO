package com.XAQC.x00048219;

import java.util.ArrayList;

public class Empresa {
    private String nombre;
    private ArrayList<Empleado> planilla = new ArrayList<Empleado>();

    public Empresa(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public ArrayList<Empleado> getPlanilla() {
        return planilla;
    }

    public void addEmpleado(Empleado empleado){
        planilla.add(empleado);
    }

    public void quitEmpleado(String despedir){
        planilla.remove(despedir);
    }





}
