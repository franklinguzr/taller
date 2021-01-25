package com.udea.tallerback.model;

import com.sun.istack.NotNull;

import javax.persistence.*;

@Entity
@Table(name="repuestos")
public class Repuesto {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idRepuesto;
    private String nombreRepuesto;
    private String costoRepuesto;

    public Repuesto(int idRepuesto, String nombreRepuesto, String costoRepuesto, int reparacionRepuesto) {
        this.idRepuesto = idRepuesto;
        this.nombreRepuesto = nombreRepuesto;
        this.costoRepuesto = costoRepuesto;
        this.reparacionRepuesto = reparacionRepuesto;
    }

    public Repuesto() {
    }

    @NotNull
    private int reparacionRepuesto;

    public int getIdRepuesto() {
        return idRepuesto;
    }

    public void setIdRepuesto(int idRepuesto) {
        this.idRepuesto = idRepuesto;
    }

    public String getNombreRepuesto() {
        return nombreRepuesto;
    }

    public void setNombreRepuesto(String nombreRepuesto) {
        this.nombreRepuesto = nombreRepuesto;
    }

    public String getCostoRepuesto() {
        return costoRepuesto;
    }

    public void setCostoRepuesto(String costoRepuesto) {
        this.costoRepuesto = costoRepuesto;
    }

    public int getReparacionRepuesto() {
        return reparacionRepuesto;
    }

    public void setReparacionRepuesto(int reparacionRepuesto) {
        this.reparacionRepuesto = reparacionRepuesto;
    }
}
