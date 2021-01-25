package com.udea.tallerback.model;

import com.sun.istack.NotNull;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="costos")
public class Costo {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idCosto;
    @NotNull
    private int idRepuesto;
    private int costoRepuesto;
    private Date fechaInicioCosto;
    private Date fechaFinCosto;
    @NotNull
    private int idReparacion;

    public Costo() {
    }

    public Costo(int idCosto, int idRepuesto, int costoRepuesto, Date fechaInicioCosto, Date fechaFinCosto, int idReparacion) {
        this.idCosto = idCosto;
        this.idRepuesto = idRepuesto;
        this.costoRepuesto = costoRepuesto;
        this.fechaInicioCosto = fechaInicioCosto;
        this.fechaFinCosto = fechaFinCosto;
        this.idReparacion = idReparacion;
    }

    public int getIdCosto() {
        return idCosto;
    }

    public void setIdCosto(int idCosto) {
        this.idCosto = idCosto;
    }

    public int getIdRepuesto() {
        return idRepuesto;
    }

    public void setIdRepuesto(int idRepuesto) {
        this.idRepuesto = idRepuesto;
    }

    public int getCostoRepuesto() {
        return costoRepuesto;
    }

    public void setCostoRepuesto(int costoRepuesto) {
        this.costoRepuesto = costoRepuesto;
    }

    public Date getFechaInicioCosto() {
        return fechaInicioCosto;
    }

    public void setFechaInicioCosto(Date fechaInicioCosto) {
        this.fechaInicioCosto = fechaInicioCosto;
    }

    public Date getFechaFinCosto() {
        return fechaFinCosto;
    }

    public void setFechaFinCosto(Date fechaFinCosto) {
        this.fechaFinCosto = fechaFinCosto;
    }

    public int getIdReparacion() {
        return idReparacion;
    }

    public void setIdReparacion(int idReparacion) {
        this.idReparacion = idReparacion;
    }
}
