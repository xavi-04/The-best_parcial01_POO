package com.XAQC.x00048219;

import java.util.ArrayList;

    abstract class Empleado {
        private String nombre;
        private String puesto;
        public double Salario;
        private ArrayList<Documento> documentos = new ArrayList<Documento>();

        public Empleado(String nombre, String puesto, double Salario) {
            this.nombre = nombre;
            this.puesto = puesto;
            this.Salario = Salario;
        }

        public String getNombre() {
            return nombre;
        }

        public String getPuesto() {
            return puesto;
        }

        public ArrayList<Documento> getDocumentos() {
            return documentos;
        }

        public void addDocumento(Documento documentox){
            documentos.add(documentox);

        }



        public void removeDocumento(String nombre){
            documentos.remove(nombre);
        }

        public double getSalario() {
            return Salario;
        }

        public void setSalario(double salario) {
            Salario = salario;
        }
    }

